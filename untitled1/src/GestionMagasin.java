import tn.tuniprob.gestionmagasin.magasin.Magasin;
import tn.tuniprob.gestionmagasin.magasin.Produit;

import java.util.ArrayList;
import java.util.List;

public class GestionMagasin {
    public static void main(String[] args) {
        List<Produit> produits = new ArrayList<>();

        produits.add(new Produit(1021, "Lait", "Delice", 0.0));
        produits.add(new Produit(2510, "Yaourt", "Vitalait", 0.0));
        produits.add(new Produit(3250, "Tomate", "Sicam", 1.200));


        for (Produit produit : produits) {
            produit.afficher();
            System.out.println();
        }
        Magasin magasin1 = new Magasin(1, "MG1", 50);
        Magasin magasin2 = new Magasin(2, "MG2", 50);

        // Ajout de produits au magasin 1
        magasin1.ajouterProduit(new Produit(1021, "Lait", "Delice", 0.7));
        magasin1.ajouterProduit(new Produit(2510, "Yaourt", "Vitalait", 1.2));
        magasin1.ajouterProduit(new Produit(3250, "Tomate", "Sicam", 1.3));

        // Ajout de produits au magasin 2
        magasin2.ajouterProduit(new Produit(1051, "Chocolat", "MARQUEPROD2", 3.0));
        magasin2.ajouterProduit(new Produit(2061, "Jus", "MARQUEPROD1", 1.5));

        magasin1.afficherMagasin();
        System.out.println();
        magasin2.afficherMagasin();

        int totalProduits = magasin1.getNombreProduits() + magasin2.getNombreProduits();
        System.out.println("\nNombre total de produits dans tous les magasins : " + totalProduits);
    }
    }