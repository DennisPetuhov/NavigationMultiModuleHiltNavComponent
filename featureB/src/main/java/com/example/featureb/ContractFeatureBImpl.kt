package com.example.featureb

import androidx.navigation.NavController
import com.example.core.ContractFeatureB
import javax.inject.Inject

class ContractFeatureBImpl @Inject constructor(private val navController: NavController) : ContractFeatureB {
    override fun navigateToFeatureB() {
        navController.navigate(R.id.feature_b_nav_graph)
    }
}