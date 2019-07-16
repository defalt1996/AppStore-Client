package com.defalt.appstore_client;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.defalt.appstore_client.base.BaseActivity;
import com.defalt.appstore_client.base.baseview.MainFragment;

import butterknife.BindView;
import me.yokeyword.fragmentation.anim.DefaultHorizontalAnimator;
import me.yokeyword.fragmentation.anim.FragmentAnimator;

public class MainActivity extends BaseActivity {

    @BindView(R2.id.content_layout)
    public FrameLayout content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //加载fragment
        if (findFragment(MainFragment.class) == null){
            loadRootFragment(R.id.content_layout, MainFragment.newInstance());
        }
    }

    @Override
    public void onBackPressedSupport() {
        super.onBackPressedSupport();
    }

    @Override
    public FragmentAnimator onCreateFragmentAnimator() {
        // 设置横向(和安卓4.x动画相同)
        return new DefaultHorizontalAnimator();
    }
}
