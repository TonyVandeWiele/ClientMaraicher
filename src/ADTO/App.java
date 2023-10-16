package ADTO;

import ADTO.Infrastructure.ConnectionFactory;
import ADTO.Model.ClientModel;
import ADTO.View.MainFrame;
import ADTO.Controller.ClientController;

import java.net.Socket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class App {

    private static ClientModel client;

    // LAUNCHER DE L'APPLICATION

    public static void main(String[] args) {

        Socket socket;
        System.out.println("Lancement de l'application");

        // Création du client
        client = new ClientModel();

        // Connexion au serveur
        socket = client.ConnexionToServer("192.168.175.128",50000);
        System.out.println("Connexion au serveur réussie");



        // Connexion à la base de données
        new ConnectionFactory("com.mysql.cj.jdbc.Driver","PassStudent1_","Student","jdbc:mysql://192.168.175.128:3306/PourStudent");
        Connection con = ConnectionFactory.createConnection();
        System.out.println("Connexion à la base de données réussie");

        // Test avec une requête
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM articles");
            while (rs.next())
                for(int i=1;i<=rs.getMetaData().getColumnCount();i++)
                    System.out.println(rs.getString(i));
        } catch (Exception e) {
            System.out.println(e);
        }

        // Création du controller
        ClientController clientController = new ClientController(client);

        // Création de la fenêtre
        new MainFrame(socket,con,clientController);
    }
}
