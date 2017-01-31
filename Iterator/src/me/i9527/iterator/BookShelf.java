package me.i9527.iterator;

import java.util.ArrayList;

public class BookShelf implements Aggregate<Book> {

	private ArrayList<Book> list;
	
	private BookShelfIterator iterator;
	
	public BookShelf() {
		list = new ArrayList<Book>();
		iterator = new BookShelfIterator(list);
	}
	
	public boolean appendBook(Book book) {
		return list.add(book);
	}
	
	public int bookSize() {
		return list.size();
	}
	
	public boolean deleteBook(int index) {
		return list.remove(index) != null;
	}
	
	public boolean deleteBook(Book book) {
		return list.remove(book);
	}
	
	public Book getBook(int index) {
		return list.get(index);
	}
	
	@Override
	public Iterator<Book> iterator() {
		return iterator;
	}

}
