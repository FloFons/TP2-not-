/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hyperplanning;

import Model.Etudiant;
import Model.Groupe;
import Model.Utilisateur;

/**
 *
 * @author florentfonsalas
 */
public class Hyperplanning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Etudiant etu = new Model.Etudiant(0, "email", "password", "nom", "prenom", 0, 0, new Groupe());
        System.out.println(etu.toString());
        
    }
    
}
