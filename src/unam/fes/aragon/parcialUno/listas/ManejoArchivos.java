package unam.fes.aragon.parcialUno.listas;

import unam.fes.aragon.dinamicas.listaSimple.ListaSimple;

import java.io.*;

public class ManejoArchivos <E>{
    private String ruta;

    public ManejoArchivos(String ruta_absoluta) {
        this.ruta=ruta_absoluta;
    }

    public void guardarArchivo(String escritura){
        try (BufferedWriter modificar=new BufferedWriter(new FileWriter(this.ruta))){
            modificar.write(escritura);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public ListaSimple<Integer> leerArchivo(){
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

    public void escribirEnArchivo(String nombreArchivo, E dato){
        File archivo = new File(nombreArchivo);

        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.print(dato);
            salida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean archivoExiste(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    public void borrarArchivo(String nombreArchivo){
        File archivo = new File (nombreArchivo);
        archivo.delete();
    }
}
