package com.live.eggplantshow.dagger.component;

import com.bard.base.dagger.ActivityScope;
import com.bard.base.dagger.component.AppComponent;
import com.bard.base.dagger.component.BaseActivityComponent;
import com.bard.base.dagger.module.ActivityModule;

import dagger.Component;

/**
 * @auth Bard
 * @time 2019/2/13 16:03
 * By AndroidStudio 3.3.1
 */
@ActivityScope
@Component(modules = ActivityModule.class, dependencies = AppComponent.class)
public interface ActivityComponent extends BaseActivityComponent {

}
