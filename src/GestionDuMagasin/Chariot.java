package GestionDuMagasin;

import java.util.ArrayList;
import java.util.HashMap;

public class Chariot {

    //Variables
    public HashMap<Article, Integer> articlesList = new HashMap<>();


    //Method remplir
    public void remplir(Article article, int quantite) {

        articlesList.put(article, quantite);

    }
}
