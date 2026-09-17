import java.util.Scanner;

public class Triangulo {
	public static void main (String [] args) {
		Scanner leia = new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("Defina o tamanho do Lado A do triangulo: ");
		a = leia.nextInt();
		
		System.out.println("Defina o tamanho do Lado B do triangulo: ");
		b = leia.nextInt();
		
		System.out.println("Defina o tamanho do Lado C do triangulo: ");
		c = leia.nextInt();
		
		if (a + b >= c && b + c > a && c + a > b) {
			if (a == b & b == c) {
				System.out.println("Triangulo Equilatero");}
			else {
				if (a == b || b == c){
					System.out.println("Triangulo Isosceles");
					}
				else {
					System.out.println("Triangulo Escaleno");
					}
				}
		
			}
		else {
			System.out.println("Erro: Nao e possivel formar um triangulo!");
			}
			}
	}
