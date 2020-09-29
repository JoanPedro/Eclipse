package oo.herenca;

public class Jogo {
	public static void main(String[] args) {
		Jogador montro = new Monstro();
		montro.x = 10;
		montro.y = 10;

		Jogador heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;

		System.out.println("Monstro tem => " + montro.vida);
		System.out.println("Heroi tem => " + heroi.vida);

		montro.atacar(heroi);
		heroi.atacar(montro);

		System.out.println("Monstro tem => " + montro.vida);
		System.out.println("Heroi tem => " + heroi.vida);

		System.out.printf("Direcao X: %d; Direcao Y: %d", montro.x, montro.y);
	}
}
