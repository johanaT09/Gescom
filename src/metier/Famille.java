package metier;

import java.util.*;

public class Famille {

    private Integer idFamille;
    private String libFamille;

    public Integer getIdFamille() {
        return idFamille;
    }
    public void setIdFamille(Integer idFamille) {
        this.idFamille = idFamille;
    }
    public String getLibFamille() {
        return libFamille;
    }
    public void setLibFamille(String libFamille) {
        this.libFamille = libFamille;
    }

    
    public Famille(int idFamille, String libFamille) {
        setIdFamille(idFamille);
        setLibFamille(libFamille);
    }



}
