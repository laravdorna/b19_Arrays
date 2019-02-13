
import javax.swing.JOptionPane;

/*
 * 2- Carga un array  de tipo int, cas notas no módulo de programación ,dos 30 alumnos da clase de DAM .
 Visualiza o numero de suspensos e o de suspensos  .
 Calcula e visualiza a nota media da clase
Visualiza a nota mais alta .

 */
/**
 *
 * @author lvazquezdorna
 */
public class Notas {

    public static int tam = 30;
    int[] notas = new int[tam];

    public int darValor() {
        return Integer.parseInt(JOptionPane.showInputDialog("valor"));

    }
//creo un array con el numero de elementos que quieran y le llaman como quieran

    public int[] crearArray(int[] lista, int ele) {
        for (int i = 0; i < ele; i++) {
            lista[i] = darValor();
        }
        return lista;
    }

    public void crearArray() {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = darValor();
        }
    }

    //visualiza el numero de suspensos y suspensos
    private int aprobados(int notas[]) {
        int aprobados = 0;

        for (int i = 0; i < this.notas.length; i++) {
            if (notas[i] >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }

    private int suspensos(int notas[]) {
        int suspensos = 0;

        for (int i = 0; i < this.notas.length; i++) {
            if (notas[i] < 5) {
                suspensos++;
            }
        }
        return suspensos;
    }

    public void visualizarAS() {
        System.out.println("El numero de aprobados de clase es: "
                + aprobados(notas) + "el numero de suspensos es:" + suspensos(notas));
    }

    //nota media
    public void notaMedia(int notas[]) {
        int sumaNotas = 0;
        int notaMedia;
        for (int i = 0; i < this.notas.length; i++) {
            sumaNotas = notas[i] + sumaNotas;
        }
        notaMedia = sumaNotas / this.notas.length;
    }
    //visualiza la nota mas alta

    public void notaAlta(int notas[]) {
        int nota=0;
        for (int i = 0; i < this.notas.length; i++) {
            if(notas[i]>nota){
            nota=notas[i];
            }
        }
        System.out.println("La nota más alta de la clase es:"+ nota);
    }

}
