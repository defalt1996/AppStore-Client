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

    }


    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);

        //因为需要在setContentView之后bind Butterknife，所以重写加入bind
        ButterKnife.bind(this);
    }

}
