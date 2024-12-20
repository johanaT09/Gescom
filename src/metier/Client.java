package metier;

import java.util.*;

public class Client {

    private Integer idClient;
    private String raisonSociale;
    private Double caClient;
    private Categorie categorie;

    public Integer getIdClient(){
        return this.idClient;
    }
    public void setIdClient(Integer idClient){
        this.idClient = idClient;
    }


    public String getRaisonSociale(){
        return this.raisonSociale;
    }
    public void setRaisonSociale(String raisonSociale){
        this.raisonSociale = raisonSociale;
    }

    public Double getCaClient(){
        return this.caClient;
    }
    public void setCaClient(Double caClient){
        this.caClient = caClient;
    }

    public Categorie getCategorie(){
        return this.categorie;
    }
    public void setCategorie(Categorie categorie){
        this.categorie=categorie;
    }

    
    public Client(int idClient, String raisonSociale, Categorie uneCategorie) {
        setIdClient(idClient);
        setRaisonSociale(raisonSociale);
        setCategorie(uneCategorie);
    }

    /**
     * Ajoute une commande à la liste des commandes
     * du client. Prendre la précaution de vérifier
     * que la liste a bien été instanciée
     * @param uneCommande 
     */
    public void ajouterCommande(Commande uneCommande) {
        if (getLesCommandes() == null){
            setLesCommandes(new ArrayList<Commande>());
        }
        if (!getLesCommandes().contains(uneCommande)) {
            this.lesCommandes.add(uneCommande);
        }
    }

    /**
     * Affecte la somme des valorisations des commandes
     * au CA du client. Prendre la précaution de 
     * l'initialiser avant de commencer
     */
    public void cumulCA() {
        /* A compléter */
    }

    /**
     * Recherche une commande sur son numéro en 
     * parcourant la liste des commandes, Retourne
     * une Commande si trouvée, sinon retourne null
     * @param idCommande
     * @return Commande
     */
    public Commande getCommandeById(int idCommande) {
        /* A compléter */
        return /* A compléter */
    }

    /**
     * Retire une commande la liste des commandes.
     * Remarque : en supprimant une commande on supprime
     * aussi ses lignes (Composition)
     * @param uneCommande 
     */
    public void supprimerCommande(Commande uneCommande) {
       /* A compléter */
    }


}
