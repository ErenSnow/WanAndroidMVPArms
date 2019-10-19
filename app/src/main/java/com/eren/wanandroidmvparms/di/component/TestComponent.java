package com.eren.wanandroidmvparms.di.component;

import com.eren.wanandroidmvparms.di.module.TestModule;
import com.eren.wanandroidmvparms.mvp.contract.TestContract;
import com.eren.wanandroidmvparms.mvp.ui.activity.TestActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;

import dagger.BindsInstance;
import dagger.Component;


/**
 * ================================================
 * Description:
 * <p>
 * Created by MVPArmsTemplate on 10/19/2019 15:19
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms">Star me</a>
 * <a href="https://github.com/JessYanCoding/MVPArms/wiki">See me</a>
 * <a href="https://github.com/JessYanCoding/MVPArmsTemplate">模版请保持更新</a>
 * ================================================
 */
@ActivityScope
@Component(modules = TestModule.class, dependencies = AppComponent.class)
public interface TestComponent {
    void inject(TestActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        TestComponent.Builder view(TestContract.View view);

        TestComponent.Builder appComponent(AppComponent appComponent);

        TestComponent build();
    }
}