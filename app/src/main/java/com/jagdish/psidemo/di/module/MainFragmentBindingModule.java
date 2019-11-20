package com.jagdish.psidemo.di.module;

import com.jagdish.psidemo.ui.fragments.MainFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBindingModule {

    @ContributesAndroidInjector
    abstract MainFragment provideMainFragment();

}
