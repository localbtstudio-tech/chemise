public class Chemise {

    private int id;
    private double prix;
    private String couleur;
    private String description;
    private int quantite;

    
    public Chemise(int id, double prix, String couleur, int quantite) {
        this.id = id;
        this.prix = prix;
        this.couleur = couleur;
        this.quantite = quantite;
    }

    
    public void ajouteruneChemiseDansLeStock() {
        quantite++;
    }

    
    public void diminuerUneChemiseDuStock() {
        if (quantite > 0) {
            quantite--;
        }
    }

    
    public void afficherInfosChemise() {
        System.out.println("Id : " + id);
        System.out.println("Prix: " + prix + "$");
        System.out.println("Couleur: " + couleur);
        System.out.println("Quantite: " + quantite);
    }
}
