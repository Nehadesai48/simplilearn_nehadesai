
public class Member {

	private String id, name, cost, quantity;


	public Member() {
		super();
	}

	public Member(String id, String name, String cost, String quantity) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getcost() {
		return cost;
	}

	public void setcost(String cost) {
		this.cost = cost;
	}

	public String getquantity() {
		return quantity;
	}

	public void setquantity(String quantity) {
		this.quantity = quantity;
	}


}
