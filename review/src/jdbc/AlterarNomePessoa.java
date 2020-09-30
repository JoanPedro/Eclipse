package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o código da pessoa: ");
		int codigo = entrada.nextInt();

		String SELECT = "SELECT * FROM pessoas WHERE codigo = ?";
		String UPDATE = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

		Connection conexao = FabricaConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(SELECT);
		stmt.setInt(1, codigo);

		ResultSet resultado = stmt.executeQuery();

		if (resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
			System.out.println("O nome atual é: " + p.getNome());
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String novoNome = entrada.nextLine();

			stmt.close();
			stmt = conexao.prepareStatement(UPDATE);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso!");
		}

		entrada.close();
		conexao.close();
	}
}
