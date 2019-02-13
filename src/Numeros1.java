/*
 *1- Realiza un programa que cree un array chamado “numeros” con 6 numeros 
aleatorios dun rango de 1 a 50 .Seguidamente visualiza o array o revés 
( 0 primeiro elemento visualizaráse  o último e asi sucesivamente )
 */

import javax.swing.JOptionPane;

/**
 *
 * @author lvazquezdorna
 */
public class Numeros1 {

    public static int tam = 6;
    int[] numeros = new int[tam];

    public int darValor() {
        int numero = (int) ((Math.random() * 50) + 1);
        return numero;

    }

    public void crearArray() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = darValor();
        }
    }

    public void amosar() {
        System.out.println("Muestra los numeros del array");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("posicion" + (i+1)+ ": " + numeros[i]);
        }
    }

    public void amosarReves() {
        System.out.println("Muestra los numeros de la ultima posicion a la primera");
        for (int i = numeros.length-1; i >= 0; i--) {
            System.out.println("numero " + i + ": " + numeros[i]);
        }
    }
}
