package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Main {
    static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Connection conn = null;
        PreparedStatement st = null;
        try {
            conn = DB.getConnection();
            /*
            st = conn.prepareStatement(         //Adicionando vendedores
                    "INSERT INTO seller "
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Gabriel Alves");
            st.setString(2, "gabriel@gmail.com");
            st.setDate(3, new java.sql.Date(sdf.parse("27/12/2001").getTime()));
            st.setDouble(4, 2600.00);
            st.setInt(5, 4);

             */

            st = conn.prepareStatement(
                    "insert into department (Name) values ('D1'),('D2')", //Adicionando departamentos
                    Statement.RETURN_GENERATED_KEYS);

            int linhasAlteradas = st.executeUpdate();

            if (linhasAlteradas > 0){
                System.out.println("Done! Linhas alteradas: " + linhasAlteradas);
                ResultSet rs = st.getGeneratedKeys();
                while (rs.next()){
                    int id = rs.getInt(1);
                    System.out.println("Done! Id = " + id);
                }
            }
            else{
                System.out.println("Sem linhas alteradas.");
            }
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
