package com.example.challenge;

import android.app.Application;

import java.util.ArrayList;

public class AplicathionClass extends Application {

   public static ArrayList <Book> books;

    @Override
    public void onCreate() {
        super.onCreate();

    books = new ArrayList<Book>();

        books.add(new Book("lkfklmfkm","mdflmf","romance"));
        books.add(new Book("lkfklmfkm","mdflmf","drama"));
        books.add(new Book("lkfklmfkm","mdflmf","drama"));
        books.add(new Book("lkfklmfkm","mdflmf","scfi"));
        books.add(new Book("lkfklmfkm","mdflmf","scfi"));
        books.add(new Book("lkfklmfkm","mdflmf","drama"));
        books.add(new Book("lkfklmfkm","mdflmf","romance"));
        books.add(new Book("lkfklmfkm","mdflmf","romance"));


    }
}
