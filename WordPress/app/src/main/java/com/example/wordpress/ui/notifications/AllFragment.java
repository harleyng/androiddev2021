package com.example.wordpress.ui.notifications;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wordpress.R;
import com.example.wordpress.ui.mysite.ActivityLogFragment;

public class AllFragment extends Fragment {
    GridView gridView;

    String[] notificationTitles = {"New Google Sign-in", "You've made your first post on Site Title"};
    String[] notificationDescs = {"", "Google Sign-in from  \n trangiangson@gmail.com"};
    int[] notificationIcons = {R.mipmap.my_site_icon, R.mipmap.my_site_icon};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("TAG", "onCreateView: all");
        return inflater.inflate(R.layout.fragment_notifications_all, container, false);
    }

    @Override
    public void onViewCreated(View view,
                              Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //finding listview
        gridView = view.findViewById(R.id.notification_list);
        AllFragment.CustomAdapter customAdapter = new AllFragment.CustomAdapter();
        gridView.setAdapter(customAdapter);
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return notificationIcons.length;
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
            View v = getLayoutInflater().inflate(R.layout.fragment_notifications_item,null);
            //getting view in row_data
            TextView title = v.findViewById(R.id.notification_title);
            TextView desc = v.findViewById(R.id.notification_desc);
            ImageView icon = v.findViewById(R.id.notification_icon);

            title.setText(notificationTitles[i]);
            desc.setText(notificationDescs[i]);
            icon.setImageResource(notificationIcons[i]);
            return v;
        }
    }
}