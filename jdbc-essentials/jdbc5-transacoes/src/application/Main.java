package application;

import db.DB;
import db.DbException;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();

            conn.setAutoCommit(false); //As operações ficam pendentes da confirmação do dev.

            st = conn.createStatement();

            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090.0 WHERE DepartmentId = 1");
//            int x = 1;
//            if (x < 2){
//                throw new SQLException("ERRO FALSO");
//            }
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090.0 WHERE DepartmentId = 2");

            conn.commit(); //Aqui confirma a transação.

            System.out.println("rows1 " + rows1);
            System.out.println("rows2 " + rows2);
        }
        catch (SQLException e){
            try {
                conn.rollback();
                throw new DbException("Transação não concluida, rollback realizado. Causado por: " + e.getMessage());
            } catch (SQLException ex) {
                throw new DbException("Erro na tentativa de rollback. Causado por :" + ex.getMessage());
            }
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
    }
}
