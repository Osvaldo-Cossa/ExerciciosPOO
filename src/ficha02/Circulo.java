package ficha02;

public class Circulo {
	
	double raio;
	String cor;
	String filled;
	double pi= 3.14;
	
	public double areaCirculo() {
		
		
		double area = pi*(raio*raio);
		return area;
		
	}
	
	public double perimetroCirculo() {
		
		double perimetro = 2*pi*raio;
		
		return perimetro;
		
		
	}
	
}
