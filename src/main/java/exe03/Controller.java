package exe03;

public class Controller {
	private Object model;
	private Object view;

	public Controller(Object model, Object view) {
		this.model = model;
		this.view = view;
	}

	public void setName(String name) {
		if (model instanceof Student)
			((Student)model).setName(name);
		
		if (model instanceof Professor)
			((Professor)model).setName(name);
	}

	public String getName() {
		if (model instanceof Student)
			return ((Student)model).getName();
		
		if (model instanceof Professor)
			return ((Professor)model).getName();
		
		return null;
	}

	public void setRollNo(String rollNo) {
		if (model instanceof Student)
			((Student)model).setRollNo(rollNo);
	}

	public String getRollNo() {
		if (model instanceof Student)
			return ((Student)model).getRollNo();
		
		return null;
	}
	
	public void setDepartment(String department){
		if (model instanceof Professor)
			((Professor)model).setDepartment(department);
	}
	
	public String getDepartment(){
		if (model instanceof Professor)
			return ((Professor)model).getDepartment();
		
		return null;
	}
	
	public void setId(String id){
		if (model instanceof Professor)
			((Professor)model).setId(id);
	}
	
	public String getId(){
		if (model instanceof Professor)
			return ((Professor)model).getId();
		
		return null;
	}

	public void updateView() {
		if (view instanceof StudentView)
			((StudentView)view).printStudentDetails(getName(), getRollNo());
		
		if (view instanceof ProfessorView)
			((ProfessorView)view).printProfessorDetails(getName(), getDepartment(), getId());
	}

}
