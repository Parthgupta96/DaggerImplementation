package com.example.daggerimplementation.daggerSubComponent.di;

import com.example.daggerimplementation.daggerSubComponent.IndividualDependency;
import com.example.daggerimplementation.daggerSubComponent.IndividualDependency2;
import com.example.daggerimplementation.daggerSubComponent.ParentLevelDependency;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module
public class SubModule {

    @Reusable
    @Provides
    IndividualDependency providesIndividualDependency(ParentLevelDependency parentLevelDependency){
        return new IndividualDependency(parentLevelDependency);
    }

    @Provides
    IndividualDependency2 providesIndividualDependency2(ParentLevelDependency parentLevelDependency){
        return new IndividualDependency2(parentLevelDependency);
    }
}
