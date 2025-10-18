package unam.fes.aragon.parcialUno.listas;

import unam.fes.aragon.dinamicas.listaSimple.ListaSimple;

public class ejercicioDos {
    public static void main(String[] args) {
        manejoArchivos entrada=new manejoArchivos("Listas.csv");
        ListaSimple<Integer> numros=new ListaSimple<>();
        numros=entrada.leerTxt();
        ListaSimple<Integer> rango=new ListaSimple<>();
        for (int i = 0; i < numros.getLongitud(); i++){
            if (numros.obtenerNodo(i)>=30&&numros.obtenerNodo(i) <=150){
                rango.agregarEnCola(numros.obtenerNodo(i));
            }
        }
        ListaSimple<Integer> unicos=new ListaSimple<>();
        ListaSimple<Integer> frecuencias=new ListaSimple<>();

        for (int i = 0; i < rango.getLongitud(); i++) {
            int indice=unicos.localizar(rango.obtenerNodo(i));
            if (indice==-1){
                unicos.agregarEnCola(rango.obtenerNodo(i));
                frecuencias.agregarEnCola(1);
            }else {
                frecuencias.insertarEnIndice(frecuencias.obtenerNodo(indice)+1,indice);
            }

        }
        System.out.println("Encontrados: "+rango.getLongitud());
        System.out.println("Frecuencias:");
        System.out.println(" #   | Frec");
        for (int i=0;i<unicos.getLongitud();i++){
            System.out.println(unicos.obtenerNodo(i)+" : "+frecuencias.obtenerNodo(i));
        }
        System.out.println("FIn de la busqueda");
    }
}
