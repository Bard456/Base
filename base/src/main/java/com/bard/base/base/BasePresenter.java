package com.bard.base.base;

public interface BasePresenter<T extends BaseView> {

    void attachView();

    void destroy();
}
