package com.bard.base.dagger.component;

import android.content.Context;

import com.bard.base.dagger.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @auth Bard
 * @time $DATA 15:10
 * By AndroidStudio 3.3.1
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Context getContext();
}
