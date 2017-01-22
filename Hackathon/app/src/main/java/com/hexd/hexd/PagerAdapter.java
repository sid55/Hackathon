package com.hexd.hexd;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sidharth on 12/23/2015.
 */
public class PagerAdapter extends FragmentPagerAdapter{

    public PagerAdapter(FragmentManager fm){
         super(fm);
    }

    @Override
    public Fragment getItem(int arg0) {
        while (arg0 == 0) {
            return new FragmentOne();
        }
        while (arg0 == 1) {
            return new FragmentTwo();
        }
        while (arg0 == 2) {
            return new FragmentThree();
        }
        return null;
    }

    public int getCount(){
        return 3;
    }
}
