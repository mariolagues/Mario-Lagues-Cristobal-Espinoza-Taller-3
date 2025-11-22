package Taller_3;

public class StrategyTipo implements StrategyPrioridad {
    @Override
    public void ordenarTareas(Tarea[] tareas, int cantidad) {  
      
        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - i - 1; j++) {
                int valor1 = valorTipo(tareas[j].getTipo());
                int valor2 = valorTipo(tareas[j + 1].getTipo());
                
                
                if (valor1 < valor2) {
                    
                    Tarea temp = tareas[j];
                    tareas[j] = tareas[j + 1];
                    tareas[j + 1] = temp;
                }
            }
        }
    }
    
    private int valorTipo(String tipo) {
    	
        if (tipo.equals("Bug")) 
        	return 3;
        if (tipo.equals("Feature")) 
        	return 2;
        if (tipo.equals("Documentacion")) 
        	return 1;
        return 0;
    }
}