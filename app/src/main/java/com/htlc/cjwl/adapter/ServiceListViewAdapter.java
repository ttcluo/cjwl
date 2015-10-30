package com.htlc.cjwl.adapter;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.htlc.cjwl.R;
import com.htlc.cjwl.bean.ServiceItemBean;

import java.util.ArrayList;

/**
 * Created by sks on 2015/10/29.
 */
public class ServiceListViewAdapter extends BaseAdapter {
    private ArrayList<ServiceItemBean> items;
    private Context context;
    public ServiceListViewAdapter(Context context,ArrayList<ServiceItemBean> items) {
        this.items = items;
        this.context = context;
    }
    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null){
            holder = new ViewHolder();
            convertView = View.inflate(context, R.layout.adapter_service_list,null);
            holder.iv_service_adapter = (ImageView) convertView.findViewById(R.id.iv_service_adapter);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        //模拟数据------------------
        holder.iv_service_adapter.setImageResource(R.drawable.service_item_default);
        //模拟数据------------------
        return convertView;
    }
    class ViewHolder{
        ImageView iv_service_adapter;
    }
}
