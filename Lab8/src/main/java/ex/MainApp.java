package ex;
import java.sql.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {

    public static void AdaugaPersoana(Connection connection) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti id-ul persoanei:");
        int id = scanner.nextInt();
        System.out.println("Introduceti numele persoanei:");
        String nume = scanner.nextLine();
        System.out.println("Introduceti varsta persoanei:");
        int varsta = scanner.nextInt();
        String sql = "insert into persoane(id, nume, varsta) VALUES (" +id+"  ,'" + nume + "', " + varsta + ")";
       try (PreparedStatement ps=connection.prepareStatement(sql)) {
           ps.setInt(1,id);
           ps.setString(2,nume);
           ps.setInt(3,varsta);

       }
        catch(SQLException e){
            System.out.println(sql);
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost:3306/lab8";
        Connection connection = DriverManager.getConnection(url, "root", "root");
        Statement statement = connection.createStatement();
        Scanner scanner = new Scanner(System.in);

        int opt= 0;

        while (opt != 0) {
            System.out.println("Introduceti optiunea dorita:");
            System.out.println("1. Adaugare persoana");
            System.out.println("2. Adaugare excursie");
            System.out.println("3. Afisarea tuturor persoanelor şi pentru fiecare persoană a excursiilor în care a fost ");
            System.out.println("4. Afișarea excursiilor în care a fost o persoană al cărei nume se citește de la tastatură ");
            System.out.println("5. Afișarea tuturor persoanelor care au vizitat o anumita destinație. ");
            System.out.println("6. Afișarea persoanelor care au făcut excursii într-un an introdus");
            System.out.println("7. Ștergerea unei excursii");
            System.out.println("8. Ștergerea unei persoane (împreună cu excursiile în care a fost) ");
            System.out.println("0. Iesire");

            opt = scanner.nextInt();

            switch (opt) {
                case 1:
                    AdaugaPersoana(connection);
                    break;
                case 2:
                    System.out.println("Option 2 selected");
                    break;
                case 3:
                    System.out.println("Exiting menu");
                    break;
                case 4:
                    System.out.println("Exiting menu");
                    break;
                case 5:
                    System.out.println("Exiting menu");
                    break;
                case 6:
                    System.out.println("Exiting menu");
                    break;
                case 7:
                    System.out.println("Exiting menu");
                    break;
                case 8:
                    System.out.println("Exiting menu");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

        scanner.close();
        statement.close();
        connection.close();

    }
}
