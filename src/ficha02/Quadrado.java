package ficha02;

public class Quadrado {
	
	double lado;
	String cor;
	String filled;
	
	public double areaQuadrado() {
		
		double area = lado*lado;
		return area;
		
	}
	
	public double perimetroQuadrado() {
		
		double perimetro = lado*4;
		
		return perimetro;
		
		
	}
	

}
