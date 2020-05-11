package seleniumbasic;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) {
        //Test Data:



        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/";
        String databaseName = "EMPLOYEE";
        String username= "root";
        String password = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url+databaseName, username, password);
            String query = "Select * from student";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
        while(rs.next()){
            System.out.printf("%4s %-7s %-14s %-18s %-17s %-10s",rs.getString("student_id"),
                    rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5),
                    rs.getString(6));
            System.out.println();
        }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


/*
* System.out.println(rs.getString(1)
                    +" "+rs.getString(2)+" "+rs.getString(3)
                    +" "+rs.getString(4)+" "+rs.getString(5));*/
