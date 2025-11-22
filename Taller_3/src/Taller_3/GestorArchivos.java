package Taller_3;

import java.io.*;
import java.util.*;

public class GestorArchivos {
    
    public static List<Usuario> cargarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        
        try {
            Scanner sc = new Scanner(new File("usuarios.txt"));
            while (sc.hasNextLine()) {
            	
                String[] datos = sc.nextLine().split("|");
                if (datos.length == 3) {
                    usuarios.add(new Usuario(datos[0], datos[1], datos[2]));
                }
            }
            
            sc.close();
            
        } catch (Exception e) {
        	
            System.out.println("Error");
        }
        return usuarios;
    }
    
    public static List<Proyecto> cargarProyectos() {
        List<Proyecto> proyectos = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("proyectos.txt"));
            while (sc.hasNextLine()) {
                String[] datos = sc.nextLine().split("|");
                if (datos.length == 3) {
                    proyectos.add(new Proyecto(datos[0], datos[1], datos[2]));
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
        return proyectos;
    }
    
    public static List<Tarea> cargarTareas(List<Proyecto> proyectos) {
        List<Tarea> tareas = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("tareas.txt"));
            while (sc.hasNextLine()) {
                String[] datos = sc.nextLine().split("|");
                if (datos.length == 8) {
                    Tarea tarea = new Tarea(datos[0], datos[1], datos[2], datos[3],
                                          datos[4], datos[5], datos[6], datos[7]);
                    tareas.add(tarea);
                    
                    // agregar tarea
                    for (Proyecto p : proyectos) {
                        if (p.getId().equals(datos[0])) {
                            p.agregarTarea(tarea);
                            break;
                        }
                    }
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error cargando tareas");
        }
        return tareas;
    }
    
    public static void guardarProyectos(List<Proyecto> proyectos) {
        try {
            PrintWriter writer = new PrintWriter("proyectos.txt");
            for (Proyecto p : proyectos) {
                writer.println(p.getId() + "|" + p.getNombre() + "|" + p.getResponsable());
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    
    public static void guardarTareas(List<Tarea> tareas) {
        try {
            PrintWriter writer = new PrintWriter("tareas.txt");
            for (Tarea t : tareas) {
                writer.println(t.getProyecto() + "|" + t.getId() + "|" + t.getTipo() + "|" + 
                              t.getDescripcion() + "|" + t.getEstado() + "|" + 
                              t.getResponsable() + "|" + t.getComplejidad() + "|" + t.getFecha());
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}