public class DeclaracaoVariaveis {
	public static void main (String[] args) {
		String nome = "Zé das Couve", dataDeNascimento;
		String rg = "12.345.678-9",
			   sexo = "MASCULINO";
			   dataDeNascimento = "01/01/2000";
		double salario = 18760.23;
		
		System.out.printf ("O Senhor %s, portador do RG %s, nascido em %s, do sexo %s, está registrado com o salário R$ %9.2f", nome, rg, dataDeNascimento, sexo, salario);
		}
	}
