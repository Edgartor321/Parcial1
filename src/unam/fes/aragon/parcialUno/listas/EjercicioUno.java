package unam.fes.aragon.parcialUno.listas;
import unam.fes.aragon.dinamicas.listaSimple.ListaSimple;
import java.util.Random;

public class EjercicioUno {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple<>();
        ManejoArchivos archivo = new ManejoArchivos("Listas.csv");
        Random numeroAñadido = new Random();

        for (int i=0; i<10000; i++) {
            lista.agregarEnCola(numeroAñadido.nextInt(1,301));
        }

        StringBuilder cadena = new StringBuilder();

        for (int i=1; i<=lista.getLongitud(); i++){
            cadena.append(lista.obtenerNodo(i-1));
            if (i<lista.getLongitud()){
                cadena.append(",");
            }
            if ((i%1000) == 0 && i!=0){
                cadena.append("\n");
            }
        }
        String resultado=cadena.toString();
        archivo.guardarArchivo(resultado);
    }
}
