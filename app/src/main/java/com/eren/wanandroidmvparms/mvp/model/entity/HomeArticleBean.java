package com.eren.wanandroidmvparms.mvp.model.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页文章列表实例
 */
public class HomeArticleBean {

    /**
     * curPage : 2
     * datas : [{"apkLink":"","audit":1,"author":"qq_35561554","chapterId":468,"chapterName":"Glide","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9097,"link":"https://blog.csdn.net/qq_35561554/article/details/100618455","niceDate":"2019-09-09","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1568008177000,"shareDate":null,"shareUser":"","superChapterId":461,"superChapterName":"常见开源库源码解析","tags":[],"title":"Glide加载流程分析","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"xiaoyang","chapterId":440,"chapterName":"官方","collect":false,"courseId":13,"desc":"<p>上次我们问了<a href=\"https://www.wanandroid.com/wenda/show/9067\">每日一问 关于 R.java 的生成规则，你知道多少？\r\n<\/a>，但是一个有用的知识点还是没弄清楚。<\/p>\r\n<p>对于不同的 module 下，同名但值不同的资源，最终：<\/p>\r\n<ol>\r\n<li>会被覆盖成其中一个资源吗？<\/li>\r\n<li>如果会，那么覆盖的规则是，随机吗？<\/li>\r\n<\/ol>","envelopePic":"","fresh":false,"id":9088,"link":"https://www.wanandroid.com/wenda/show/9088","niceDate":"2019-09-09","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567959553000,"shareDate":null,"shareUser":"鸿洋","superChapterId":440,"superChapterName":"问答","tags":[{"name":"问答","url":"/article/list/0?cid=440"}],"title":"每日一问  项目中同名资源，会不会覆盖，规则是怎么样的？","type":0,"userId":2,"visible":1,"zan":21},{"apkLink":"","audit":1,"author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9124,"link":"https://mp.weixin.qq.com/s/0lkPyjJ4lnBSsrnBOJPMhA","niceDate":"2019-09-09","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567958400000,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"基于Android输入法开发，制作一个微信斗图APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9133,"link":"https://mp.weixin.qq.com/s/XZCUuyrGpjJwZCa7_Cn4hA","niceDate":"2019-09-09","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567958400000,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"考你一道题，ScrollView和HorizontalScrollView可以设置点击事件吗？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9146,"link":"https://mp.weixin.qq.com/s/AmxTnOaJX4hHSMXLGxG3Jg","niceDate":"2019-09-09","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567958400000,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"3. Jetpack源码解析---用Lifecycles管理生命周期","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","chapterId":60,"chapterName":"Android Studio相关","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9095,"link":"http://2019.rtcexpo.org/?utm_source=wechat&amp;utm_medium=hongyang&amp;utm_campaign=signup_0907","niceDate":"2019-09-08","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567958219000,"shareDate":null,"shareUser":"","superChapterId":60,"superChapterName":"开发环境","tags":[],"title":"第五届 实时互联网大会 门票免费申请","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"互联网侦察","chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9148,"link":"https://mp.weixin.qq.com/s/PHYY2x89yw_BhI2UowFyGQ","niceDate":"2019-09-07","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567785600000,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"Linux 这些工具堪称神器！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9123,"link":"https://mp.weixin.qq.com/s/YKfgvLExzYPKBsh2tx9lUQ","niceDate":"2019-09-06","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567699200000,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"昨天在群里被问到... 应用是如何运行起来的？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9132,"link":"https://mp.weixin.qq.com/s/aYh12WSGBgHPL2dYQtKm2w","niceDate":"2019-09-06","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567699200000,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"抽丝剥茧RecyclerView，这篇干货岂能错过？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9145,"link":"https://mp.weixin.qq.com/s/omCnmMX3XVq-vnKoDnQXTg","niceDate":"2019-09-06","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567699200000,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"Retrofit 结合 Lifecycle, 将 Http 生命周期管理到极致","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"互联网侦察","chapterId":421,"chapterName":"互联网侦察","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9147,"link":"https://mp.weixin.qq.com/s/EHS3whrvXGF8sIKdVrIZHQ","niceDate":"2019-09-06","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567699200000,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/421/1"}],"title":"经典面试题：最长公共子序列","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"ouyangpeng","chapterId":358,"chapterName":"项目基础功能","collect":false,"courseId":13,"desc":"Android自定义Lint实践 （Custom Lint Rules &amp; Lint Plugin）\r\n如何编写自定义规则\r\n如何编译Lint插件","envelopePic":"https://wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"id":9092,"link":"http://www.wanandroid.com/blog/show/2665","niceDate":"2019-09-05","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"https://github.com/ouyangpeng/XTCLint","publishTime":1567689194000,"shareDate":null,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=358"}],"title":"Android自定义Lint实践 （Custom Lint Rules &amp; Lint Plugin）","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"hegaojian","chapterId":294,"chapterName":"完整项目","collect":false,"courseId":13,"desc":"一位练习长达两年半的安卓练习生根据鸿神提供的WanAndroid开放Api来制作的产品级App,基本实现了所有的功能，采用Kotlin语言，基于Material Design + AndroidX + MVP + RxJava + Retrofit等优秀的开源框架开发","envelopePic":"https://wanandroid.com/blogimgs/39749be0-f875-48c8-a1b6-c349d286d594.png","fresh":false,"id":9093,"link":"http://www.wanandroid.com/blog/show/2666","niceDate":"2019-09-05","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"https://github.com/hegaojian/WanAndroid","publishTime":1567689172000,"shareDate":null,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=294"}],"title":"一位练习长达两年半的安卓练习生根据鸿神提供的WanAndroid开放Api来制作的产品级App","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"美团技术团队  ","chapterId":313,"chapterName":"字节码","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9090,"link":"https://mp.weixin.qq.com/s/CH9D-E7fxuu462Q2S3t0AA","niceDate":"2019-09-05","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567688186000,"shareDate":null,"shareUser":"","superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"Java字节码增强探秘","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"土豆吞噬者","chapterId":295,"chapterName":"混淆","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9089,"link":"https://www.jianshu.com/p/77b8f53affda","niceDate":"2019-09-05","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567613229000,"shareDate":null,"shareUser":"","superChapterId":135,"superChapterName":"项目必备","tags":[],"title":"Android使用R8压缩，混淆，优化App","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9122,"link":"https://mp.weixin.qq.com/s/-_oUN0lg-IZIL3a02kuEOA","niceDate":"2019-09-05","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567612800000,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"1-3年Android开发工程师面试经验分享","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9137,"link":"https://mp.weixin.qq.com/s/ZVkrulyFZ1YOosQScT7Lmg","niceDate":"2019-09-05","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567612800000,"shareDate":null,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"推荐一个开源项目给大家，快速接入 AI 能力","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"星星y","chapterId":429,"chapterName":"ffmpeg","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9086,"link":"https://juejin.im/post/5d6e5c8a5188257ec84738c4","niceDate":"2019-09-04","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567527446000,"shareDate":null,"shareUser":"","superChapterId":95,"superChapterName":"多媒体技术","tags":[],"title":"一篇文章助你入门FFmpeg编程","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"恋猫de小郭","chapterId":375,"chapterName":"Flutter","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9085,"link":"https://juejin.im/post/5d6cb579f265da03da24aeb9","niceDate":"2019-09-04","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567527418000,"shareDate":null,"shareUser":"","superChapterId":375,"superChapterName":"跨平台","tags":[],"title":"Flutter完整开发实战详解(十七、 实用技巧与填坑二)","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"黄三样","chapterId":390,"chapterName":"Git","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":9084,"link":"https://juejin.im/post/5d6cae83e51d4561c75f2852","niceDate":"2019-09-04","niceShareDate":"未知时间","origin":"","prefix":"","projectLink":"","publishTime":1567527319000,"shareDate":null,"shareUser":"","superChapterId":390,"superChapterName":"项目管理","tags":[],"title":"这是一篇成为 git 高手的文章","type":0,"userId":-1,"visible":1,"zan":0}]
     * offset : 20
     * over : false
     * pageCount : 357
     * size : 20
     * total : 7136
     */

