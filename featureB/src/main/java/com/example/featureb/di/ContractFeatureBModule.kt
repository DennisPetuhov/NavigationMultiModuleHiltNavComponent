package com.example.featureb.di

import com.example.core.ContractFeatureB
import com.example.featureb.ContractFeatureBImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class ContractFeatureBModule {

    @Binds
 abstract   fun provideFeatureB(contractFeatureBImpl: ContractFeatureBImpl): ContractFeatureB


}