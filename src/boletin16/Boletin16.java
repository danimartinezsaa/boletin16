/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin16;

import es.dani.personal.Personal;

/**
 *
 * @author dani
 */
public class Boletin16{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Personal personal1=new Personal("123345566","dani@dani.es");
        Academia alumno1=new Academia(9,"Dani",personal1);
        System.out.println(alumno1.toString());
    }
    
}
