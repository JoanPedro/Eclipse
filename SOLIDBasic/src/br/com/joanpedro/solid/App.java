package br.com.joanpedro.solid;

import br.com.joanpedro.solid.interfaceSegregation.BalanceTree;
import br.com.joanpedro.solid.interfaceSegregation.BinarySearchTree;
import br.com.joanpedro.solid.interfaceSegregation.Tree;

public class App {

	public static void main(String[] args) {
		Tree binarySearchTree = new BinarySearchTree();
		Tree balanceTree = new BalanceTree();
	}
}
