package me.i9527.adapter2;

public class AdapterPrint2 extends TargetPrint2{

	AdapteeBanner2 banner;
	
	public AdapterPrint2(String text) {
		banner = new AdapteeBanner2(text);
	}
	
	@Override
	public void printWeak() {
		banner.showWeak();
	}

	@Override
	public void printStrong() {
		banner.showStrong();
	}

}
