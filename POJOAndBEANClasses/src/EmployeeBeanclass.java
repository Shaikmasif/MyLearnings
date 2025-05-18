
public class EmployeeBeanclass {
	private int id;
	private String name;
	public EmployeeBeanclass() {
		super();
	}
	public EmployeeBeanclass(int id, String name) {
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
		return "EmployeeBeanclass [id=" + id + ", name=" + name + "]";
	}
	
}
