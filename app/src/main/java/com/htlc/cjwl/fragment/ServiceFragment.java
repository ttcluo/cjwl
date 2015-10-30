package com.htlc.cjwl.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;


import com.htlc.cjwl.R;
import com.htlc.cjwl.adapter.ServiceListViewAdapter;
import com.htlc.cjwl.bean.ServiceBean;
import com.htlc.cjwl.bean.ServiceItemBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/10/28.
 */
public class ServiceFragment extends Fragment{
    private ListView lv_service_listView;
    private ServiceListViewAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_home_fragment,null);

        TextView tv_fragment_title = (TextView) view.findViewById(R.id.tv_fragment_title);
        tv_fragment_title.setText(R.string.service_fragment_title);

        lv_service_listView = (ListView) view.findViewById(R.id.lv_service_listView);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //测试数据------------------
       ArrayList<ServiceItemBean> items = new ArrayList<ServiceItemBean>();
        for(int i=0;i<10;i++){
            ServiceItemBean bean = new ServiceItemBean();
            bean.id = i;
            bean.service_image = "/upload/20151027/zjy.jpg";
            items.add(bean);
        }

        //测试数据------------------
//        System.out.println(getContext());
        adapter = new ServiceListViewAdapter(getContext(), items);
        System.out.println(adapter);
        lv_service_listView.setAdapter(adapter);
    }
}
