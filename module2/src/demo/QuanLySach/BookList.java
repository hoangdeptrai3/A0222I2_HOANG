package demo.QuanLySach;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BookList {
    private ArrayList<Book> books;
    public BookList(){
        books = new ArrayList<>();
    }

    public BookList(ArrayList<Book> books) {
        this.books = books;
    }
//    1.add book
    public void addBook(Book sach){
        this.books.add(sach);
    }
//    2. remove book theo id
    public boolean removeBook(Book sp){
        return this.books.remove(sp);
    }
//    3. display list book
    public void displayListBook(){
        for (Book sp : books) {
            System.out.println(sp);
        }
    }
//    4.sap xe tang theo gia
    public void sapXepTang(){
        Collections.sort(this.books, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                if (book1.getPriceBook()> book2.getPriceBook()){
                    return 1;
                }else if (book1.getPriceBook()< book2.getPriceBook()){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
}
