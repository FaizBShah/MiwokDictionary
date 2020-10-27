package com.example.miwokdictionary;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        // Setting which fragment to show at what position in the ViewPager
        if (position == 0) {
            return new NumbersFragment();
        }
        else if (position == 1) {
            return new FamilyFragment();
        }
        else if (position == 2) {
            return new ColorsFragment();
        }
        else {
            return new PhrasesFragment();
        }
    }

    @Override
    public int getCount() {
        // Returning the total no. of fragments in the ViewPager
        return 4;
    }
}
