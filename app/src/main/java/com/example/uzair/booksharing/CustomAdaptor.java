package com.example.uzair.booksharing;

/**
 * Created by UZAIR on 12/25/2017.
 */


import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.view.View.OnClickListener;


public class CustomAdaptor extends ArrayAdapter<Book> {
    private ArrayList<Book> list;
    Activity context;

    class ViewHolder {
        TextView book_title;

        TextView book_price;
        ImageView info;
        Button btn;
        TextView book_writer;
    }

    public CustomAdaptor(ArrayList<Book> data, Activity context) {
        super(context, R.layout.list_view, data);
        this.list = data;
        this.context = context;
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Book dataModel = this.list.get(position);
        final ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_view, parent, false);
            viewHolder.book_title = (TextView) convertView.findViewById(R.id.book_title);
            viewHolder.book_writer = (TextView) convertView.findViewById(R.id.book_writer);
            viewHolder.book_price = (TextView) convertView.findViewById(R.id.book_price);
            viewHolder.info = (ImageView) convertView.findViewById(R.id.ivContactImage);
            viewHolder.btn =(Button)convertView.findViewById(R.id.details);
            viewHolder.btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent=new Intent(context,BookDetailActivity.class);
                    String s=context.getTheme().toString();
                    intent.putExtra("get",s);
                    context.startActivity(intent);
                }
            });
            Intent i=new Intent();
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        lastPosition = position;
        viewHolder.book_title.setText(dataModel.getName());
        viewHolder.book_writer.setText(dataModel.getBook_writer());
        viewHolder.book_price.setText(dataModel.getNumber());
        viewHolder.info.setTag(position);
        return convertView;
    }
}
