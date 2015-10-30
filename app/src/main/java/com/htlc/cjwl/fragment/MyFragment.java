package com.htlc.cjwl.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.htlc.cjwl.R;
import com.htlc.cjwl.util.LogUtil;

/**
 * Created by Administrator on 2015/10/28.
 */
public class MyFragment extends Fragment implements View.OnClickListener {
    private LinearLayout ll_account;
    private LinearLayout ll_account_tip;
    private LinearLayout ll_account_des;
    private ImageView iv_my_head;
    private TextView tv_rank;
    private TextView tv_tel;

    private LinearLayout ll_address;
    private LinearLayout ll_socre;
    private LinearLayout ll_message_center;
    private LinearLayout ll_setting;

    private TextView tv_login;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_my_fragment,null);

        TextView tv_fragment_title = (TextView) view.findViewById(R.id.tv_fragment_title);
        tv_fragment_title.setText(R.string.my_fragment_title);

        ll_account = (LinearLayout) view.findViewById(R.id.ll_account);
        ll_account_tip = (LinearLayout) view.findViewById(R.id.ll_account_tip);
        ll_account_des = (LinearLayout) view.findViewById(R.id.ll_account_des);
        iv_my_head = (ImageView) view.findViewById(R.id.iv_my_head);
        tv_rank = (TextView) view.findViewById(R.id.tv_rank);
        tv_tel = (TextView) view.findViewById(R.id.tv_tel);



        ll_address = (LinearLayout) view.findViewById(R.id.ll_address);
        ll_socre = (LinearLayout) view.findViewById(R.id.ll_socre);
        ll_message_center = (LinearLayout) view.findViewById(R.id.ll_message_center);
        ll_setting = (LinearLayout) view.findViewById(R.id.ll_setting);

        tv_login = (TextView) view.findViewById(R.id.tv_login);

        ll_account.setOnClickListener(this);
        iv_my_head.setOnClickListener(this);
        ll_address.setOnClickListener(this);
        ll_socre.setOnClickListener(this);
        ll_message_center.setOnClickListener(this);
        ll_setting.setOnClickListener(this);
        tv_login.setOnClickListener(this);


        return view;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // TODO: 2015/10/30 加载数据判断是否登录
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_account:
                LogUtil.i(this,"跳转帐号信息界面");
                break;
            case R.id.iv_my_head:
                LogUtil.i(this,"头像详情界面");
                break;
            case R.id.ll_address:
                LogUtil.i(this,"常用地址");
                break;
            case R.id.ll_socre:
                LogUtil.i(this,"我的积分");
                break;
            case R.id.ll_message_center:
                LogUtil.i(this,"消息中心");
                break;
            case R.id.ll_setting:
                LogUtil.i(this,"设置");
                break;
            case R.id.tv_login:
                LogUtil.i(this,"登录或退出");
                break;
        }
    }
}
