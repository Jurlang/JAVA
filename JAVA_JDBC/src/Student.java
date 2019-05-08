
public class Student {
	private int sno;
	private String name;
	private String dept;
	
	public Student() {}
	public Student(int sno, String name, String dept) {
		setSno(sno);
		setName(name);
		setDept(dept);
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	@Override
	public String toString() {
		return sno + "\t" + name + "\t\t" + dept;
	}
}
