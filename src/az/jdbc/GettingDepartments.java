package az.jdbc;

import java.sql.*;

public class GettingDepartments {
    public static void Task1(String url) throws SQLException {
        try (Connection con = DriverManager.getConnection(url)) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select*from public.departments as d FULL OUTER JOIN public.locations as l on d.location_id=l.location_id");
            while (rs.next()) {
                System.out.println("Department name:" + rs.getString("department_name"));
                System.out.println("Department id:" + rs.getInt("department_id"));
                System.out.println("location id:" + rs.getInt("location_id"));
                System.out.println("street address:" + rs.getString("street_address"));
                System.out.println("postal code:" + rs.getString("postal_code"));
                System.out.println("city:" + rs.getString("city"));
                System.out.println("state province:" + rs.getString("state_province"));
                System.out.println("country id:" + rs.getString("country_id"));
                System.out.println("------------------------------------------------------");
            }

        }
    }
}
