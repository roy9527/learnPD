package me.i9527.adapter2;

public class AdapteeBanner2 {

	private String text;
	
	public AdapteeBanner2(String text) {
		this.text = text;
	}
	
	public void showWeak(){
		System.out.println("(" + text + ")");
	}
	public void showStrong(){
		System.out.println("*" + text + "*");
	}
}
