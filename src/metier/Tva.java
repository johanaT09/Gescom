package metier;

import java.util.*;

public class Tva {
    private Integer idTva;
    private Double tauxTva;


    public Integer getIdTva() {
        return idTva;
    }
    public void setIdTva(Integer idTva) {
        this.idTva = idTva;
    }


    public Double getTauxTva() {
        return tauxTva;
    }
    public void setTauxTva(Double tauxTva) {
        this.tauxTva = tauxTva;
    }

    public Tva(int idTva, double tauxTva) {
        setIdTva(idTva);
        setTauxTva(tauxTva);
    }



}