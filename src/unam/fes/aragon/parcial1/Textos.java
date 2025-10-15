package unam.fes.aragon.parcial1;

import unam.fes.aragon.dinamicas.listaSimple.ListaSimple;

import java.io.*;

public class Textos {
    private String ruta;

    public Textos(String ruta_absoluta) {
        this.ruta=ruta_absoluta;
    }

    public void guardarTxt(String escritura){
        try (BufferedWriter modificar=new BufferedWriter(new FileWriter(this.ruta))){
            modificar.write(escritura);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public ListaSimple<Integer> leerTxt(){
        ListaSimple<Integer> numeros=new ListaSimple<>();
        try (BufferedReader lector=new BufferedReader(new FileReader(this.ruta))){
            String linea;
            while ((linea=lector.readLine())!=null){
                String[] divididos = linea.split("[,;\\s]+");
                for (String d:divididos){
                    if (!d.isEmpty()){
                        try{
                            numeros.agregarEnCola(Integer.parseInt(d));
                        }catch (NumberFormatException e){
                        }
                    }
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return numeros;
    }
}
