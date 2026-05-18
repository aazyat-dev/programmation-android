// Fichier : Contact.java
public class Contact {
    private String nom;
    private String telephone;

    // Constructeur pour créer un contact facilement
    public Contact(String nom, String telephone) {
        this.nom = nom;
        this.telephone = telephone;
    }

    // Getters pour récupérer les informations dans l'Adapter plus tard
    public String getNom() { return nom; }
    public String getTelephone() { return telephone; }
}
