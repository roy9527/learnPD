package me.i9527.adapter;

public class Main {

	public static void main(String[] args) {
		TargetPrint print = new AdapterPrint("this is Adapter pattern.");
		print.printWeak();
		print.printStrong();
	}

}
