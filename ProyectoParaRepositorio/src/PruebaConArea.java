import java.util.Scanner;



public class PruebaConArea {


	private int altura=50;
	private int base=50;

	
		
	public void Area(int altura, int base) {
		this.altura = altura;
		this.base = base;
	}


	public double area(){
		return (altura * base)/(double)2;
	}


	public  void main(String args[]){
		
		double base , altura , area;
		Scanner sc= new Scanner(System.in);
		System.out.println("base : ");
		base = sc.nextDouble();
		System.out.println("altura : ");
		altura = sc.nextDouble();
		area = area(base, altura);
		System.out.println("Area :" + area);
		
		sc.close();
		
	}


	public double area(double base, double altura) {
		double area;
		area=(base*altura)/2;
		return area;
	}


}
