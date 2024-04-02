package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class MyFragmentAdapter extends FragmentStateAdapter {

    ArrayList<Fragment_Customer> customer_fragments=new ArrayList<Fragment_Customer>();
    public MyFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return customer_fragments.get(position);
    }

    public void add(Fragment_Customer fc){
        customer_fragments.add(fc);
    }

    @Override
    public int getItemCount() {
        return customer_fragments.size();
    }
}
