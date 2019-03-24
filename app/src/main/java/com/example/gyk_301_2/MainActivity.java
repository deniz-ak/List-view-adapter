package com.example.gyk_301_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView ;
    private ArrayList<Book> bookList ;
    private List_View_Adapter listViewAdapter ;
    private Book book,book1,book2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        bookList = new ArrayList<>();

        book = new Book ("Empati","Adam Fawor");
        book1 = new Book ("Aklında Bir Sayı Tut","Adam Fawor");
        book2 = new Book ("Olasılıksız","Adam Fawor");

        bookList.add(book);
        bookList.add(book1);
        bookList.add(book);
        bookList.add(book1);
        bookList.add(book);
        bookList.add(book1);
        bookList.add(book);
        bookList.add(book1);
        bookList.add(book);
        bookList.add(book1);
        bookList.add(book);
        bookList.add(book1);
        bookList.add(book2);



        listViewAdapter = new List_View_Adapter(MainActivity.this,bookList);
        listView.setAdapter(listViewAdapter);//gelen booklisti arayüze bas.


    }
}
