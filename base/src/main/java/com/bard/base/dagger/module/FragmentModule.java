package com.bard.base.dagger.module;

import android.support.v4.app.Fragment;

import com.bard.base.dagger.FragmentScope;

import dagger.Module;
import dagger.Provides;

/**
 * @auth Bard
 * @time 2019/2/13 16:48
 * By AndroidStudio 3.3.1
 */
@Module
public class FragmentModule {
    private Fragment fragment;

    public FragmentModule(Fragment fragment) {
        this.fragment = fragment;
    }

    @Provides
    @FragmentScope
    public Fragment getFragment() {
        return fragment;
    }
}
