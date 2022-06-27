package demo.QuanLySach_LinkedList;

import java.util.LinkedList;

public class ListBook {
    private LinkedList<Book> textBook;
    public ListBook(){
        textBook = new LinkedList<>();
    }
    public void add(Book sp){
        textBook.add(sp);
    }
    public void display(){
        for ( Book sp : textBook) {

        }
    }
}
