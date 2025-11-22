package Taller_3;

public class StrategyFecha implements StrategyPrioridad {
    @Override
    public void ordenarTareas(Tarea[] tareas, int cantidad) {
      
        for (int i = 0; i < cantidad - 1; i++) {
            for (int j = 0; j < cantidad - i - 1; j++) {
                if (tareas[j].getFecha().compareTo(tareas[j + 1].getFecha()) > 0) {
                   
                    Tarea temp = tareas[j];
                    tareas[j] = tareas[j + 1];
                    tareas[j + 1] = temp;
                }
            }
        }
    }
}
