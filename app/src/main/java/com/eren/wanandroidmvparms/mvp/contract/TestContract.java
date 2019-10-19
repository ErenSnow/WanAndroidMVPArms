package com.eren.wanandroidmvparms.mvp.contract;

import com.eren.wanandroidmvparms.mvp.model.entity.BaseResponse;
import com.eren.wanandroidmvparms.mvp.model.entity.HomeArticleBean;
import com.jess.arms.base.DefaultAdapter;
import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;
import com.tbruyelle.rxpermissions2.RxPermissions;

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
public interface TestContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {
        void setAdapter(DefaultAdapter adapter);

        void startLoadMore();

        void endLoadMore();

        //申请权限
        RxPermissions getRxPermissions();
    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        /**
         *
         * @param page 页数
         * @param update 是否更新数据
         */
        Observable<BaseResponse<HomeArticleBean>> getHomeArticle(int page, boolean update);
    }
}
