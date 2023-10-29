package connect;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class ConnectTutorial {
    private static String Db_Url="jdbc:postgresql://localhost:5432/pratise_db?user=postgres&password=postgres";
    public static void main(String[] args) throws SQLException {

    }
    public static void Task1() throws SQLException {
        Connection connection= DriverManager.getConnection(Db_Url);
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("SELECT *FROM public.departments as d INNER JOIN public.locations as l on d.location_id=l.location_id ");
        while(resultSet.next()){
            System.out.print(resultSet.getInt("department_id"));
            System.out.print(resultSet.getString("department_name"));
            System.out.println(resultSet.getInt("location_id"));
            System.out.println("---------------------------------------");
        }
    }
    public static void Task2() throws SQLException {
       Connection con=DriverManager.getConnection(Db_Url);
       PreparedStatement pr=con.prepareStatement("INSERT INTO public.employees(employee_id,first_name,last_name,email,phone_number,hire_date" +
               ",job_id,salary,manager_id,department_id) values(?,?,?,?,?,?,?,?,?,?)");
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter emp_id");
        int emp_id=sc.nextInt();
        System.out.println("Enter first_name");
        String first_Name=sc.next();
        System.out.println("Enter last_Name");
        String last_Name=sc.next();
        System.out.println("Enter email");
        String email=sc.next();
        System.out.println("Enter phone_Number");
        String phone_Number=sc.next();
        System.out.println("Enter hire_Date Enter year month day");
        LocalDate localDate=LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("Enter job_id");
        int job_id=sc.nextInt();
        System.out.println("Enter salary");
        double salary=sc.nextDouble();
        System.out.println("Enter manager_id");
        int manager_id=sc.nextInt();
        System.out.println("Enter dep_id");
        int dep_id=sc.nextInt();








    }

}
