package me.i9527.adapter;

public class AdapteeBanner {

	private String text;
	
	public AdapteeBanner(String text) {
		this.text = text;
	}
	
	public void showWeak(){
		System.out.println("(" + text + ")");
	}
	public void showStrong(){
		System.out.println("*" + text + "*");
	}
}
