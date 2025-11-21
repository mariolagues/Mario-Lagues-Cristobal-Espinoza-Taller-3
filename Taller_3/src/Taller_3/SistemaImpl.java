package Taller_3;

public class SistemaImpl implements Sistema{
	private static SistemaImpl instancia;
	
	public static SistemaImpl getInstancia() {
		if(instancia == null) {
			instancia = new SistemaImpl();
		}
		return instancia;
		
	}

}
