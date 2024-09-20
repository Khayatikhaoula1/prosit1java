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

    }}