package com.example.sharjeel.cleanit;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.List;

public class SectionsPageAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragementList = new ArrayList<>();
    private final List<String> mFragementTitleList = new ArrayList<>();

    public void addFragment(Fragment fragment, String title){
        mFragementList.add(fragment);
        mFragementTitleList.add(title);
    }

    public SectionsPageAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragementTitleList.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragementList.get(position);
    }

    @Override
    public int getCount() {
        return mFragementList.size();
    }
}
