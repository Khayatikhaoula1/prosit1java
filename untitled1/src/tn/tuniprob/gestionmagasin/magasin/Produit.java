package tn.tuniprob.gestionmagasin.magasin;

import java.util.Date;

public class Produit {
          int id;
          String libelle;
          String marque;
          double prix;
          Date dateExpiration;

    public Produit() {
    }

    public Produit(int id, String libelle, String marque, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public void afficher() {
        System.out.println("ID: " + id);
        System.out.println("Libellé: " + libelle);
        System.out.println("Marque: " + marque);
        System.out.println("Prix: " + prix);
        System.out.println("Date d'expiration: " + (dateExpiration != null ? dateExpiration : "undefined"));
    }

    @Override
    public String toString() {
        return "tn.tuniprob.gestionmagasin.magasin.Produit{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }
}
