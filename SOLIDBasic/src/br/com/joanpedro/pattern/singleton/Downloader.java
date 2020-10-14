package br.com.joanpedro.pattern.singleton;

public class Downloader {
	
	// Eager
	private static Downloader downloader = new Downloader();
	
	private Downloader() {
		
	}
	
	public void startDownloading() {
		System.out.println("Start downloading data from the web...");
	}
	
	// Lazy version
	public static Downloader getInstance() {
		if(downloader == null)
			downloader = new Downloader();

		return Downloader.downloader;
	}
}
