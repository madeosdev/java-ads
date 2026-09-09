public class GerenciamentoLoja {
	public static void main (String [] args){
		String numeroPedido = "1000000000007";
		String codigoProduto = "4568976-M";
		int quantidade = 10;
		float valorTotal = 456.75f;
		
		System.out.println("Numero do Pedido: " + numeroPedido);
		System.out.println("Codigo do Produto: " + codigoProduto);
		System.out.println("Quantidade: " + quantidade);
		System.out.printf("Valor Total: R$%.2f%n", valorTotal);}
}
