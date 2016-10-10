package es.esit.ull.Automata_a_pila;

import java.util.ArrayList;

/**
 * Created by Zephyr on 9/10/16.
 */
public class Entrada {

    private ArrayList<String> cadenaDeEntrada;
    private int indiceLectura;                      // Posición del cabezal de lectura.

    /**
     * Crea una cadena de entrada nueva.
     * @param entrada
     */
    public Entrada(String entrada) {
        setCadenaDeEntrada(new ArrayList<String>());
        setCadenaDeEntrada(entrada);
    }

    /**
     *
     * @param entrada
     */
    public Entrada(Entrada entrada) {
        setCadenaDeEntrada(entrada.getCadenaDeEntrada());
        setIndiceLectura(entrada.getIndiceLectura());
    }

    /**
     * Verifica si se ha leido toda la cadena de entrada.
     * @return si se ha leído con éxito.
     */
    public boolean terminado() {
        return getIndiceLectura() == getCadenaDeEntrada().size();
    }

    /**
     * Lee el siguiente simbolo y avanza el índice.
     * @return elemento leído, null si se ha llegado al final.
     */
    public String leerSiguiente() {
        String siguiente = null;
        if (getIndiceLectura() < getCadenaDeEntrada().size()) {
            siguiente = getCadenaDeEntrada().get(getIndiceLectura());
            setIndiceLectura(getIndiceLectura() + 1);
        }
        return siguiente;
    }

    /**
     * Lee el siguiente símbolo sin actualizar el cabezal.
     * @return devuelve el símbolo.
     */
    public String leerSiguienteSinAvance() {
        String siguiente = null;
        if (getIndiceLectura() < getCadenaDeEntrada().size())
            siguiente = getCadenaDeEntrada().get(getIndiceLectura());
        return siguiente;
    }

    /**
     * Getter & Setter
     */
    public ArrayList<String> getCadenaDeEntrada() {
        return cadenaDeEntrada;
    }

    public void setCadenaDeEntrada(String cadenaDeEntrada) {
        for (int i = 0; i < cadenaDeEntrada.length(); i++)
            getCadenaDeEntrada().add(cadenaDeEntrada.substring(i, i +1 ));
        setIndiceLectura(0);
    }

    public void setCadenaDeEntrada(ArrayList<String> cadenaDeEntrada) {
        this.cadenaDeEntrada = cadenaDeEntrada;
    }

    public int getIndiceLectura() {
        return indiceLectura;
    }

    public void setIndiceLectura(int indiceLectura) {
        this.indiceLectura = indiceLectura;
    }
}
