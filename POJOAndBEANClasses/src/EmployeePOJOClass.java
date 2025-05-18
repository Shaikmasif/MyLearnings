
public class EmployeePOJOClass {
	int id;
	String name;
	
	public EmployeePOJOClass(int a, String b) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeePOJOClass [id=" + id + ", name=" + name + "]";
	}
	
}
