package fundamentos;

import javax.swing.JOptionPane;

public class DesafioConversao {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ").replace(",", ".");
		String valor2 = JOptionPane.showInputDialog("Digite o primeiro número: ").replace(",", ".");
		String valor3 = JOptionPane.showInputDialog("Digite o primeiro número: ").replace(",", ".");
		
		Double salario1 = Double.parseDouble(valor1);
		Double salario2 = Double.parseDouble(valor2);
		Double salario3 = Double.parseDouble(valor3);
		
		Double media = (salario1 + salario2 + salario3)/3;
		System.out.println(media);
		
	}
}