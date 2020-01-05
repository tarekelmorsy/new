package com.example.challenge;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdabter extends RecyclerView{

    private ArrayList<Book> book;
    private  ItemClicd activety ;

    public interface ItemClicd
    {

        void onitemclecd(int index);
    }
    public  BookAdabter (Context context , ArrayList<Book> list){
        super(context);


        book = list;
        activety = (ItemClicd) context;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivganre;
        TextView tvtitel,tvAuthor;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            ivganre = itemView.findViewById(R.id.ivganre);
            tvtitel =itemView.findViewById(R.id.tvtitel);
            tvAuthor = itemView.findViewById(R.id.tvAuthor);

            itemView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

        }



    }

    public BookAdabter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);


        return    new ViewHolder(v);
    }


    public void onBindViewHolder(@NonNull BookAdabter.ViewHolder holder, int position) {

        holder.itemView.setTag(book.get(position));
        holder.tvtitel.setText(book.get(position).getTitle());
        holder.tvAuthor.setText(book.get(position).getAuthor());
        if(book.get(position).getGener().equals("scfi")){

            holder.ivganre.setImageResource(R.drawable.scfi);


        }else if(book.get(position).getGener().equals("drama")){

            holder.ivganre.setImageResource(R.drawable.drama);


        }else {

            holder.ivganre.setImageResource(R.drawable.romance);


        }

        return ;}

    public int getItemCount() {
        return book.size();
    }


}
