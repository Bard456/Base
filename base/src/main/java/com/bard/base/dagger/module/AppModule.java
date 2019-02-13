package com.bard.base.dagger.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @auth Bard
 * @time $DATA 10:34
 * By AndroidStudio 3.3.1
 */
@Module
public class AppModule {

    private Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    @Singleton
    public Context getContext() {
        return context;
    }
}
