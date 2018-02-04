package com.mukesh.project.com.mukesh.project.module;

import com.google.inject.AbstractModule;
import com.mukesh.project.com.mukesh.project.impl.DummyStudentStore;
import com.mukesh.project.com.mukesh.project.impl.LenientRegistrar;
import com.mukesh.project.inter.Registrar;
import com.mukesh.project.inter.StudentStore;

public class SimpleModule extends AbstractModule {
    @Override
    protected void configure() {

        bind(StudentStore.class).to(DummyStudentStore.class);

        bind(Registrar.class).to(LenientRegistrar.class);
    }

}
