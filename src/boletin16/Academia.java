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
public class Academia{
    private int numReferencia=2018,nota;
    private String nombre;
    Personal alum;

    public Academia(){
    }

    public Academia(int nota, String nombre, Personal alum){
        this.nota=nota;
        this.nombre=nombre;
        this.alum=alum;
    }

    public int getNumReferencia(){
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia){
        this.numReferencia=numReferencia;
    }

    public int getNota(){
        return nota;
    }

    public void setNota(int nota){
        this.nota=nota;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public Personal getAlum(){
        return alum;
    }

    public void setAlum(Personal alum){
        this.alum=alum;
    }

    @Override
    public String toString(){
        return "numReferencia: "+numReferencia+", nota: "+nota+", nombre: "+nombre+", alum: "+alum;
    }
    
}
