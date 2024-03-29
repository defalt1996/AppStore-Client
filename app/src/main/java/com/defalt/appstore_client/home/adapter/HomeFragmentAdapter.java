package com.defalt.appstore_client.home.adapter;
/*
 *  author: Derrick
 *  Time: 2019/7/15 23:26
 */

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.defalt.appstore_client.home.category.CategoryFragment;
import com.defalt.appstore_client.home.essential.EssentialFragment;
import com.defalt.appstore_client.home.freefiction.FreeFictionFragment;
import com.defalt.appstore_client.home.recommend.RecommendFragment;

public class HomeFragmentAdapter extends FragmentPagerAdapter {

    private String[] mTitles;

    public HomeFragmentAdapter(@NonNull FragmentManager fm, String... titles) {
        super(fm);
        mTitles = titles;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return RecommendFragment.newInstance();
            case 1:
                return EssentialFragment.newInstance();
            case 2:
                return FreeFictionFragment.newInstance();
            case 3:
                return CategoryFragment.newInstance();
        }
        return RecommendFragment.newInstance();
    }

    @Override
    public int getCount() {
        return mTitles.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles[position];
    }
}
