package com.example.daggerex7;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component (modules = {WheelModule.class, PetrolEngineModule.class})

public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        CarComponent build();

    }

}
