package metier;

import java.util.*;

public class Ligne {
   private Integer qteCommande;

   public Integer getQteCommande() {
       return qteCommande;
   }
   public void setQteCommande(Integer qteCommande) {
       this.qteCommande = qteCommande;
   }

    public Ligne (Article unArticle, int qteCommande){
       setQteCommande(qteCommande);
    }
}