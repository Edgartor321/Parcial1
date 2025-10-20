package unam.fes.aragon.parcialuno.listas;

import unam.fes.aragon.dinamicas.listasimple.ListaSimple;

public class EjercicioDos {
    public static void main(String[] args) {
        ManejoArchivos<String> entrada = new ManejoArchivos("Listas.csv");
        ListaSimple<Integer> numeros = new ListaSimple<>();
        numeros = entrada.leerArchivo();
        ListaSimple<Integer> rango=new ListaSimple<>();
        int cantidadRepeticiones, numeroActual;

        for (int i = 0; i < numeros.getLongitud(); i++){
            if (numeros.obtenerNodo(i) >= 30 && numeros.obtenerNodo(i) <= 150){
                rango.agregarEnCola(numeros.obtenerNodo(i));
            }
        }

        if(entrada.archivoExiste("Reporte.txt")){
            entrada.borrarArchivo("Reporte.txt");
        }

        entrada.escribirEnArchivo("Reporte.txt", "REPORTE\n");
        entrada.escribirEnArchivo("Reporte.txt", "Cantidad de repeticiones de los números del 30 al 150 en el archivo \"Listas.csv\"");

        for(int i = 0; i < rango.getLongitud(); i++){
            if(rango.obtenerNodo(i) != null){
                numeroActual = rango.obtenerNodo(i);
                cantidadRepeticiones = 1;
                for(int j = i+1; j < rango.getLongitud(); j++){
                    if(rango.obtenerNodo(j) != null && rango.obtenerNodo(j) == numeroActual){
                        cantidadRepeticiones++;
                        rango.asignar(null, j);
                    }
                }
                entrada.escribirEnArchivo("Reporte.txt", "\n");
                entrada.escribirEnArchivo("Reporte.txt", Integer.toString(numeroActual) + " : " + Integer.toString(cantidadRepeticiones));
            }
        }
    }
}
