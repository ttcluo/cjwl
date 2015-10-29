package com.htlc.cjwl;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.htlc.cjwl.fragment.HomeFragment;
import com.htlc.cjwl.fragment.MyFragment;
import com.htlc.cjwl.fragment.OrdersFragment;
import com.htlc.cjwl.fragment.ServiceFragment;

public class MainActivity extends AppCompatActivity {
    //定义FragmentTabHost对象
    private FragmentTabHost mTabHost;

    //定义一个布局
    private LayoutInflater layoutInflater;

    //定义数组来存放Fragment界面
    private Class fragmentArray[] = {HomeFragment.class,OrdersFragment.class,ServiceFragment.class,MyFragment.class};

    //定义数组来存放按钮图片
    private int mImageViewArray[] = {R.drawable.home_tab_selector,R.drawable.orders_tab_selector,R.drawable.service_tab_selector,
            R.drawable.my_tab_selector};

    //Tab选项卡的文字
    private String mTextviewArray[] = {"运车", "我的订单", "长久服务", "我的"};

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    /**
     * 初始化组件
     */
    private void initView(){
        //实例化布局对象
        layoutInflater = LayoutInflater.from(this);

        //实例化TabHost对象，得到TabHost
        mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.fl_container);
        mTabHost.getTabWidget().setDividerDrawable(null);

        //得到fragment的个数
        int count = fragmentArray.length;

        for(int i = 0; i < count; i++){
            //为每一个Tab按钮设置图标、文字和内容
            TabHost.TabSpec tabSpec = mTabHost.newTabSpec(mTextviewArray[i]).setIndicator(getTabItemView(i));
            //将Tab按钮添加进Tab选项卡中
            mTabHost.addTab(tabSpec, fragmentArray[i], null);
            //设置Tab按钮的背景
//            mTabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.selector_tab_background);
        }
    }

    /**
     * 给Tab按钮设置图标和文字
     */
    private View getTabItemView(int index){
        View view = layoutInflater.inflate(R.layout.fragment_tab, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.iv_fragment_tab);
        imageView.setImageResource(mImageViewArray[index]);

        TextView textView = (TextView) view.findViewById(R.id.tv_fagment_tab);
        textView.setText(mTextviewArray[index]);

        return view;
    }
}
