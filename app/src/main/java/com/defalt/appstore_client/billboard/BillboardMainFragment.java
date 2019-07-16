package com.defalt.appstore_client.billboard;
/*
 *  author: Derrick
 *  Time: 2019/7/10 22:17
 */

import android.os.Bundle;

import me.yokeyword.fragmentation.SupportFragment;

public class BillboardMainFragment extends SupportFragment {

    public static BillboardMainFragment newInstance() {

        Bundle args = new Bundle();

        BillboardMainFragment fragment = new BillboardMainFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
