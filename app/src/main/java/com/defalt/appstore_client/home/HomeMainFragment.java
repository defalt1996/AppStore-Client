package com.defalt.appstore_client.home;
/*
 *  author: Derrick
 *  Time: 2019/7/10 16:03
 */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.defalt.appstore_client.R;
import com.defalt.appstore_client.home.adapter.HomeFragmentAdapter;
import com.google.android.material.tabs.TabLayout;

import me.yokeyword.fragmentation.SupportFragment;

public class HomeMainFragment extends SupportFragment {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public static HomeMainFragment newInstance() {
        Bundle args = new Bundle();
        HomeMainFragment fragment = new HomeMainFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_main, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        tabLayout = view.findViewById(R.id.tab);
        viewPager = view.findViewById(R.id.viewpager);

        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
    }

    @Override
    public void onLazyInitView(@Nullable Bundle savedInstanceState) {
        super.onLazyInitView(savedInstanceState);
        viewPager.setAdapter(new HomeFragmentAdapter(getChildFragmentManager(), "home_recommend", "home_essential", "home_freefiction", "home_category"));
        tabLayout.setupWithViewPager(viewPager);
    }
}
