package task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class example {
    private static String DB_URL="jdbc:postgresql://localhost:5432/pratise_db?user=postgres&password=postgres";
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter item_type");
        String item_type=sc.next();
        System.out.println("Enter item_price");
        double item_price=sc.nextDouble();
        System.out.println("Enter item_id");
        int item_id=sc.nextInt();
        task(item_type,item_price,item_id);


    }
    public static void task(String item_type,double item_price,int item_id) throws SQLException {
        Connection con= DriverManager.getConnection(DB_URL);
        PreparedStatement pr=con.prepareStatement("UPDATE public.items Set item_type=?,item_price=? Where item_id=?");
        pr.setString(1,item_type);
        pr.setDouble(2,item_price);
        pr.setInt(3,item_id);
        pr.execute();
    }
    
}
