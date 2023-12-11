package com.example.navigationmultimodulehiltnavcomponent.di

import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.navigationmultimodulehiltnavcomponent.R
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

class MainModule {
}


@Module
@InstallIn(ActivityComponent::class)
class NavControllerModule {
    @Provides
    fun providesNAvController(activity: FragmentActivity): NavController {
        return NavHostFragment.findNavController(
            activity.supportFragmentManager.findFragmentById(
                R.id.fragmentContainerView
            )!!
        )
    }

}