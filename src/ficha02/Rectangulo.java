package ficha02;

public class Rectangulo {
	
	double base;
	double altura;
	String cor;
	String filled;
	
	public double areaRectangulo() {
		
		double area = base * altura;
		return area;
		
	}
	
	public double perimetroRectangulo() {
		
		double perimetro = (base*2) + (altura*2);
		
		return perimetro;
		
		
	}
	
}
