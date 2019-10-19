package com.eren.wanandroidmvparms.mvp.model;


import com.eren.wanandroidmvparms.mvp.contract.TestContract;
import com.eren.wanandroidmvparms.mvp.model.entity.BaseResponse;
import com.eren.wanandroidmvparms.mvp.model.entity.HomeArticleBean;
import com.jess.arms.di.scope.ActivityScope;
import com.jess.arms.integration.IRepositoryManager;
import com.jess.arms.mvp.BaseModel;

import javax.inject.Inject;

import io.reactivex.Observable;


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
public class TestModel extends BaseModel implements TestContract.Model {

    @Inject
    public TestModel(IRepositoryManager repositoryManager) {
        super(repositoryManager);
    }

    @Override
    public Observable<BaseResponse<HomeArticleBean>> getHomeArticle(int page, boolean update) {
        // 正常网络操作
//        return Observable.just(mRepositoryManager
//                .obtainRetrofitService(ApiService.class)
//                .getHomeArticle(page))
//                // 可选缓存操作
//                .flatMap(new Function<Observable<BaseResponse<HomeArticleBean>>, ObservableSource<BaseResponse<HomeArticleBean>>>() {
//
//                    @Override
//                    public ObservableSource<BaseResponse<HomeArticleBean>> apply(@NonNull Observable<BaseResponse<HomeArticleBean>> baseResponseObservable) throws Exception{
//                        return mRepositoryManager.obtainCacheService(CommonCache.class)
//                                .getHomeArticle(baseResponseObservable
//                                ,new DynamicKey(page)
//                                ,new EvictDynamicKey(update))
//                                .map(listReply -> listReply.getData());
//                    }
//                });

        return null;
    }
}