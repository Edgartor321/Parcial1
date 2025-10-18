package unam.fes.aragon.parcialUno.arreglos.promedioCSV;

public interface funciones{
	public void insertar (Integer x, Integer[] l) throws Exception;
	public int localiza(Integer x, Integer[] l) throws Exception;
	public Integer recupera (int p, Integer[] l) throws Exception;
	public void suprime (int p, Integer[] l) throws Exception;
	public Integer siguiente(int p, Integer[] l) throws Exception;
	public Integer anterior(int p, Integer[] l) throws Exception;
	public void limpiar(Integer[] l);
	public Integer primero(Integer[] l) throws Exception;
	public Integer imprime(Integer[] l);
	public void asignar(Integer x, int p, Integer[] l) throws Exception;
}
