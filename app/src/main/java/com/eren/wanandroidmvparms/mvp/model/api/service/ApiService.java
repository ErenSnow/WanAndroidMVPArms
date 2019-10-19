package com.eren.wanandroidmvparms.mvp.model.api.service;

import com.eren.wanandroidmvparms.mvp.model.entity.BaseResponse;
import com.eren.wanandroidmvparms.mvp.model.entity.HomeArticleBean;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * 存放关于用户的一些 API
 */
public interface ApiService {

    /**
     * 首页文章列表
     *
     * @param page 页数
     */
    @GET("article/list/{page}/json")
    Observable<BaseResponse<HomeArticleBean>> getHomeArticle(@Path("page") int page);
}
