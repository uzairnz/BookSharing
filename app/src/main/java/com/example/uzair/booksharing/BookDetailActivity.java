package com.example.uzair.booksharing;

/**
 * Created by UZAIR on 12/25/2017.
 */


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BookDetailActivity extends AppCompatActivity {
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);
        text=findViewById(R.id.extra);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();

        if(b!=null)
        {
            String j =(String) b.get("get");
            text.setText(j);
        }
    }
}