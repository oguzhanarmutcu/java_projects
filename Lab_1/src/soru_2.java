import java.util.Scanner;


public class soru_2 {

	
	public static void main(String[] args) {
		double a,b,c,d,x,sonuc;
	
		Scanner scan = new Scanner(System.in);
		System.out.print("a katsayısını giriniz : ");
		a = scan.nextDouble();
		System.out.print("b katsayısını giriniz : ");
		b = scan.nextDouble();
		System.out.print("c katsayısını giriniz : ");
		c = scan.nextDouble();
		System.out.print("d katsayısını giriniz : ");
		d = scan.nextDouble();
		
		System.out.println("Girilen katsayılar ile oluşan f(x) = "+a+"x^3 + " + b +"sin(2*pi*" + b +"x) + " + c +"e^(-x-"+(c*c)+")+" +(d/5)+" şeklindedir.");
		System.out.print("Hangi x değerinde f(x) hesaplansın?");
		x = scan.nextDouble();
		sonuc = (a*Math.pow(x, 3)) + (b*Math.sin(2*Math.PI*b*x)) + (c*Math.exp(-(x-Math.pow(c,2)))+ (d/5));
		System.out.println("f(" + x + ")="+sonuc);
		
		

	}

}
