package metier;

import java.util.*;

public class Categorie {

    private Integer idCategorie;
    private String libCategorie;


    public Integer getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getLibCategorie() {
        return libCategorie;
    }

    public void setLibCategorie(String libCategorie) {
        this.libCategorie = libCategorie;
    }



    public Categorie(int idCategorie, String libCategorie) {
        setIdCategorie(idCategorie);
        setLibCategorie(libCategorie);
    }


}