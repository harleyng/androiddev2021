package com.example.wordpress.ui.mysite;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wordpress.R;

public class ActivityLogFragment extends Fragment {
    GridView gridView1, gridView2;

    String[] activityTitles = {"Site icon removed","Related Posts layout changed","Enabled showing the Reblog button"};
    String[] activityTypes = {"Setting changed", "Setting changed", "Setting changed"};
    int[] activityIcons = {R.drawable.ic_cog_white_24dp, R.drawable.ic_cog_white_24dp, R.drawable.ic_cog_white_24dp};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_activity_log, container, false);
    }

    @Override
    public void onViewCreated(View view,
                              Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //finding listview
        gridView1 = view.findViewById(R.id.activity_log_list1);
        gridView2 = view.findViewById(R.id.activity_log_list2);
        ActivityLogFragment.CustomAdapter customAdapter = new ActivityLogFragment.CustomAdapter();
        gridView1.setAdapter(customAdapter);
        gridView2.setAdapter(customAdapter);
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Intent intent = new Intent(getContext(), MySiteDetailActivity.class);
//                intent.putExtra("title",activityTitles[i]);
//                intent.putExtra("type", activityTypes[i]);
//                intent.putExtra("icon",activityIcons[i]);
//                startActivity(intent);
//
//            }
//        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return activityIcons.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View v = getLayoutInflater().inflate(R.layout.activity_log_item,null);
            //getting view in row_data
            TextView title = v.findViewById(R.id.activity_title);
            TextView type = v.findViewById(R.id.activity_type);
            ImageView icon = v.findViewById(R.id.activity_icon);

            title.setText(activityTitles[i]);
            type.setText(activityTypes[i]);
            icon.setImageResource(activityIcons[i]);
            return v;
        }
    }
}