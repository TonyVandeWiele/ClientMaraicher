package ADTO.Model;

import java.io.*;

import java.net.*;

public class ClientModel {

    // Variables membres de la classe
    private String nom;
    private String motDePasse;

    // Constructeur
    public ClientModel()
    {

    }

    // Méthode de connexion au serveur
    public Socket ConnexionToServer(String hostIp, int port){
        // Création de la socket et connexion au serveur
        try {
            return new Socket(hostIp,port);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}