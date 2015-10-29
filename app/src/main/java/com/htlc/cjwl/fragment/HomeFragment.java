package com.htlc.cjwl.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.htlc.cjwl.R;
import com.htlc.cjwl.util.LogUtil;

/**
 * Created by Administrator on 2015/10/28.
 */
public class HomeFragment extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_home_fragment,null);

        TextView tv_fragment_title = (TextView) view.findViewById(R.id.tv_fragment_title);
        tv_fragment_title.setText(R.string.home_fragment_title);

        TextView tv_consign = (TextView) view.findViewById(R.id.tv_consign);
        ImageButton ib_home_network_query = (ImageButton) view.findViewById(R.id.ib_home_network_query);
        ImageButton ib_home_rute_query = (ImageButton) view.findViewById(R.id.ib_home_rute_query);
        ImageButton ib_home_phone = (ImageButton) view.findViewById(R.id.ib_home_phone);

        tv_consign.setOnClickListener(this);
        ib_home_network_query.setOnClickListener(this);
        ib_home_rute_query.setOnClickListener(this);
        ib_home_phone.setOnClickListener(this);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_consign:
                LogUtil.i(this,"tv_consign");
                break;
            case R.id.ib_home_network_query:
                LogUtil.i(this,"ib_home_network_query");
                break;
            case R.id.ib_home_rute_query:
                LogUtil.i(this,"ib_home_rute_query");
                break;
            case R.id.ib_home_phone:
                LogUtil.i(this,"ib_home_phone");
                break;
        }
    }
}
