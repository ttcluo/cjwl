package com.htlc.cjwl.fragment;




import android.graphics.Color;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.htlc.cjwl.R;
import com.htlc.cjwl.util.CommonUtil;
import com.htlc.cjwl.widget.PagerSlidingTab;

/**
 * Created by Administrator on 2015/10/28.
 */
public class OrdersFragment extends Fragment {

    private PagerSlidingTab indicator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_orders_fragment, null);
        indicator = (PagerSlidingTab) view.findViewById(R.id.indicator);
        TextView tv_fragment_title = (TextView) view.findViewById(R.id.tv_fragment_title);
        tv_fragment_title.setText("我的订单");
//        //tabtitle字体大写
//        indicator.setAllCaps(true);
//        //tab 宽度均分
//        indicator.setShouldExpand(true);
//        indicator.setTextSize(CommonUtil.dp2px(this.getActivity(), 18));
//        //设置下划线
//        indicator.setUnderlineColor(Color.BLACK);
//        indicator.setUnderlineHeight(CommonUtil.dp2px(this.getActivity(), 1));
//        //设置滑动指示线
//        indicator.setIndicatorColor(R.color.red);
//        indicator.setIndicatorHeight(CommonUtil.dp2px(this.getActivity(), 4));
//        //设置tab间分割线
//        indicator.setDividerColor(Color.TRANSPARENT);
//        //设置背景颜色
//        indicator.setBackgroundColor(this.getResources().getColor(R.color.white));
        return view;
    }


}
