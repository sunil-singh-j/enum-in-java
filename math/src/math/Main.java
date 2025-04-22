package math;

public class Main {
	public static void main(String []args) {
		int a=10;
		int b=11;
		
		int max=Math.max(a, b);
		System.out.println(max);
		int min=Math.min(a, b);
		System.out.println(min);
		int c=-14;
		int abs=Math.abs(c);
		System.out.println(abs);
		double d=1.12;
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(d));
		System.out.println(Math.round(d));
		int e=144;
		System.out.println(Math.sqrt(e));
		System.out.println(Math.pow(3,4));
		System.out.println(Math.log(10));
		System.out.println(Math.log10(10));
		System.out.println(Math.sin(90));
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*11));
		System.out.println(Math.nextAfter(1, 2));
		
		
	}
}
