package com.example.week11;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    ArrayList<Customer> customers;
    LayoutInflater inflater;

    public MyAdapter(ArrayList<Customer> customers, Context context) {
        this.customers = customers;
        this.inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.activity_rv_item,parent,false);
        MyViewHolder viewHolder=new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Customer customer=customers.get(position);
        holder.setData(customers,position);
    }

    @Override
    public int getItemCount() {
        return customers.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView txt_vh_name, txt_vh_mail, txt_vh_phone,txt_vh_city, txt_vh_date;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txt_vh_name=itemView.findViewById(R.id.txt_rv_name);
            txt_vh_mail=itemView.findViewById(R.id.txt_rv_mail);
            txt_vh_phone=itemView.findViewById(R.id.txt_rv_phone);
            txt_vh_city=itemView.findViewById(R.id.txt_rv_city);
            txt_vh_date=itemView.findViewById(R.id.txt_rv_date);
        }

        public void setData(ArrayList<Customer> customers, int position){
            txt_vh_name.setText(customers.get(position).getName_surname());
            txt_vh_date.setText(customers.get(position).getDate().toString());
            txt_vh_city.setText(customers.get(position).getCity().toString());
            txt_vh_phone.setText(customers.get(position).getPhone().toString());
            txt_vh_mail.setText(customers.get(position).getMail().toString());
        }
    }
}
