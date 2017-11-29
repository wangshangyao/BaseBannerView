package com.bw.yao.banner;

import android.support.annotation.IntegerRes;

/**
 * Created by Administrator on 2017/11/27.
 */

public class BannerBean {

    public String pic;
    public String title;


    public @IntegerRes
    int imageRes;

    public BannerBean(int imageRes, String title) {
        this.imageRes = imageRes;
        this.title = title;
    }

    public BannerBean(String pic, String title) {
        this.pic = pic;
        this.title = title;
    }
// 图片宽高传过来时一般是统一的，所以这里不处理
}
