package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumna {

	// Atributos
	private String nif;
	private String nombre;
	private String apellido;
	private String ciclo;
	private boolean repetidor;
	private ArrayList<Modulo> asignaturas;

	// Constructores
	public Alumna() {
		this.asignaturas = new ArrayList<>();
	}

	public Alumna(String nif, String nombre, String apellido, String ciclo, boolean repetidor,
			ArrayList<Modulo> asignaturas) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.apellido = apellido;
		this.ciclo = ciclo;
		this.repetidor = repetidor;
		this.asignaturas = asignaturas;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public boolean isRepetidor() {
		return repetidor;
	}

	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	public ArrayList<Modulo> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(ArrayList<Modulo> asignaturas) {
		this.asignaturas = asignaturas;
	}

	// SetDAtos
	public void setDatos() {
		char res;

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nif");
		this.nif = sc.next();
		System.out.println("Introduce el nombre");
		this.nombre = sc.next();
		System.out.println("Introduce el apellido");
		this.apellido = sc.next();
		System.out.println("Introduce el ciclo");
		this.ciclo = sc.next();
		System.out.println("�Es repetidor? (S/N)");
		res = sc.next().toUpperCase().charAt(0);
		if (res == 'S')
			this.repetidor = true;
		else
			this.repetidor = false;

		introducirModulos(sc);

		sc.close();

	}

	// SetDAtos
	public void setDatos(String nif) {
		char res;

		Scanner sc = new Scanner(System.in);
		
		this.nif = nif;
		System.out.println("Introduce el nombre");
		this.nombre = sc.next();
		System.out.println("Introduce el apellido");
		this.apellido = sc.next();
		System.out.println("Introduce el ciclo");
		this.ciclo = sc.next();
		System.out.println("�Es repetidor? (S/N)");
		res = sc.next().toUpperCase().charAt(0);
		if (res == 'S')
			this.repetidor = true;
		else
			this.repetidor = false;

		introducirModulos(sc);

		sc.close();

	}

	private void introducirModulos(Scanner sc) {
		//
		char continuar;
		Modulo modulo;
		String nombreModulo;
		boolean encontrado;

		// Repetitiva para meter los m�dulos de cada alumna
		do {
			encontrado = false;

			// Antes de introducir el m�dulo comprobamos que no
			// este repetido
			System.out.println("Introduce el nombre del modulo");
			nombreModulo = sc.next();

			for (int i = 0; i < asignaturas.size(); i++) {
				if (asignaturas.get(i).getNombreModulo().equalsIgnoreCase(nombreModulo)) {
					encontrado = true;
					i = asignaturas.size();
				}
			}

			if (!encontrado) {
				modulo = new Modulo();
//						modulo.setNombreModulo(nombreModulo);
//						modulo.setNota(0);
				modulo.setDatos(nombreModulo);
				asignaturas.add(modulo);
			} else {
				System.out.println("YA EXISTE");
			}

			System.out.println("Desear continuar introduciendo mod�los para esta alumna? (S/N)");
			continuar = sc.next().toUpperCase().charAt(0);

		} while (continuar != 'N');

	}

	public void getDatos() {
		
		System.out.println("*************ALUMNA*********");
		System.out.println("El nombre es "+ this.nombre);
		System.out.println("El nombre es "+ this.apellido);
		
		for(Modulo mod:asignaturas) {
			mod.getDatos();
		}
	}
}
