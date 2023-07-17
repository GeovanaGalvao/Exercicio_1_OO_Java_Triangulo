package entidades;

public class Triangulo {
	
	public double ladoA, ladoB, ladoC, area;
	
	public Triangulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
		area = areaTriangulo();
	}
	public double areaTriangulo() {
		return Math.sqrt(((ladoA+ladoB+ladoC)/2)*(((ladoA+ladoB+ladoC)/2)-ladoA)*
				(((ladoA+ladoB+ladoC)/2)-ladoB)*(((ladoA+ladoB+ladoC)/2)-ladoC));
	}
	public String toString() {
		return "Lados: " + ladoA + ladoB + ladoC + "\nArea: " + area;
	}
}
