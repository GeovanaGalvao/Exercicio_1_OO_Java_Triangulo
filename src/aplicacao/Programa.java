package aplicacao;
import java.util.Scanner;
import entidades.Triangulo;

public class Programa {

	public static void main(String[] args) {
		int quantidadeDeTriangulos, trianguloComAreaMaior = 0;
		double areaMaior = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de triangulos: ");
		quantidadeDeTriangulos = sc.nextInt();
		Triangulo triangulos[] = new Triangulo [quantidadeDeTriangulos];
		for(int i=0; i < quantidadeDeTriangulos; i++) {
			System.out.println("Digite os valores dos lados do triangulo " + (i+1) + ": ");
			/*Cria um objeto do tipo triangulo, obtem os valores digitados pelo usuario para
			 *atribuir aos lados do triangulo e o adiciona o objeto triangulo no vetor.*/
			triangulos[i] = new Triangulo(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		}
		for(int i=0; i < quantidadeDeTriangulos; i++) {
			System.out.printf("Area do triangulo %d = %.4f\n", (i+1), triangulos[i].area);
			if (triangulos[i].area > areaMaior) trianguloComAreaMaior = i+1;
		}
		System.out.println("Triangulo com a area maior: triangulo " + trianguloComAreaMaior);
		sc.close();
	}
}
