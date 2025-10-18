package unam.fes.aragon.parcialUno.arreglos.interfazFunciones;

public class ArregloImpl implements funciones{
	private int posicion_actual=0;
    private Integer temp;
	
	@Override
	public void insertar(Integer x, Integer[] l) throws Exception {
		if(posicion_actual<=l.length-1){
			l[posicion_actual]=x;
			posicion_actual++;
		}else{
			throw new Exception("Se llenó el arreglo");
		}
	}
	
	@Override
	public int localiza(Integer x, Integer[] l) throws Exception {
		for(int i=0; i<l.length; i++){
			if(x==l[i]){
				System.out.println(i);
                return i;
			}else{
				throw new Exception("No existe el número");
			}
		}
        return 0;
    }
	
	@Override
	public Integer recupera (int p, Integer[] l) throws Exception {
		if(p<l.length && p>=0){
			System.out.println(l[p]);
            return l[p];
		}else{
			throw new Exception("Esa posicion está fuera de las dimensiones de la lista");
		}
    }
	
	@Override
	public void suprime (int p, Integer[] l) throws Exception {
		if(p<20 && p>=0){
			l[p]=null;
		}else{
			throw new Exception("Esa posición no existe");
		}
	}
	
	@Override
	public Integer siguiente(int p, Integer[] l) throws Exception {
		if(p<l.length && p>=0){
			System.out.println(l[p+1]);
		}else{
			throw new Exception("Esa posición no existe");
		}
        return 0;
    }
	
	@Override
	public Integer anterior(int p, Integer[] l) throws Exception {
		if(p<l.length && p>=0){
			System.out.println(l[p-1]);
            return l[p-1];
		}else{
			throw new Exception("Esa posición no existe");
		}
    }
	
	@Override
	public void limpiar(Integer[] l){
		for(int i=0; i<l.length; i++){
			l[i]=null;
		}
	}
	
	@Override
	public Integer primero(Integer[] l) throws Exception {
		if(l[0]!=null){
			System.out.println(l[0]);
            return l[0];
		}else{
			throw new Exception("No hay datos en esa posicion");
		}
    }
	
	@Override
	public Integer imprime(Integer[] l) {
        for(int i = 0; i < l.length; i++) {
            System.out.println(l[i]);
        }
        return 0;
    }

    @Override
	public void asignar(Integer x, int p, Integer[] l) throws Exception {
		if(p<l.length && p>=0){
			l[p]=x;
		}else{
			throw new Exception("No existe esa posición");
		}
	}
}
