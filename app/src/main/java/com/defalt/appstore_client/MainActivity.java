package com.defalt.appstore_client;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

import com.defalt.appstore_client.base.BaseActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity {

    @BindView(R2.id.content_layout)
    public FrameLayout content;
    @BindViews({R2.id.btn_home, R2.id.btn_game, R2.id.btn_billboard, R2.id.btn_article, R2.id.btn_mine})
    public List<Button> buttomBtnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
