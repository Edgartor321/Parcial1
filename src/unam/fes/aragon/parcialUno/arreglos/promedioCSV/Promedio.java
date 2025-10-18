package unam.fes.aragon.parcialUno.arreglos.promedioCSV;

import unam.fes.aragon.parcialUno.arreglos.interfazfunciones.ArregloImpl;

import java.io.BufferedReader;
import java.io.FileReader;

public class Promedio {
    public static void main(String[] args){
        Integer[] l = new Integer[10000];
        float promedio=0;
        ArregloImpl ejercicio2 = new ArregloImpl();
        FileReader archivo;
        BufferedReader lector;
        String cadena;
        String [] partes = null;
        Integer valorActual;

        try{
            archivo = new FileReader("Datos.csv");
            lector= new BufferedReader(archivo);
            while((cadena = lector.readLine()) != null){
                //Division de la cadena
                partes = cadena.split(",");

                for(int i=0; i< partes.length;i++){
                    valorActual=Integer.parseInt(partes[i]);
                    ejercicio2.insertar(valorActual, l);
                }
            }

            for(int i=0; i<l.length; i++){
                promedio+= ejercicio2.recupera(i, l);
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

        promedio/=l.length;
        System.out.println("El promedio es: " + promedio);
    }
}
