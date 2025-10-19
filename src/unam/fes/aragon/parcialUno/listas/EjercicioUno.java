package unam.fes.aragon.parcialUno.listas;
import unam.fes.aragon.dinamicas.listaSimple.ListaSimple;
import java.util.Random;

public class EjercicioUno {
    public static void main(String[] args) {
        ListaSimple<Integer> lista = new ListaSimple<>();
        ManejoArchivos<String> archivo = new ManejoArchivos("Listas.csv");
        Random numeroAleatorio = new Random();

        for (int i=0; i<10000; i++) {
            lista.agregarEnCola(numeroAleatorio.nextInt(1,301));
        }

        if(archivo.archivoExiste("Listas.csv")){
            archivo.borrarArchivo("Listas.csv");
        }

        for(int i=0; i<10000; i++){
            String añadidoCSV = Integer.toString(lista.obtenerNodo(i));
            archivo.escribirEnArchivo("Listas.csv", añadidoCSV);
            if((i+1) < 10000){
                if((i+1) % 1000 == 0){
                    archivo.escribirEnArchivo("Listas.csv", "\n");
                }else{
                    archivo.escribirEnArchivo("Listas.csv", ",");
                }
            }
        }
    }
}
