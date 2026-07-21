package com.telsuko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCAllOperations {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbclearning";
        String user = "root";
        String password = "root";

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        try {

            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Database Connected Successfully!");

            // 3. Create Statement
            st = con.createStatement();

            // =====================================================
            // INSERT OPERATION
            // =====================================================

            System.out.println("\n========== INSERT OPERATION ==========");

            String insertSql =
                    "INSERT INTO studentinfo VALUES(1,'Rohan',21,'Bengaluru')";

            int insertRows = st.executeUpdate(insertSql);

            if (insertRows > 0)
                System.out.println("✅ Data Inserted Successfully!");
            else
                System.out.println("❌ Insert Failed!");

            // =====================================================
            // UPDATE OPERATION
            // =====================================================

            System.out.println("\n========== UPDATE OPERATION ==========");

            String updateSql =
                    "UPDATE studentinfo SET sage=22 WHERE id=1";

            int updateRows = st.executeUpdate(updateSql);

            if (updateRows > 0)
                System.out.println("✅ Data Updated Successfully!");
            else
                System.out.println("❌ Update Failed!");

            // =====================================================
            // SELECT OPERATION
            // =====================================================

            System.out.println("\n========== SELECT OPERATION ==========");

            String selectSql = "SELECT * FROM studentinfo";

            rs = st.executeQuery(selectSql);

            System.out.println("-------------------------------------------");
            System.out.println("ID\tNAME\tAGE\tCITY");
            System.out.println("-------------------------------------------");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("sname");
                int age = rs.getInt("sage");
                String city = rs.getString("scity");

                System.out.println(id + "\t" + name + "\t" + age + "\t" + city);
            }

            rs.close();

            // =====================================================
            // execute() METHOD
            // =====================================================

            System.out.println("\n========== execute() METHOD ==========");

            String anySql = "SELECT * FROM studentinfo";

            boolean status = st.execute(anySql);

            if (status) {

                System.out.println("✅ execute() detected a SELECT query.");

                ResultSet rs2 = st.getResultSet();

                while (rs2.next()) {

                    System.out.println(
                            rs2.getInt(1) + " | " +
                            rs2.getString(2) + " | " +
                            rs2.getInt(3) + " | " +
                            rs2.getString(4));
                }

                rs2.close();

            } else {

                System.out.println("✅ execute() detected a DML query.");

                int rows = st.getUpdateCount();

                System.out.println("Rows Affected : " + rows);
            }

            // =====================================================
            // DELETE OPERATION
            // =====================================================

            System.out.println("\n========== DELETE OPERATION ==========");

            String deleteSql =
                    "DELETE FROM studentinfo WHERE id=1";

            int deleteRows = st.executeUpdate(deleteSql);

            if (deleteRows > 0)
                System.out.println("✅ Record Deleted Successfully!");
            else
                System.out.println("❌ Delete Failed!");

        }
        catch (ClassNotFoundException e) {

            System.out.println("Driver Not Found!");
            e.printStackTrace();

        }
        catch (SQLException e) {

            System.out.println("Database Error!");
            e.printStackTrace();

        }
        finally {

            try {

                if (rs != null)
                    rs.close();

                if (st != null)
                    st.close();

                if (con != null)
                    con.close();

                System.out.println("\n🔒 All Resources Closed");

            }
            catch (SQLException e) {

                System.out.println("Error while closing resources.");
                e.printStackTrace();
            }
        }
    }
}