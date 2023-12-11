package com.example.featurea

import androidx.navigation.NavController
import com.example.core.ContractFeatureA
import javax.inject.Inject

class ContractFeatureAImpl @Inject constructor(private val navController: NavController) :
    ContractFeatureA {
    override fun navigateToFeatureA() {
        navController.navigate(R.id.feature_a_nav_graph)
    }
}