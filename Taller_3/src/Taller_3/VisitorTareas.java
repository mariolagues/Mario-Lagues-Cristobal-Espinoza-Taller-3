package Taller_3;

public class VisitorTareas {
    
    public void visitarBug(Tarea tarea) {
        System.out.println("Este bug afecta al proyecto '" + 
                          tarea.getProyecto() + "' se requiere atención ");
        
        
        if (tarea.getComplejidad().equalsIgnoreCase("Alta")) {
            System.out.println("   Bug que requiere una acción inmediata");
        }
        
        System.out.println("   Descripción: " + tarea.getDescripcion());
        System.out.println("   Estado actual: " + tarea.getEstado());
        System.out.println("   Responsable: " + tarea.getResponsable());
    }
    
    public void visitarFeature(Tarea tarea) {
    	
        System.out.println(" Descripcion: " + tarea.getDescripcion() + "'");
        
        int diasEstimados = calcularDiasEstimados(tarea.getComplejidad());
        System.out.println("   Tiempo estimado : " + diasEstimados + " dias");
        
        if (tarea.getEstado().equals("Pendiente")) {
            System.out.println("Pendiente de desarrollo");
        } else if (tarea.getEstado().equals("En progreso")) {
            System.out.println("En desarrollo ");
        } else if (tarea.getEstado().equals("Completada")) {
            System.out.println("Completada y lista para testear");
        }
        
        System.out.println(" Proyecto: " + tarea.getProyecto());
        System.out.println(" Responsable: " + tarea.getResponsable());
    }
    
    public void visitarDocumentacion(Tarea tarea) {
        System.out.println("Documentación: " + tarea.getDescripcion());
        
        
        System.out.println(" Mejora la calidad del proyecto ");
        
        if (tarea.getEstado().equals("Completada")) {
            System.out.println(" Listo para la revisión ");
        } else if (tarea.getEstado().equals("En progreso")) {
            System.out.println(" En proceso...");
        } else {
            System.out.println(" Pendiente...");
        }
        
        System.out.println(" Proyecto: " + tarea.getProyecto());
        System.out.println(" Responsable: " + tarea.getResponsable());
    }
    
    private int calcularDiasEstimados(String complejidad) {
    	
        switch(complejidad) {
        
            case ("Alta"): 
            	return 5;
            case ("Media"):
            	return 3;
            case ("Baja"): 
            	return 1;
            default: 
            	return 2;
        }
    }
}