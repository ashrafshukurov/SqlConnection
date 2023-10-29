package az.jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class AddingEmployee {
    public static void Task2(String url) throws SQLException {
        Scanner sc = new Scanner(System.in);
        try (Connection con = DriverManager.getConnection(url)) {
            PreparedStatement pr = con.prepareStatement("insert into public.employees(email,employee_id,first_name,last_name,phone_number" +
                    ",hire_date,job_id,salary,manager_id,department_id) values (?,?,?,?,?,?,?,?,?,?)");
            System.out.println("Enter email:");
            String email = sc.next();
            System.out.println("Enter id:");
            int emp_id = sc.nextInt();
            System.out.println("Enter name:");
            String name = sc.next();
            System.out.println("Enter last_name:");
            String last_name = sc.next();
            System.out.println("Enter phone_number:");
            String phone_number = sc.next();
            System.out.println("Enter year,month,day");
            LocalDate localDate = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
            System.out.println("Enter job_id");
            int job_id = sc.nextInt();
            System.out.println("Enter salary:");
            double salary = sc.nextDouble();
            System.out.println("Enter man_id");
            int manager_id = sc.nextInt();
            System.out.println("Enter dep_id");
            int department_id = sc.nextInt();

            Employee employee = new Employee.Builder().setEmail(email)
                    .setEmp_id(emp_id).setFirst_name(name).setLast_name(last_name)
                    .setPhone_number(phone_number).setHire_date(localDate).setJob_id(job_id)
                    .setSalary(salary).setManager_id(manager_id).setDepartment_id(department_id).build();

            pr.setString(1, employee.getEmail());
            pr.setInt(2, employee.getEmp_id());
            pr.setString(3, employee.getFirst_name());
            pr.setString(4, employee.getLast_name());
            pr.setString(5, employee.getPhone_number());
            pr.setDate(6, Date.valueOf(employee.getHire_date()));
            pr.setInt(7, employee.getJob_id());
            pr.setDouble(8, employee.getSalary());
            pr.setInt(9, employee.getManager_id());
            pr.setInt(10, employee.getDepartment_id());
            pr.execute();
        }
    }
}
