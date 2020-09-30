package generics;

public class Caixa<Type> {
	private Type coisa;
	
	public void guardar(Type coisa) {
		this.coisa = coisa;
	}
	
	public Type abrir() {
		return coisa;
	}
}
