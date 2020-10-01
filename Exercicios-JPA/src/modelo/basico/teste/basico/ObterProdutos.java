package modelo.basico.teste.basico;

import java.util.List;

import infra.ProdutoDAO;
import modelo.basico.protocols.IProduto;

public class ObterProdutos {
	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		List<IProduto> produtos = dao.obterTodos();
		
		produtos.forEach(produto -> System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome()));
		
		double precoTotal = produtos.stream()
				.map(produto -> produto.getPreco())
				.reduce(0.0, (totalAcumulado, preco) -> totalAcumulado + preco)
				.doubleValue();
		
		System.out.println("O valot total é R$" + precoTotal);
		
		dao.fechar();
	}
}
