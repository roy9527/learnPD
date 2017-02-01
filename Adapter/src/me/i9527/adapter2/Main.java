package me.i9527.adapter2;

public class Main {

	public static void main(String[] args) {
		AdapterPrint2 print = new AdapterPrint2("this is Object Adapter.");
		print.printWeak();
		print.printStrong();
	}

}
