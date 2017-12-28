package com.example.uzair.booksharing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ArrayList<Book> users;
    ListView listView;
    private static CustomAdaptor adapter;
    private CustomAdaptor.ViewHolder view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.list1);
        users= new ArrayList<>();

        users.add(new Book("android", "suleman","03153420690", "Male"));
        for(int i=0;i<=1000;i++){
            users.add(new Book("android"+i,"suleman","600","male"));
        }
        adapter= new CustomAdaptor(users,this);
        listView.setAdapter(adapter);
        ///////////////////////
    }
}
