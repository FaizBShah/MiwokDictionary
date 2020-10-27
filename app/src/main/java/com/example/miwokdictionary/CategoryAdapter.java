package com.example.miwokdictionary;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.mContext = context;
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

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0) {
            return mContext.getString(R.string.category_numbers);
        }
        else if(position == 1) {
            return mContext.getString(R.string.category_family);
        }
        else if(position == 2) {
            return mContext.getString(R.string.category_colors);
        }
        else {
            return mContext.getString(R.string.category_phrases);
        }
    }

    @Override
    public int getCount() {
        // Returning the total no. of fragments in the ViewPager
        return 4;
    }
}
