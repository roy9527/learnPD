package me.i9527.adapter;

public class AdapterPrint extends AdapteeBanner implements TargetPrint{

	public AdapterPrint(String text) {
		super(text);
	}

	@Override
	public void printWeak() {
		showWeak();
	}

	@Override
	public void printStrong() {
		showStrong();
	}

}
