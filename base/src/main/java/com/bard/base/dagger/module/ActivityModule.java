package com.bard.base.dagger.module;

import android.app.Activity;

import com.bard.base.dagger.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * @auth Bard
 * @time 2019/2/13 16:05
 * By AndroidStudio 3.3.1
 */
@Module
public class ActivityModule {
    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Provides
    public Activity getActivity() {
        return activity;
    }
}
