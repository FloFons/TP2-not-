/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author florentfonsalas
 */
public class Promotion {

    ///Attributs
    private int id;
    private String nom;

    ///Constructeur par défault
    public Promotion() {

    }

    ///Constructeur 
    public Promotion(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    ///Constructeur bis
    public Promotion(Promotion promotion) {
        this.id = promotion.id;
        this.nom = promotion.nom;
    }

    ///Méthodes
    
    //Getter
    public int getId()
    
}
