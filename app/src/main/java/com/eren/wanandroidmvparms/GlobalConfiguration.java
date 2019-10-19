package com.eren.wanandroidmvparms;

import android.app.Application;
import android.content.Context;

import androidx.fragment.app.FragmentManager;

import com.jess.arms.base.delegate.AppLifecycles;
import com.jess.arms.di.module.GlobalConfigModule;
import com.jess.arms.integration.ConfigModule;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.List;

/**
 * ConfigModule 用来给框架配置各种自定义属性和功能
 */
public class GlobalConfiguration implements ConfigModule {
    @Override
    public void applyOptions(@NotNull Context context, GlobalConfigModule.Builder builder) {
        //使用 builder 可以为框架配置一些配置信息
        builder.baseurl(Api.BASE_URL)
                .cacheFile(new File("mvp_arms_cache"));
    }

    @Override
    public void injectAppLifecycle(@NotNull Context context, @NotNull List<AppLifecycles> lifeCycles) {
        // 向 Application的 生命周期中注入一些自定义逻辑
    }

    @Override
    public void injectActivityLifecycle(@NotNull Context context, @NotNull List<Application.ActivityLifecycleCallbacks> lifeCycles) {
        // 向 Activity 的生命周期中注入一些自定义逻辑
    }

    @Override
    public void injectFragmentLifecycle(@NotNull Context context, @NotNull List<FragmentManager.FragmentLifecycleCallbacks> lifeCycles) {
        // 向 Fragment 的生命周期中注入一些自定义逻辑
    }
}
