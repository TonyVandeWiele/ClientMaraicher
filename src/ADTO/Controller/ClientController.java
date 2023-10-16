package ADTO.Controller;

import ADTO.Model.ClientModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientController implements ActionListener {

    private  ClientModel _client;
    private String _requete;

    public ClientController(ClientModel client) {

        _client = client;
    }

    public void actionPerformed(ActionEvent e)
    {
        // Bouton Login
        if("LOGIN".equals(e.getActionCommand()))
        {
            JOptionPane.showMessageDialog(null,"Bouton Login cliqué");
        }
        // Bouton Logout
        else if("LOGOUT".equals(e.getActionCommand()))
        {
            JOptionPane.showMessageDialog(null,"Bouton Logout cliqué");
        }
        // Bouton Acheter
        else if("ACHETER".equals(e.getActionCommand()))
        {
            JOptionPane.showMessageDialog(null,"Bouton Acheter cliqué");
        }
        // Bouton Confirmer Achat
        else if("CONFIRMER ACHAT".equals(e.getActionCommand()))
        {
            JOptionPane.showMessageDialog(null,"Bouton Confirmer Achat cliqué");
        }
        // Bouton Supprimer Article
        else if("SUPPRIMER ARTICLE".equals(e.getActionCommand()))
        {
            JOptionPane.showMessageDialog(null,"Bouton Supprimer Article cliqué");
        }
        // Bouton Vider le Panier
        else if("VIDER LE PANIER".equals(e.getActionCommand()))
        {
            JOptionPane.showMessageDialog(null,"Bouton Vider le Panier cliqué");
        }
        // Bouton Previous Article
        else if("PREVIOUS ARTICLE".equals(e.getActionCommand()))
        {
            JOptionPane.showMessageDialog(null,"Bouton Previous Article cliqué");
        }
        // Bouton Next Article
        else if("NEXT ARTICLE".equals(e.getActionCommand()))
        {
            JOptionPane.showMessageDialog(null,"Bouton Next Article cliqué");
        }
        // Bouton Nouveau Client
        else if("NOUVEAU CLIENT".equals(e.getActionCommand()))
        {
            JOptionPane.showMessageDialog(null,"Bouton Nouveau Client cliqué");
        }
        // Bouton Acheter
        else if("ACHETER".equals(e.getActionCommand()))
        {
            JOptionPane.showMessageDialog(null,"Bouton Acheter cliqué");
        }
    }
}
