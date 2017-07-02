package exe03;

public class MVCPatternDemo {
	public static void main(String[] args) {

		ControllerFactory factory = new ControllerFactory();
		
		Student student = retrieveStudentFromDatabase();
		Professor professor = retrieveProfessorFromDatabase();
		
		Controller studentController = factory.getController(student);
		Controller professorController = factory.getController(professor);

		studentController.updateView();
		studentController.setName("John");
		studentController.updateView();
		
		professorController.updateView();
		professorController.setName("Paul");
		professorController.setId("314159");
		professorController.updateView();
	}

	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	
	private static Professor retrieveProfessorFromDatabase(){
		Professor professor = new Professor();
		professor.setName("Kristen");
		professor.setDepartment("Physics");
		professor.setId("27182818");
		return professor;
	}

}
