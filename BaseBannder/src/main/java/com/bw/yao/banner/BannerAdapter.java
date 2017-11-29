package com.bw.yao.banner;

import android.content.Context;
import android.view.View;

import com.bw.yao.R;


/**
 * Created by Administrator on 2017/11/27.
 */

public class BannerAdapter extends BannerBaseAdapter<BannerBean> {

    public BannerAdapter(Context context) {
        super(context);
    }

    @Override
    protected int getLayoutResID() {
        return R.layout.item_banner;
    }
    @Override
    protected void convert(View convertView, BannerBean data) {
        setImage(R.id.pageImage, data.pic);
        setText(R.id.pageText, data.title);
    }
}
