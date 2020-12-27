package com.example.wordpress.ui.mysite.personalize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.wordpress.R;

public class ThemesActivity extends AppCompatActivity {
    private GridView gridView;
    int[] themeImages = {R.drawable.ic_spearhead, R.drawable.ic_seedlet, R.drawable.ic_twentytwenty};
    String[] themeNames = {"Spearhead", "Seedlet", "TwentyTwenty"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);
        setTitle("Themes");

        gridView = (GridView) findViewById(R.id.gridView);
        CustomAdapter customAdapter = new CustomAdapter();
        gridView.setAdapter(customAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.searchview, menu);
        MenuItem menuItem = menu.findItem(R.id.action_search);
        return super.onCreateOptionsMenu(menu);
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return themeNames.length;
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
            View v = getLayoutInflater().inflate(R.layout.fragment_themes_item, null);
            TextView name = v.findViewById(R.id.theme_name);
            ImageView img = v.findViewById(R.id.theme_image);
            name.setText(themeNames[i]);
            img.setImageResource(themeImages[i]);
            return v;
        }
    }
}