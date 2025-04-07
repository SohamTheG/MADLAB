package com.example.lab3q1;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
public class ViewPagerMessengerAdapter extends FragmentPagerAdapter {
    public ViewPagerMessengerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new Fragment1();
        }else if(position==1){
            return new Fragment2();
        }else if(position==2){
            return new Fragment3();
        }else{
            return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "new Fragment1";
        }else if(position==1){
            return "new Fragment2";
        }else if(position==2){
            return "new Fragment3";
        }else{
            return null;
        }
    }
}
