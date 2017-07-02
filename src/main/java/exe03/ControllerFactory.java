package exe03;

public class ControllerFactory {

	// Passamos o objeto como parametro apenas para poder usar o database
	// no metodo principal
	public Controller getController(Object obj){
		if (obj instanceof Student)
			return new Controller(obj, new StudentView());
		
		if (obj instanceof Professor)
			return new Controller(obj, new ProfessorView());
		
		return null;
	}
	
}
