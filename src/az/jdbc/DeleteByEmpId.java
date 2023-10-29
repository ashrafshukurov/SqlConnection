package az.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteByEmpId {
    public static void Task5(String url) throws SQLException {
        Scanner sc=new Scanner(System.in);
        try(Connection con= DriverManager.getConnection(url)){
            PreparedStatement prst=con.prepareStatement("DELETE FROM public.employees WHERE employee_id=?");
            System.out.println("Enter id which you want to delete");
            int id=sc.nextInt();
            Employee em=new Employee.Builder().setEmp_id(id).build();
            prst.setInt(1,em.getEmp_id());
            prst.execute();
        }
    }
}
