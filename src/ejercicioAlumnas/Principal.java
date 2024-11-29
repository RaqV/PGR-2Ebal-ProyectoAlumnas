package ejercicioAlumnas;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Alumna;

public class Principal {

	public static void main(String[] args) {

		
		char iOpc;
		
		Scanner sc = new Scanner(System.in);

		// Lista de alumnas
		ArrayList<Alumna> alumnas = new ArrayList<>();

		do {
			iOpc = obtenerOpcionMenu(sc);

			// Tratamos la opci�n de menu que corresponda
			switch (iOpc) {
			case 'A':
				introducirAlumna(alumnas, sc);
				break;
			case 'B':
				if (alumnas.isEmpty()) {
					System.out.println("Vete a la opci�n A");
				}else {
					listarAlumnas(alumnas);
				}
				break;
			case 'C':
				//listarAlumnasCompleto(ik, sc);
				break;
			case 'D':
				//introducirNotaAlumnas(ik, sc);
				break;
			case 'E':
				//modificarNotaModulo(ik, sc);
				break;
			case 'F':
				//borrarAlumna(ik, sc);
				break;
			case 'G':
				//borrarModuloAlumna(ik, sc);
				break;
			case 'H':
				//introducirNotaModulo(ik, sc);
				break;
			case 'I':
				// listarNotaMedia(ik);
				break;
			case 'J':
				//listarPorDni(ik);
				break;
			case 'K':
				// listarSuspensos(ik);
				break;
			case 'L':
				// listarNotaMaxMin(ik);
				break;
			case 'M':
				// listarAlumnasSinEvaluar(ik);
				break;
			case 'N':
				// listarRepetidores(ik);
				break;
			default:
				System.out.println("Agur");
			}

		} while (iOpc != 9);

		sc.close();

	}

	private static void listarAlumnas(ArrayList<Alumna> alumnas) {
		// TODO Auto-generated method stub
		for(Alumna alum :alumnas) {
			alum.getDatos();
		}
		
	}

	private static void introducirAlumna(ArrayList<Alumna> alumnas, Scanner sc) {
		//Repetitiva para meter varias alumnas
		char continuar;
		String nif;
		boolean encontrado;
		Alumna alum;
		
		do {
			encontrado=false;
			
			//Pido nif
			System.out.println("Introduce NIF:");
			nif = sc.next();
			
			//Buscamos si exista ya la alumna
			for(int i=0;i<alumnas.size();i++) {
				if(alumnas.get(i).getNif().equalsIgnoreCase(nif)) {
					encontrado=true;
					i=alumnas.size();
				}
			}
			
			if (encontrado) {
				System.out.println("Alumna ya existe");
			}else {
				alum = new Alumna();
				alum.setDatos(nif);
				alumnas.add(alum);
			}
			System.out.println("Hola mundo");
			System.out.println("Desear continuar introduciendo alumnas? (S/N)");
			continuar=sc.next().toUpperCase().charAt(0);
			System.out.println("patata");
			
			
		}while (continuar!='N');
		
	}

	private static char obtenerOpcionMenu(Scanner sc) {
		char iOpc = ' ';

		System.out.println("**************************************************************");
		System.out.println("\tIntroduce la opci�n de menu que corresponda: ");
		System.out.println("\n\t A. \t Matricular alumna ");
		System.out.println("\t B. \t Listar alumnas ");
		System.out.println("\t C. \t Listado de toda la informaci�n disponible de un alumno/a");
		System.out.println("\t D. \t Introducir nota/s de un alumno/a  ");
		System.out.println("\t E. \t Modificar la nota de un m�dulo");
		System.out.println("\t F. \t Dar de baja a un alumno/a  ");
		System.out.println("\t G. \t Dar de baja un modulo de un alumno/a ");
		System.out.println("\t H. \t Introducir las notas de un m�dulo concreto. ");
		System.out.println("\t I. \t Nota media de los alumno/as de un ciclo ");
		System.out.println("\t J. \t Mostrar los alumno/as ordenados por nif ");
		System.out.println("\t K. \t Mostrar los alumnas que hayan suspendido un m�dulo concreto. ");
		System.out.println("\t L. \t Mostrar la nota m�s alta y la m�s baja de un m�dulo  ");
		System.out.println("\t M. \t Alumnos sin evaluar en un m�dulo concreto ");
		System.out.println("\t N. \t Listado de los repetidores  ");
		System.out.println("\t O. \t Listado del n� de suspensos de los alumnos de un ciclo concreto  ");
		System.out.println("\t 9. \t Salir ");
		System.out.println("*************************************************************");

		iOpc = sc.next().toUpperCase().charAt(0);

		return iOpc;
	}

}
