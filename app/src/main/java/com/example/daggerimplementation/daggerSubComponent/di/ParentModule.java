package com.example.daggerimplementation.daggerSubComponent.di;

import android.content.Context;

import com.example.daggerimplementation.daggerSubComponent.Navigator;
import com.example.daggerimplementation.daggerSubComponent.ParentLevelDependency;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module(subcomponents = SubComponent.class)
public class ParentModule {

    @Reusable
    @Provides
    ParentLevelDependency providesParentLevelDependency() {
        return new ParentLevelDependency();
    }

    @Provides
    Navigator providesNavigator(Context context) {
        return new Navigator(context);
    }
}
