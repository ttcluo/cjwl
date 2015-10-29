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

/**
 * Created by Administrator on 2015/10/28.
 */
public class ServiceFragment extends Fragment{
    private ListView lv_service_listView;

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
        // TODO: 2015/10/29
        lv_service_listView.setAdapter(null);
    }
}
