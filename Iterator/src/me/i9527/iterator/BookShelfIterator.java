package me.i9527.iterator;

import java.util.List;

public class BookShelfIterator implements Iterator<Book> {

//	private BookShelf shelf;
	private int index;
	private List<Book> list;
	
	public BookShelfIterator(List<Book> list) {
//		this.shelf = shelf;
		index = 0;
		this.list = list;
	}

	@Override
	public boolean hasNext() {
		return index < list.size();
	}

	@Override
	public Book next() {
		Book book = list.get(index);
		index++;
		return book;
	}

}
