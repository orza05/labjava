package ex_curs;
import java.sql.*;

public class MainAppp {
    /*public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/test";
        String sql ="select * from persoanee";
        Connection connection= DriverManager.getConnection(url, "root", "root");
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next())
            System.out.println("id=" + rs.getInt("Id") + ", nume= "
                    + rs.getString("nume") + ",varsta=" + rs.getInt("varsta"));
        connection.close();
        statement.close();
        rs.close();
    }*/

    /*public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String sql="select * from persoanee where nume=? and varsta<?";
        try {
            Connection connection = DriverManager.getConnection (url, "root", "root");
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setString(1, "Vladut");
            ps.setInt(2, 18);
            ResultSet rs = ps.executeQuery();
            while (rs.next())
                System.out.println("id="+rs.getInt(1)+", nume= " + rs.getString(2)
                        + ", varsta="+rs.getInt(3));
            connection.close();
            ps.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }*/
    public static void afisare_tabela(Statement statement, String mesaj) {
        String sql ="select * from persoanee";
        System.out.println("\n---" +mesaj +"---");
        try(ResultSet rs =statement.executeQuery(sql)) {
            while (rs.next())
                System.out.println("id=" + rs.getInt(1) + ", nume=" + rs.getString(2) + ",varsta="
                        + rs.getInt(3));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void adaugarePers(Connection connection, String nume, int varsta) {
        String sql="insert into persoanee(nume, varsta) values (?,?)";
        try(PreparedStatement ps=connection.prepareStatement(sql)) {
            ps.setString(1, nume);
            ps.setInt(2, varsta);
            int nr_randuri=ps.executeUpdate();
            System.out.println("\nNumar randuri afectate de adaugare="+nr_randuri);
        } catch (SQLException e) {
            System.out.println(sql);
            e.printStackTrace();
        }
    }

    public static void adaugare_excursie(Connection connection, int id_pers, String destinatia, int anul) {
        String sql="select *from persoanee where id=?";
        try(PreparedStatement selectStatement=connection.prepareStatement(sql)) {
            selectStatement.setInt(1,id_pers);
            ResultSet rs=selectStatement.executeQuery();
            if(rs.next()){
                String insertQuery="insert into excursiii(id_persoana,destinatia,anul) values(?,?,?)";

            }
            //int nr_randuri=ps.executeUpdate();
           // System.out.println("\nNumar randuri afectate de adaugare="+nr_randuri);
        } catch (SQLException e) {
            System.out.println(sql);
            e.printStackTrace();
        }
    }
    public static void actualizare(Connection connection,int id,int varsta){
        String sql="update persoanee set varsta=? where id=?";
        try(PreparedStatement ps=connection.prepareStatement(sql)) {
            ps.setInt(1, varsta);
            ps.setInt(2, id);
            int nr_randuri=ps.executeUpdate();
            System.out.println("\nNumar randuri afectate de modificare="+nr_randuri);
        } catch (SQLException e) {
            System.out.println(sql);
            e.printStackTrace();
        }
    }
    public static void adaugare(Connection connection, int id, String nume, int varsta) {
        String sql="insert into persoanee values (?,?,?)";
        try(PreparedStatement ps=connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.setString(2, nume);
            ps.setInt(3, varsta);
            int nr_randuri=ps.executeUpdate();
            System.out.println("\nNumar randuri afectate de adaugare="+nr_randuri);
        } catch (SQLException e) {
            System.out.println(sql);
            e.printStackTrace();
        }
    }
    public static void stergere(Connection connection,int id){
        String sql="delete from persoanee where id=?";
        try(PreparedStatement ps=connection.prepareStatement(sql)) {
            ps.setInt(1, id);
            int nr_randuri=ps.executeUpdate();
            System.out.println("\nNumar randuri afectate de modificare="+nr_randuri);
        }
        catch (SQLException e) {
            System.out.println(sql);
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        try {
            Connection connection = DriverManager.getConnection(url, "root", "root");
            Statement statement = connection.createStatement();

            afisare_tabela(statement,"Continut initial");

            adaugare(connection,4,"Dana",23);
            afisare_tabela(statement,"Dupa adaugare");

            System.out.println("Adaugare persoana");
            adaugarePers(connection,"Bianca",45);
            afisare_tabela(statement,"Dupa adaugare");

            actualizare(connection,4,24);
            afisare_tabela(statement,"Dupa modificare");

            stergere(connection,4);
            afisare_tabela(statement,"Dupa stergere");

            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }

