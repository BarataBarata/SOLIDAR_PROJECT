package com.example.tabs;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapder  extends FragmentPagerAdapter  {

    private  int tabsNumber;

    public PageAdapder(@NonNull FragmentManager fm, int behavior,int tabsNumbe) {
        super(fm, behavior);
        this.tabsNumber=tabsNumbe;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return  new Fragment1();
            case 1:
                return new Fragment2();
            case 2: {
                return new Fragment3();

            }
            default: return  null;
        }
    }

    @Override
    public int getCount() {
        return tabsNumber;
    }
}
