package com.test.newsapp.di.component


import com.mindorks.bootcamp.learndagger.di.ActivityScope
import com.test.newsapp.di.module.ActivityModule
import com.test.newsapp.ui.main.NewsHomeActivity
import com.test.newsapp.ui.main.home.HomeActivity
import com.test.newsapp.ui.main.home.HomeFragment

import dagger.Component

@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: NewsHomeActivity)

    fun inject(activity: HomeFragment)

}
