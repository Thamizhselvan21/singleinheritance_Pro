package examples;

public class Shopping {

	final int order=3;
	void insert()
	{
		order=4;
	}
	public static void main(String[] args) {
		Shopping s=new Shopping();
		//s.order=3;
		System.out.println(s.order);

		System.out.println(s.order);
	}

}
