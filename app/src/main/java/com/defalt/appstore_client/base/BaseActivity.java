package com.defalt.appstore_client.base;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.defalt.appstore_client.R;

import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportActivity;

public class BaseActivity extends SupportActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);

    }

//    @Override
//    public void setContentView(View view) {
//        super.setContentView(view);
//        ButterKnife.bind(this);
//    }
//
//    @Override
//    public void setContentView(int layoutResID) {
//        super.setContentView(layoutResID);
//        ButterKnife.bind(this);
//    }
//
//    @Override
//    public void setContentView(View view, ViewGroup.LayoutParams params) {
//        super.setContentView(view, params);
//        ButterKnife.bind(this);
//    }

}
