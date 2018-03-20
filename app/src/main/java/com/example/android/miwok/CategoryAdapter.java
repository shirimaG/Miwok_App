package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by GOODLUCK on 3/20/2018.
 */

public class CategoryAdapter extends FragmentPagerAdapter{

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if (position==0){
            return new NumbersFragment();
        } else if (position==1){
            return new FamilyFragment();
        } else if (position==2){
            return new ColorsFragment();
        } else {
            return new PhraseFragment();
        }
    }

    @Override
    public int getCount() {
        //we need four pages thats why we return 4 as count
        return 4;
    }
}
