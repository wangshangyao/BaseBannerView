package yao.bw.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.bw.yao.banner.BannerAdapter;
import com.bw.yao.banner.BannerBaseAdapter;
import com.bw.yao.banner.BannerBean;
import com.bw.yao.banner.BannerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BannerView bannerview;
    private BannerAdapter mAdapter;

    private List<BannerBean> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bannerview = (BannerView) findViewById(R.id.bannerView);
        bannerview.setAdapter(mAdapter = new BannerAdapter(this));
        arr = new ArrayList<>();

        getData();

        mAdapter.setData(arr);

        mAdapter.setOnPageTouchListener(new BannerBaseAdapter.OnPageTouchListener<BannerBean>() {
            @Override
            public void onPageClick(int position, BannerBean bannerBean) {
                // 页面点击
                Toast.makeText(MainActivity.this, bannerBean.title, Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onPageDown() {
                // 按下，可以停止轮播
                //   Toast.makeText(BannerActivity.this, "按下", Toast.LENGTH_SHORT).show();
                bannerview.stopAutoScroll();
            }
            @Override
            public void onPageUp() {
                // 抬起开始轮播
                //  Toast.makeText(BannerActivity.this, "抬起", Toast.LENGTH_SHORT).show();
                bannerview.startAutoScroll();
            }
        });
    }

    public void getData() {
        arr.add(new BannerBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511925155662&di=45bcb98c3f596d92e1615dba67e1f3fc&imgtype=0&src=http%3A%2F%2Fimage.tianjimedia.com%2FuploadImages%2F2015%2F131%2F26%2F40P9YQ26TB7H_1000x500.jpg","我是第一页"));
        arr.add(new BannerBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511925155750&di=8ef2360d0635e961f888542ce02947cf&imgtype=0&src=http%3A%2F%2Fimage.tianjimedia.com%2FuploadImages%2F2015%2F215%2F45%2F04L5VRR21C5W.jpg","我是第二页"));
        arr.add(new BannerBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511925155750&di=0d9d331fdc00ee7631236f29f3bdaac7&imgtype=0&src=http%3A%2F%2Fimage.tianjimedia.com%2FuploadImages%2F2013%2F255%2FHP4C7KBZQ0YP.jpg","我是第三页"));
        arr.add(new BannerBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511925155749&di=4d10f0073993bd92520dfa469eac76c2&imgtype=0&src=http%3A%2F%2Ff.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2F5ab5c9ea15ce36d3c0a28ce330f33a87e850b1ba.jpg","我是第四页"));
        arr.add(new BannerBean("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1511925155749&di=644e326706663155cc2ac3350bbaa0c7&imgtype=0&src=http%3A%2F%2Fh.hiphotos.baidu.com%2Fimage%2Fpic%2Fitem%2Fd000baa1cd11728be0f1acf0c2fcc3cec2fd2c07.jpg","我是第五页"));
    }
}
