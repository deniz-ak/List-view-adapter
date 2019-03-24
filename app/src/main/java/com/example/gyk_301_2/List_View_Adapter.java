package com.example.gyk_301_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class List_View_Adapter extends ArrayAdapter<Book> {

    private final LayoutInflater inflater ; // inflater ile contexte hangi arayüz oldugunu gösteriyoruz.
    private final Context context ; //arayüz
    private ViewHolder viewHolder ; //inner classım
    private final ArrayList<Book> book_list ;


    public  static class ViewHolder
    {
        TextView tv_book_name, tv_book_author ;
    }

    public List_View_Adapter(Context context, ArrayList<Book> book_list) {
        super(context, 0, book_list);
        this.context = context ;
        this.book_list = book_list;

        inflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView = inflater.inflate(R.layout.list_item_view,null); //list item viewımız aslında.Her bir itema ulaşabildik.
        viewHolder = new ViewHolder();
        viewHolder.tv_book_name = convertView.findViewById(R.id.tv_book_name);
        viewHolder.tv_book_author = convertView.findViewById(R.id.tv_book_author);

        convertView.setTag(viewHolder); //Arayüze hangi class olduğunu tanımladık.

        Book book = book_list.get(position) ;//listedeki her elemanla booklist yarattık.

        viewHolder.tv_book_name.setText(book.getBook_name()); //arayüze nesneleri set etme.
        viewHolder.tv_book_author.setText(book.getBook_author());

        return convertView ;
    }

    @Override
    public Book getItem(int position)
    {
        return book_list.get(position);
        //book_list'in her bir elemanını döner. Hangi parametre verirsen onu döner.
    }

    @Override
    public int getCount()
    {
        return book_list.size(); //size döner.
    }


}

