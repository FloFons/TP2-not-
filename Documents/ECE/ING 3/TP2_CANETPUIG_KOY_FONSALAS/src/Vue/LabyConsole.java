/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import java.util.Scanner;

/**
 *
 * @author florentfonsalas
 */
public class LabyConsole {

    ///Attributs
    /**
     * Affiche le menu composé de 3 choix : déplacement aléatoire, en profondeur
     * DFS ou quitter le programme L’utilisateur doit saisir un choix de type
     * int et recommencer tant qu’aucun des 3 choix proposés n’est valide, y
     * compris si l’utilisateur saisit des caractères au lieu d’un nombre entier
     * Il faut donc pouvoir convertir la saisie, y compris avec des caractères,
     * en entier Dans le cas où l’utilisateur saisit des caractères autres que
     * des chiffres, cette conversion génère l’exception NumberFormatException
     * qu’il faut attraper pour afficher un message d’erreur, tout en pouvant
     * recommencer la saisie
     *
     * Cette méthode retourne le choix saisi.
     *
     * @return
     */
    public int menu() {

        //déclaration des variables
        int choix;
        Scanner scann;

        //Initialisation variables
        choix = 4;
        scann = new Scanner(System.in);

        //Demande de saisie du choix
        while ((choix > 2) || (choix < 0)) {
            try {
                System.out.print("1 Déplacer automatiquement en profondeur \n2 Déplacer aléatoire \n 0 Quitter \n");
                System.out.print("Veuillez saisir votre choix: ");
                choix = scann.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Erreur veuillez saisir un chiffre entre 0 et 2");
            }

        }
        return choix;
    }

    /**
     * Affiche les coordonnées positionX et positionY protected de la Case c en
     * paramètre
     *
     * @param c
     */
    public void affiche(Case c) {
        System.out.println("Position X: " + c.getPositionX());
        System.out.println("Position Y: " + c.getPositionY());
    }

    /**
     * Affiche un labyrinthe en mode console en se servant des méthodes du
     * Labyrinthe laby en paramètre : afficher toutes les cases soit de CaseMur
     * avec le caractère ‘X’, soit de CaseTrou avec le caractère ’_’ en se
     * servant de instanceof pour les distinguer, soit le caractère ‘V’ si la
     * case est visitée (voir la méthode getVisited définie dans l’interface
     * Case et implémentée dans la classe CaseImplementee).
     *
     * @param laby
     */
    public void affiche(Labyrinthe laby) {
        for (int col = 0; col < 5; col++) {
            for (int lig = 0; lig < 5; lig++) {
                System.out.print(laby.getCase(lig,col));
            }
        }
    }

}
