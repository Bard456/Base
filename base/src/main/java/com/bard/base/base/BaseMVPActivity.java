package com.bard.base.base;

import android.os.Bundle;

import javax.inject.Inject;

public abstract class BaseMVPActivity<T extends BaseRxPresenter> extends BaseActivity {

    protected abstract void initInject();

    @Inject
    T mPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initInject();
        super.onCreate(savedInstanceState);

        if (mPresenter != null) {
            mPresenter.attachView();
        }
    }
}
