package project.libraryManager.service;

import OnTap_Module_2.PhoneManager.Exception.NotFoundException;
import project.libraryManager.model.Book;
import project.libraryManager.util.FileHelper;

import java.util.ArrayList;
import java.util.List;

public class LibraryManager {
    public List<Book> books = new ArrayList<>();
    FileHelper fileHelper = new FileHelper();
    private static final String PATH ="src/project/libraryManager/library.txt";
//    add
    public void addBook(Book b){
        int lastID = 0;
        if (books.size()>0){
            lastID = books.get(books.size()-1).getId();
        }
        b.setId(lastID+1);
        books.add(b);
    }
//    display
    public List<Book> display(){
        return books;
    }

    //delete
    public void delete(int id) throws NotFoundException {
        for (int i = 0;i<books.size();i++){
            if (books.get(i).getId() == id){
                books.remove(i);
                return;
            }
        }
        throw new NotFoundException("xoa that bai");

    }
//    search

    public List<Book> search(String name){
        List<Book> result = new ArrayList<>();
        for (int i = 0;i<books.size();i++){
            if (books.get(i).getName().equalsIgnoreCase(name)){
                result.add(books.get(i));
            }
        }
        return result;
    }
}
