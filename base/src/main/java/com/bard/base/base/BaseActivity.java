package com.bard.base.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    public abstract int getLayoutId();

    public abstract void initView(Bundle savedInstanceState);

    public abstract void initDate();

    protected Activity mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());

        mActivity = this;

        initView(savedInstanceState);
        initDate();
    }
}
