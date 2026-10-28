
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hamza
 */
public class TestChemise {

    public static void main(String[] args) {
        
        Chemise c1 = new Chemise(101, 20, "Bleu", 200);
        Chemise c2 = new Chemise(201, 30, "Rouge", 180);

        System.out.println(" Objet 1 ");
        c1.afficherInfosChemise();

        System.out.println("\n Objet 2 ");
        c2.afficherInfosChemise();

        c1.ajouteruneChemiseDansLeStock();
        c2.ajouteruneChemiseDansLeStock();

        c1.diminuerUneChemiseDuStock();
        c2.diminuerUneChemiseDuStock();

        System.out.println("\n Apres modification du stock ");
        System.out.println(" Objet 1 ");
        c1.afficherInfosChemise();

        System.out.println("\n Objet 2 ");
        c2.afficherInfosChemise();
    }
}
