package unam.fes.aragon.parcialUno.arreglos;

public class todoJunto {
    public static void main(String[] args){
        Integer[] l = new Integer[1000];
        int rd = 0, grande=0, segundoGrande=0, cantidadRepeticiones;
        float promedio=0;
        ArregloImpl ejercicio1 = new ArregloImpl();
        Integer numeroActual;

        //Arreglo aleatorio y llenado de datos
        try{
            for (int i = 0; i < l.length; i++) {
                rd = (int)(Math.random()*101);
                ejercicio1.insertar(rd, l);
            }

            //Buscar los dos números más grandes

            for(int i=0; i<l.length; i++){
                if(grande < ejercicio1.recupera(i, l)){
                    segundoGrande=grande;
                    grande= ejercicio1.recupera(i, l);
                }
                if(ejercicio1.recupera(i, l)>segundoGrande && ejercicio1.recupera(i, l)<grande){
                    segundoGrande= ejercicio1.recupera(i, l);
                }
            }
            System.out.println("El número más grande es: " + grande);
            System.out.println("El segundo número más grande es: " + segundoGrande);

            //Promedio

            for(int i=0; i<l.length; i++){
                promedio+= ejercicio1.recupera(i, l);
            }
            promedio/=l.length;
            System.out.println("El promedio es: " + promedio);

            //Cantidad de repeticiones

            for(int i=0; i<l.length; i++) {
                if(ejercicio1.recupera(i, l)!= null) {
                    numeroActual = ejercicio1.recupera(i, l);
                    cantidadRepeticiones = 1;

                    for (int j = i+1; j < l.length; j++) {
                        if (ejercicio1.recupera(j, l) != null && ejercicio1.recupera(j, l) == numeroActual) {
                            cantidadRepeticiones++;
                            l[j]= null;
                        }
                    }
                    System.out.println(numeroActual + " : " + cantidadRepeticiones);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
