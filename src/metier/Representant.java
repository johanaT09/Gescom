package metier;

import java.util.*;

public class Representant {

    private Integer idRepresentant;
    private String nom;
    private String prenom;
    private Double caRepresentant;
    private List<Client> Clients;

    public Integer getIdRepresentant() {
        return idRepresentant;
    }
    public void setIdRepresentant(Integer idRepresentant) {
        this.idRepresentant = idRepresentant;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Double getCaRepresentant() {
        return caRepresentant;
    }
    public void setCaRepresentant(Double caRepresentant) {
        this.caRepresentant = caRepresentant;
    }

    public List<Client> getClients() {
        return Clients;
    }
    public void setClients(List<Client> Clients) {
        this.Clients = Clients;
    }

    public Representant(int idRepresentant, String prenom, String nom, List<Client> lesClients) {
        setIdRepresentant(idRepresentant);
        setPrenom(prenom);
        setNom(nom);
        setClients(lesClients);
    }

    public static void listerClients(List<Client> lesClients){
        for (Client unClient : lesClients ){
            System.out.println(unClient.getIdClient() + " catégorie : " +
                    unClient.getCategorie()+ " CA: " +
                    unClient.getCaClient() + " Raison sociale :" +
                    unClient.getRaisonSociale());
        }
    }

    /**
     * Recherche un Client sur son id dans la 
     * liste des clients. 
     * Retourne le Client si trouvé, sinon retourne null
     * @param idClient
     * @return Client
     */
    public Client getClientById(int idClient) {
        List<Client> lesClients = new ArrayList<Client>();
        if (idClient==){

        }
        return /* A compléter */
    }

    /* getters et setters */

}
