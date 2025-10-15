package unam.fes.aragon.parcial1;
import unam.fes.aragon.dinamicas.listaSimple.ListaSimple;
import java.util.Random;

public class Uno {
    public static void main(String[] args) {
        ListaSimple<Integer> lista=new ListaSimple<>();
        Textos outp=new Textos("src/Datos.csv");
        Random r=new Random();
        for (int i = 0; i < 10000; i++) {
            lista.agregarEnCola(r.nextInt(1,301));
        }
        lista.imprimirLista();
        System.out.println("Longitud "+lista.getLongitud());
        StringBuilder cadena=new StringBuilder();
        for (int i=1;i<=lista.getLongitud();i++){
            cadena.append(lista.obtenerNodo(i-1));
            if (i<lista.getLongitud()){
                cadena.append(", ");
            }
            if ((i%1000)==0&&i!=0){
                cadena.append("\n");
            }
        }
        String resultado=cadena.toString();
        outp.guardarTxt(resultado);
    }

}