    private int curPage;
    private int offset;
    private boolean over;
    private int pageCount;
    private int size;
    private int total;
    private List<DatasBean> datas;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<DatasBean> getDatas() {
        if (datas == null) {
            return new ArrayList<>();
        }
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * apkLink :
         * audit : 1
         * author : qq_35561554
         * chapterId : 468
         * chapterName : Glide
         * collect : false
         * courseId : 13
         * desc :
         * envelopePic :
         * fresh : false
         * id : 9097
         * link : https://blog.csdn.net/qq_35561554/article/details/100618455
         * niceDate : 2019-09-09
         * niceShareDate : 未知时间
         * origin :
         * prefix :
         * projectLink :
         * publishTime : 1568008177000
         * shareDate : null
         * shareUser :
         * superChapterId : 461
         * superChapterName : 常见开源库源码解析
         * tags : []
         * title : Glide加载流程分析
         * type : 0
         * userId : -1
         * visible : 1
         * zan : 0
         */

        private String apkLink;
        private int audit;
        private String author;
        private int chapterId;
        private String chapterName;
        private boolean collect;
        private int courseId;
        private String desc;
        private String envelopePic;
        private boolean fresh;
        private int id;
        private String link;
        private String niceDate;
        private String niceShareDate;
        private String origin;
        private String prefix;
        private String projectLink;
        private long publishTime;
        private Object shareDate;
        private String shareUser;
        private int superChapterId;
        private String superChapterName;
        private String title;
        private int type;
        private int userId;
        private int visible;
        private int zan;
        private List<?> tags;

        public String getApkLink() {
            return apkLink == null ? "" : apkLink;
        }

        public void setApkLink(String apkLink) {
            this.apkLink = apkLink;
        }

        public int getAudit() {
            return audit;
        }

        public void setAudit(int audit) {
            this.audit = audit;
        }

        public String getAuthor() {
            return author == null ? "" : author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getChapterId() {
            return chapterId;
        }

        public void setChapterId(int chapterId) {
            this.chapterId = chapterId;
        }

        public String getChapterName() {
            return chapterName == null ? "" : chapterName;
        }

        public void setChapterName(String chapterName) {
            this.chapterName = chapterName;
        }

        public boolean isCollect() {
            return collect;
        }

        public void setCollect(boolean collect) {
            this.collect = collect;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public String getDesc() {
            return desc == null ? "" : desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getEnvelopePic() {
            return envelopePic == null ? "" : envelopePic;
        }

        public void setEnvelopePic(String envelopePic) {
            this.envelopePic = envelopePic;
        }

        public boolean isFresh() {
            return fresh;
        }

        public void setFresh(boolean fresh) {
            this.fresh = fresh;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLink() {
            return link == null ? "" : link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getNiceDate() {
            return niceDate == null ? "" : niceDate;
        }

        public void setNiceDate(String niceDate) {
            this.niceDate = niceDate;
        }

        public String getNiceShareDate() {
            return niceShareDate == null ? "" : niceShareDate;
        }

        public void setNiceShareDate(String niceShareDate) {
            this.niceShareDate = niceShareDate;
        }

        public String getOrigin() {
            return origin == null ? "" : origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getPrefix() {
            return prefix == null ? "" : prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getProjectLink() {
            return projectLink == null ? "" : projectLink;
        }

        public void setProjectLink(String projectLink) {
            this.projectLink = projectLink;
        }

        public long getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(long publishTime) {
            this.publishTime = publishTime;
        }

        public Object getShareDate() {
            return shareDate;
        }

        public void setShareDate(Object shareDate) {
            this.shareDate = shareDate;
        }

        public String getShareUser() {
            return shareUser == null ? "" : shareUser;
        }

        public void setShareUser(String shareUser) {
            this.shareUser = shareUser;
        }

        public int getSuperChapterId() {
            return superChapterId;
        }

        public void setSuperChapterId(int superChapterId) {
            this.superChapterId = superChapterId;
        }

        public String getSuperChapterName() {
            return superChapterName == null ? "" : superChapterName;
        }

        public void setSuperChapterName(String superChapterName) {
            this.superChapterName = superChapterName;
        }

        public String getTitle() {
            return title == null ? "" : title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getVisible() {
            return visible;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public int getZan() {
            return zan;
        }

        public void setZan(int zan) {
            this.zan = zan;
        }

        public List<?> getTags() {
            if (tags == null) {
                return new ArrayList<>();
            }
            return tags;
        }

        public void setTags(List<?> tags) {
            this.tags = tags;
        }
    }
}
