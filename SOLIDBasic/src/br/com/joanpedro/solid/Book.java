package br.com.joanpedro.solid;

public class Book implements BookHandler {

	private int numOfPages;
	private String authorName;

	public Book(String authorNmae, int numOfPages) {
		this.authorName = authorNmae;
		this.numOfPages = numOfPages;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return authorName + " - " + numOfPages;
	}

	@Override
	public void print() {
		System.out.println("Printing the book...");
	}

	@Override
	public void save() {
		System.out.println("Saving the book...");
	}

}
