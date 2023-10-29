package az.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmpId {
    public static void Task4(String url) throws SQLException {
        Scanner sc = new Scanner(System.in);
        try (Connection con = DriverManager.getConnection(url)) {
            PreparedStatement pst = con.prepareStatement("Update public.employees  SET first_name=? Where employee_id=?");
            System.out.println("Enter Id which you want to update");
            int id = sc.nextInt();
            System.out.println("Enter name");
            String changeable_name = sc.next();
            Employee employee = new Employee.Builder().setFirst_name(changeable_name).setEmp_id(id).build();
            pst.setString(1, employee.getFirst_name());
            pst.setInt(2,employee.getEmp_id());
            pst.execute();

        }
    }
}
