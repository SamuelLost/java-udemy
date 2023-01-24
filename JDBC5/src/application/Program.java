package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbExeception;

public class Program {
    public static void main(String[] args) {
        
        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false); // Desabilita o auto commit

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

            // int x = 1;
            // if (x < 2) {
            //     throw new SQLException("Fake error");
            // }
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit(); // Confirma a transação
            // As modificações só acontecem se forem todas de uma vez e se não houver erro

            System.out.println("Done! Rows affected: " + rows1);
            System.out.println("Done! Rows affected: " + rows2);
            
        } catch (SQLException e) {
            try {
                conn.rollback(); // Desfaz as alterações e permite que o banco volte ao estado anterior
                throw new DbExeception("Transaction rolled back! Caused by: " + e.getMessage());
            } catch (SQLException e1) {
                throw new DbExeception("Error trying to rollback! Caused by: " + e1.getMessage());
            }
        } finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
        
    }
}
