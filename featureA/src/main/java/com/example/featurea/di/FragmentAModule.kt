package com.example.featurea.di

import com.example.core.ContractFeatureA
import com.example.featurea.ContractFeatureAImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class FragmentAModule {
    @Binds
    abstract fun providesContractFeatureAInterface(contractFeatureAImpl: ContractFeatureAImpl): ContractFeatureA
}