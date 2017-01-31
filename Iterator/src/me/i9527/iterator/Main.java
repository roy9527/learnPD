package me.i9527.iterator;

public class Main {

	public static void main(String[] args) {
		
		BookShelf bs = new BookShelf();
		bs.appendBook(new Book("A", "a"));
		bs.appendBook(new Book("B", "b"));
		bs.appendBook(new Book("C", "c"));
		bs.appendBook(new Book("D", "d"));
		bs.appendBook(new Book("E", "e"));
		bs.appendBook(new Book("F", "f"));
		bs.appendBook(new Book("G", "g"));
		bs.appendBook(new Book("H", "h"));
		
		while (bs.iterator().hasNext()) {
			Book book = bs.iterator().next();
			System.out.println(book.toString());
		}
		
	}

}
