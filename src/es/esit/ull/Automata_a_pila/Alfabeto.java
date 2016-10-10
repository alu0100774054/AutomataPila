package es.esit.ull.Automata_a_pila;

import java.util.ArrayList;

/**
 * Created by Zephyr on 9/10/16.
 */
public class Alfabeto {
    private ArrayList<String> alfabeto;				// Lista de simbolos que componen el alfabeto.


    /**
     * Crea un alfabeto vacío
     */
    public Alfabeto(){
        setAlfabeto(new ArrayList<String>());
    }

    /**
     * Añade el elemento recibido al alfabeto.
     * @param simbolo
     */
    public void nuevoSimbolo(String simbolo) {
        if (!getAlfabeto().contains(simbolo) && !simbolo.equals(Automata.getBlanco()))
            getAlfabeto().add(simbolo);
    }

    /**
     * Verifica si el elemento pertenece al alfabeto.
     * @param simbolo simbolo a analizar.
     * @return true si el simbolo pertenece al alfabeto.
     */
    public boolean pertenece(String simbolo) {
        return getAlfabeto().contains(simbolo) || simbolo.equals(Automata.getBlanco());
    }

    /**
     * Getter y setter
     */
    public ArrayList<String> getAlfabeto() {
        return alfabeto;
    }

    public void setAlfabeto(ArrayList<String> alfabeto) {
        this.alfabeto = alfabeto;
    }
}
