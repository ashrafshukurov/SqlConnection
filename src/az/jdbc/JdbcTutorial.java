package az.jdbc;

import java.sql.*;
import java.util.Scanner;


public class JdbcTutorial {
    private static final String db_url = "jdbc:postgresql://localhost:5432/pratise_db?user=postgres&password=postgres";
    public static void main(String[] args) throws SQLException {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Task1" +
                "\n2.Task2" +
                "\n3.Task3" +
                "\n4.Task4" +
                "\n5.Task5");
        System.out.println("write Task-n to start");
        Tasks tasks=Tasks.valueOf(sc.next());
        switch (tasks) {
            case TASK1:
                GettingDepartments.Task1(db_url);
                break;
            case TASK2:
                AddingEmployee.Task2(db_url);
                break;
            case TASK3:
                AddingDepartments.Task3(db_url);
                break;
            case TASK4:
                UpdateEmpId.Task4(db_url);
                break;
            case TASK5:
                DeleteByEmpId.Task5(db_url);

        }

    }
}
