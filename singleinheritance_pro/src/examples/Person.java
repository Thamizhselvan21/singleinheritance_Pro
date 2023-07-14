package examples;

public class Person
{
	private int pid;
	private String name;
	public Person()//default cons
	{
		pid=122;
		name="Arul";
	}
	public Person(int pid, String name) //parameterized constructor
	{
		this.pid = pid;
		this.name = name;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
