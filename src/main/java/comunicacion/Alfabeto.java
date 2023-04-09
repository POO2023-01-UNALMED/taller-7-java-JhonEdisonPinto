package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	

	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras=letras;
		this.interpretacion= interpretacion;
	}
	
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras=letras;
	}
	public String getInterpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
	
	//Metodo cantidad de letras
	public int cantidadLetras() {
		int cantidadL=getLetras().length;
		return cantidadL;
	}
	//Interpretacion
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	@Override 
	public String toString(){
		String cadaLetra ="";
		for(int i = 0; i<=letras.length;i++) {
			cadaLetra += letras[i]+", ";
			}
	cadaLetra +=letras[letras.length-1];	
	return cadaLetra;
	}
}

