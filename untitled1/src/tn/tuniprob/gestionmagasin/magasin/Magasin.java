package tn.tuniprob.gestionmagasin.magasin;

public class Magasin {
     int id;
    private String adresse;
    private int capacite;
    private Produit[] produits;
    private int nbrProduits;

    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new Produit[capacite];
        this.nbrProduits = 0;
    }

    public boolean ajouterProduit(Produit produit) {

        if (nbrProduits < capacite) {
            produits[nbrProduits] = produit;
            nbrProduits++;
            return true;
        } else {
            System.out.println("capacité max ");
            return false;  }}


    public void afficherMagasin() {
        System.out.println("ID du magasin: " + id);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité: " + capacite);
        System.out.println("Produits dans le magasin: ");
        for (int i = 0; i < nbrProduits; i++) {
            System.out.println(produits[i].toString());
        }

    }

    // Nombre total de produits dans ce magasin
    public int getNombreProduits() {
        return nbrProduits;
    }
}
