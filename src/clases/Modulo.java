package clases;



public class Modulo {
	
	//Atributos
	private String nombreModulo;
	private float nota;
	
	//Costructores
	public Modulo() {
		
	}
	
	public Modulo(String nombreModulo, float nota) {
		super();
		this.nombreModulo = nombreModulo;
		this.nota = nota;
	}

	public String getNombreModulo() {
		return nombreModulo;
	}

	public void setNombreModulo(String nombreModulo) {
		this.nombreModulo = nombreModulo;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public void setDatos() {
		
		
		System.out.println("Introduce el nombre del m�dulo");
		//this.nombreModulo= sc.next();
	    this.nota = 0;
	}
	
	public void setDatos(String nombreAsig) {
		this.nombreModulo= nombreAsig;
	    this.nota = 0;
	}
	
	public void getDatos() {
		System.out.println("NOmbre modulo: "+ this.nombreModulo);
		System.out.println("Nota modulo: "+ this.nota);
	}
}

