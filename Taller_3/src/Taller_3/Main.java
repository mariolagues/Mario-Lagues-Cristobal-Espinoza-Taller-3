package Taller_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) throws FileNotFoundException {
		leerUsuarios();
		leerProyectos();
		leerTareas();
		
		
	}
		
	private static void leerTareas() throws FileNotFoundException {
		sc = new Scanner(new File("tareas.txt"));
		while(sc.hasNextLine()) {
			String datos[] = sc.nextLine().split(";");
			String proyecto = datos[0];
			String id = datos[1];
			String tipo = datos[2];
			String descripcion = datos[3];
			String estado = datos[4];
			String responsable = datos[5];
			String complejidad = datos[6];
			String fecha = datos[7];
			
			
		}
		
	}
	private static void leerProyectos() throws FileNotFoundException {
		sc = new Scanner(new File("proyectos.txt"));
		while(sc.hasNextLine()) {
			String datos[] = sc.nextLine().split(";");
			String id = datos[0];
			String nombre = datos[1];
			String responsable = datos[2];
			
		}
		
	}
	private static void leerUsuarios() throws FileNotFoundException {
		sc = new Scanner(new File("usuarios.txt"));
		while(sc.hasNextLine()) {
			String datos[] = sc.nextLine().split(";");
			String nombre = datos[0];
			String contraseña = datos[1];
			String rol = datos[2];
			
		}
		
	}

}

