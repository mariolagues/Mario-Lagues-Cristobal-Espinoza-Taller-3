package Taller_3;

public class StrategyComplejidad implements StrategyPrioridad {
    @Override
    public void ordenarTareas(Tarea[] tareas, int cantidad) {  
        
        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - i - 1; j++) {
            	
                int valor1 = valorComplejidad(tareas[j].getComplejidad());
                int valor2 = valorComplejidad(tareas[j + 1].getComplejidad());
                
                if (valor1 < valor2) {
                   
                    Tarea temp = tareas[j];
                    tareas[j] = tareas[j + 1];
                    tareas[j + 1] = temp;
                }
            }
        }
    }
    
    private int valorComplejidad(String comp) {
    	
        if (comp.equals("Alta")) 
        	return 3;
        if (comp.equals("Media")) 
        	return 2;
        if (comp.equals("Baja")) 
        	return 1;
        return 0;
    }
}