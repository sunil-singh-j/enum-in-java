package enums;

public enum Laptop {
	MACKBOOK(500),VIVOBOOK(6000),THINKPAD(4500),NOTEBOOK();
	Laptop(int i) {
		// TODO Auto-generated constructor stub
		this.price=i;
	}

	Laptop() {
		// TODO Auto-generated constructor stub
		this.price=100;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private int price=0;
	
	
}
