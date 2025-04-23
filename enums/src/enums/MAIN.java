package enums;

public class MAIN {
	public static void main(String[] args) {
		Days d= Days.WEDNESSDAY;
		System.out.println(d);
		
		System.out.println(d.ordinal());
		System.out.println(Days.FRIDAY.ordinal());
		Days []ds=Days.values();
		for(Days i:ds) {
			System.out.println(i+"	"+"order  "+i.ordinal());
			
		}
		
		if(d==Days.MONDNAY) {
			System.out.println("hey its week start day");
		}else if(d==Days.TUESDAY) {
			System.out.println("hey its tuesday ");
		}else if (d==Days.WEDNESSDAY) {
			System.out.println("hey its middle of week");
		}else if(d==Days.THURSDAY) {
			System.out.println("hey its thursday");
		}else if(d==Days.FRIDAY) {
			System.out.println("hey its firday");
		}
		
		switch( d) {
		case MONDNAY:{
			System.out.println("HEY ITS WEEK START");
			break;
		}
		case TUESDAY:{
			System.out.println("HEY ITS WEEK tusday");
			break;
		}
			
		case WEDNESSDAY:{
			System.out.println("HEY ITS WEEK WED");
			break;
		}
								
		default: System.out.println("something went wrong");
		
		}
	}
}
