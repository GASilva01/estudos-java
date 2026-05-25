package application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "UPDATE seller "
                    + "SET BaseSalary = Basesalary + ? "
                    + "WHERE "
                    + "(DepartmentId = ?)");

            st.setDouble(1, 200.0);
            st.setInt(2,2);

            int linhasAfetadas = st.executeUpdate();

            System.out.println("Done! Linhas afetadas: " + linhasAfetadas);

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }





    }
}
