package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_Customer extends Fragment {

    TextView txt_name,txt_type,txt_balance;
    Account account;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_fragment_customer,container,false);

        txt_name=view.findViewById(R.id.txt_name);
        txt_type=view.findViewById(R.id.txt_accounttype);
        txt_balance=view.findViewById(R.id.txt_balance);

        txt_name.setText(account.getName().toString());
        txt_type.setText(account.getType().toString());
        txt_balance.setText(String.valueOf(account.getBalance()));

        return view;
    }

    public void setAccount(Account acc){
        account=acc;
    }
}
