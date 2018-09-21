/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author sire_marcos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        Eleve e1 = new Eleve();
        e1.setNom("Marcos");
        e1.setAge(30);
        e1.setMatricule("123456");
        
        Controler con = new Controler();
        //con.save(e1);
    }
    
}
