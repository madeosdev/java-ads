import java.util.Scanner;

public class EquacaoSegundoGrau {
	public static void main (String [] args){
		Scanner leia = new Scanner (System.in);
		
		int a, b, c, delta;
		double x1, x2;
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextInt();
		if (a == 0) {
			System.out.println("Erro: Nao é uma equacao do segundo grau!");}
		else {
		
			System.out.println("Digite o valor de B: ");
			b = leia.nextInt();
			
			System.out.println("Digite o valor de C: ");
			c = leia.nextInt();
			
			System.out.println(a + "x^2+\t" + b + "x+\t" + c + "\t= 0");
			
			delta = b*b - 4*a*c;
			
			System.out.println("Valor do Delta: " + delta);
			
			if (delta < 0){
				System.out.println("Nao possui raizes positivas!");}
			else {
				if (delta == 0) {
					x1 = -b/(2*a);
					
					System.out.println("Resultado de X: " + x1);}
				else {
					x1 = (-b + (Math.sqrt(delta)))/(2*a);
					
					x2 = (-b - (Math.sqrt(delta)))/(2*a);
					
					System.out.println("Resultado de X1: " + x1);
					System.out.println("Resultado de X2: " + x2);}
					}
				}
		}
}
