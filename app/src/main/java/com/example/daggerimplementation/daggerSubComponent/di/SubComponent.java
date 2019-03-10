package com.example.daggerimplementation.daggerSubComponent.di;

import com.example.daggerimplementation.daggerSubComponent.SubComponentActivity;

import dagger.Subcomponent;

@Subcomponent(modules = SubModule.class)
public interface SubComponent {
    void inject(SubComponentActivity activity);

    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(SubModule module);
        SubComponent build();
    }
}
