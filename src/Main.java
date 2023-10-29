import java.sql.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {





//        selectQuery("SELECT*FROM public.details");
//        selectQuery("SELECT *FROM public.company");
//      insertValue("INSERT INTO public.company values('Google',178234,'America',222000000000)," +
//                "('Microsoft',221000,'Redmond, Washington',150000000000000),('Tesla',99290,'Fremont, California',443232322322)");
//      updateTable("UPDATE public.company SET company_name='BP' WHERE company_name='Google'");
//      truncate("truncate table public.company");
//          delete("DELETE FROM public.company WHERE company_name='BP'");
//             createTable("CREATE TABLE public.demo( ID INT,NAME VARCHAR(20))");
             insertValue("INSERT INTO public.demo values(1,'Asim'),(2,'Kamil'),(3,'Elvin'),(4,'Kenan')");
             selectQuery("SELECT * FROM public.demo");
             alterTable("ALTER TABLE public.demo ADD COLUMN Surname VARCHAR(25)");

    }

    public static Connection connection() throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
        return con;
    }

    public static void selectQuery(String query) throws ClassNotFoundException,SQLException{
        Connection connection=connection();
        Statement statement=connection.createStatement();
        ResultSet rs=statement.executeQuery(query);
        while(rs.next()){
            System.out.println(rs.getInt(1)+":"+rs.getString(2));

        }
        connection.close();
    }
    public static void updateTable(String query)throws ClassNotFoundException,SQLException{
        Connection connection=connection();
        Statement statement=connection.createStatement();
        int rs2=statement.executeUpdate(query);//Pojo class bean onun obyektidir
//cuscate on delete sql

    }
    public static void insertValue(String query) throws ClassNotFoundException,SQLException {
        Connection con=connection();
        Statement st=con.createStatement();
        int res= st.executeUpdate(query);
    }
    public static void truncate(String query) throws ClassNotFoundException,SQLException{
        Connection con=connection();
        Statement statement=con.createStatement();
        int resultSet=statement.executeUpdate(query);
    }
    public static void delete(String query) throws ClassNotFoundException,SQLException{
       Connection con=connection();
        Statement statement=con.createStatement();
        int resultSet=statement.executeUpdate(query);
    }
    public static void alterTable(String query) throws ClassNotFoundException,SQLException{
        Connection con=connection();
        Statement statement=con.createStatement();
        int resultSet=statement.executeUpdate(query);
    }
    public static void createTable(String query)throws  ClassNotFoundException,SQLException{
            Connection con=connection();
            Statement statement=con.createStatement();
            int n=statement.executeUpdate(query);
    }
    public static void demo() throws ClassNotFoundException,SQLException{
        Properties properties=new Properties();
        properties.put("User","root");
        properties.put("Password","root");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306",properties);
    }
}