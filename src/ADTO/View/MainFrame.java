package ADTO.View;

import ADTO.Controller.ClientController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.UIManager;
import javax.swing.*;
import java.awt.*;
import com.formdev.flatlaf.FlatDarculaLaf;


public class MainFrame extends  JFrame{
    private JTextField textField1;
    private JTextField textField2;
    private JButton loginButton;
    private JButton logoutButton;
    private JCheckBox nouveauClientCheckBox;
    private JPanel ConnexionPanel;
    private JPanel MainPanel;
    private JLabel TitleLabel;
    private JPanel MagasinPanel;
    public JTextField ArticleTextField;
    private JTextField PrixUnitaireTextField;
    private JTextField StockTextField;
    private JSpinner QuantiteSpinner;
    private JButton previousArticleButton;
    private JButton nextArticleButton;
    private JPanel PublicitePanel;
    private JPanel PanierPanel;
    private JTable table;
    private JButton viderLePanierButton;
    private JButton supprimerArticleButton;
    private JButton confirmerAchatButton;
    private JTextField TotalTextField;
    private JLabel imageLabel;
    private JButton acheterButton;


    public MainFrame(Socket socket, Connection con, ClientController controller) {

        /*FlatDarculaLaf.setup();
        // Affichage de la fenêtre
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        JFrame frame = new JFrame("Le Maraicher d'abdel karim");
        frame.setContentPane(MainPanel);
        frame.setSize(new Dimension(800,500));
        frame.pack();
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(1200,800));

        // Fermeture de l'application
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Fermeture de l'application");

                try {
                    socket.close();
                    System.out.printf("Socket fermée\n");
                    con.close();
                    System.out.println("Connexion à la base de données fermée");
                } catch (IOException | SQLException ex) {
                    throw new RuntimeException(ex);
                }
                System.exit(0);
            }
        });

        loginButton.setActionCommand("LOGIN"); // Attribuer une commande au bouton
        addLoginListener(controller);

        logoutButton.setActionCommand("LOGOUT"); // Attribuer une commande au bouton
        addLogoutListener(controller);

        acheterButton.setActionCommand("ACHETER"); // Attribuer une commande au bouton
        addAcheterListener(controller);

        confirmerAchatButton.setActionCommand("CONFIRMER ACHAT"); // Attribuer une commande au bouton
        addConfirmerAchatListener(controller);

        supprimerArticleButton.setActionCommand("SUPPRIMER ARTICLE"); // Attribuer une commande au bouton
        addSupprimerArticleListener(controller);

        viderLePanierButton.setActionCommand("VIDER LE PANIER"); // Attribuer une commande au bouton
        addViderLePanierListener(controller);

        previousArticleButton.setActionCommand("PREVIOUS ARTICLE"); // Attribuer une commande au bouton
        addPreviousArticleListener(controller);

        nextArticleButton.setActionCommand("NEXT ARTICLE"); // Attribuer une commande au bouton
        addNextArticleListener(controller);
    }

    public void addLoginListener(ClientController controller){
        loginButton.addActionListener(controller);
    }

    public void addLogoutListener(ClientController controller){
        logoutButton.addActionListener(controller);
    }

    public void addAcheterListener(ClientController controller){
        acheterButton.addActionListener(controller);
    }

    public void addConfirmerAchatListener(ClientController controller){
        confirmerAchatButton.addActionListener(controller);
    }

    public void addSupprimerArticleListener(ClientController controller){
        supprimerArticleButton.addActionListener(controller);
    }

    public void addViderLePanierListener(ClientController controller){
        viderLePanierButton.addActionListener(controller);
    }

    public void addPreviousArticleListener(ClientController controller){
        previousArticleButton.addActionListener(controller);
    }

    public void addNextArticleListener(ClientController controller){
        nextArticleButton.addActionListener(controller);
    }

    public void addNouveauClientListener(ClientController controller){
        nouveauClientCheckBox.addActionListener(controller);
    }


}
