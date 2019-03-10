package com.example.daggerimplementation.daggerSubComponent.di;

import android.content.Context;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = ParentModule.class)
//@Singleton
public interface ParentComponent {

    SubComponent.Builder getSubComponent();

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);
        //use builderInstance when we need to pass dependency to module
        // instead of creating variable in module

        ParentComponent build();
    }
}
