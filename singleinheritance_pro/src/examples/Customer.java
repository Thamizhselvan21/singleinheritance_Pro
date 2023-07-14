package examples;

public class Customer extends Person {
	private int cid;
	private int orderid;
	private float price;
	public Customer()
	{
		super();
		cid=156;
		orderid=3452;
		price=670.6f;
	}
	public Customer(int pid, String name,int cid, int orderid, float price)
	{
		super(pid,name);
		this.cid = cid;
		this.orderid = orderid;
		this.price = price;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String toString()
	{
return "person name"+super.getName()+" \n Person id:"+super.getPid()+"Cust_id:"+cid+" Order id:"+orderid+" price:"+price;
	}
	
	
	
}



