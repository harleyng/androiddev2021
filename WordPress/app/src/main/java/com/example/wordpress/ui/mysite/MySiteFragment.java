package com.example.wordpress.ui.mysite;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.wordpress.R;


public class MySiteFragment extends Fragment {
    private String TAG = "MySiteActivity";
    GridView gridView;

    String[] siteTitles = {"First Site","Second Site","Third Site"};
    String[] siteURLs = {"example1.wordpress.org", "example2.wordpress.org", "example3.wordpress.org"};
    int[] siteIcons = {R.drawable.site_default_icon, R.drawable.site_default_icon, R.drawable.site_default_icon};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View mySite = inflater.inflate(R.layout.my_site_list, container, false);
        setHasOptionsMenu(true);
        getActivity().setTitle("My Site");
        return mySite;
    }

    @Override
    public void onViewCreated(View view,
                              Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //finding listview
        gridView = view.findViewById(R.id.my_site_list);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getContext(), MySiteDetailActivity.class);
                intent.putExtra("title",siteTitles[i]);
                intent.putExtra("url", siteURLs[i]);
                intent.putExtra("icon",siteIcons[i]);
                startActivity(intent);

            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return siteIcons.length;
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
            View v = getLayoutInflater().inflate(R.layout.my_site_item,null);
            //getting view in row_data
            TextView title = v.findViewById(R.id.site_title);
            TextView url = v.findViewById(R.id.site_url);
            ImageView icon = v.findViewById(R.id.my_site_blavatar);

            title.setText(siteTitles[i]);
            url.setText(siteURLs[i]);
            icon.setImageResource(siteIcons[i]);
            return v;
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.my_site_list_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_edit:
                Toast.makeText(getContext(), "Edit", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_add:
                Toast.makeText(getContext(), "Add", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
