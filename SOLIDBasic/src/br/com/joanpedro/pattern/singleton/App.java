package br.com.joanpedro.pattern.singleton;

public class App {
	public static void main(String[] args) {
		Downloader d = Downloader.getInstance();
		Downloader d2 = Downloader.getInstance();
		
		if(d == d2)
			System.out.println("They are the same");
		
		d.startDownloading();
		d2.startDownloading();
		
		SingletonClass.INSTANCE.setCounter(10);
		System.out.println(SingletonClass.INSTANCE.getCounter());
	}
}
