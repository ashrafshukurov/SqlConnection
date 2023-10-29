package az.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddingDepartments {
    public static void Task3(String url) throws SQLException {
        Scanner sc=new Scanner(System.in);
        try(Connection con= DriverManager.getConnection(url)){
            Statement st=con.createStatement();
            List<Integer> list=new ArrayList<>();
            ResultSet resultSet=st.executeQuery("Select location_id from public.locations where country_id='US'");
            while(resultSet.next()){
                list.add(resultSet.getInt("location_id"));
            }
            PreparedStatement pr=con.prepareStatement("INSERT INTO public.departments values(?,?,?)");
            System.out.println("Enter id");
            int id=sc.nextInt();
            System.out.println("Enter department_name");
            String department_name=sc.next();
            pr.setInt(1,id);
            pr.setString(2,department_name);
            pr.setInt(3,list.get(0));
            pr.addBatch();
            System.out.println("Enter id1");
            int id1=sc.nextInt();
            System.out.println("Enter department_name 1");
            String department_name1=sc.next();
            pr.setInt(1,id1);
            pr.setString(2,department_name1);
            pr.setInt(3,list.get(1));
            pr.addBatch();
            pr.executeBatch();

        }
    }
}
