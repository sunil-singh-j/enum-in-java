package enums;

public enum Laptop {
	MACKBOOK(500),VIVOBOOK(6000),THINKPAD(4500),NOTEBOOK(35455);
	Laptop(int i) {
		// TODO Auto-generated constructor stub
		this.price=i;
	}

	private int price=0;
	
	
}
