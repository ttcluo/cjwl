package com.htlc.cjwl.fragment;


import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.astuetz.PagerSlidingTabStrip;
import com.htlc.cjwl.R;
import com.htlc.cjwl.adapter.OrdersPagerAdaptor;
import com.htlc.cjwl.util.CommonUtil;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2015/10/28.
 */
public class OrdersFragment extends Fragment implements ActionBar.TabListener {

    @Bind(R.id.indicator)
    PagerSlidingTabStrip indicator;
    @Bind(R.id.viewPager)
    ViewPager viewPager;
    private int id = 0;

    private LinearLayout mTabsLinearLayout;

    public static OrdersFragment newInstance(int id) {
        OrdersFragment ordersFragment = new OrdersFragment();
        ordersFragment.id = id;
        return ordersFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_orders_fragment, null);
        ButterKnife.bind(this, view);
        TextView tv_fragment_title = (TextView) view.findViewById(R.id.tv_fragment_title);
        // tv_fragment_title.setText("我的订单");

        Init();

        return view;
    }

    public void Init() {
        InitTab();
        viewPager.setAdapter(new OrdersPagerAdaptor(getChildFragmentManager()));
        indicator.setViewPager(viewPager);
        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                indicator.setTranslationX(0);
            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < mTabsLinearLayout.getChildCount(); i++) {
                    TextView tv = (TextView) mTabsLinearLayout.getChildAt(i);
                    if (i == position) {

                        tv.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "fonts/Roboto-Medium.ttf"));
                    } else {
                        tv.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "fonts/Roboto-Light.ttf"));

                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mTabsLinearLayout = (LinearLayout) indicator.getChildAt(0);
        for (int i = 0; i < mTabsLinearLayout.getChildCount(); i++) {
            TextView tv = (TextView) mTabsLinearLayout.getChildAt(i);
            if (i == 0) {

                tv.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "fonts/Roboto-Medium.ttf"));
            } else {
                tv.setTypeface(Typeface.createFromAsset(getActivity().getAssets(), "fonts/Roboto-Light.ttf"));

            }
        }
    }

    public void InitTab() {

         //tab 宽度均分
         indicator.setShouldExpand(true);
         indicator.setTextSize(CommonUtil.dp2px(this.getActivity(), 14));
        indicator.setTextColor(R.color.order);
         //设置下划线
//        indicator.setUnderlineColor(Color.BLACK);
//        indicator.setUnderlineHeight(CommonUtil.dp2px(this.getActivity(), 1));
        //设置滑动指示线
          indicator.setIndicatorColor(R.color.order);
          indicator.setIndicatorHeight(CommonUtil.dp2px(this.getActivity(), 2));
//        //设置tab间分割线
//        indicator.setDividerColor(Color.TRANSPARENT);
        //设置背景颜色
        indicator.setBackgroundColor(this.getResources().getColor(R.color.white));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
