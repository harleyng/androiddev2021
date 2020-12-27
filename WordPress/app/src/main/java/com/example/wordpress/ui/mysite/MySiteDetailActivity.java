package com.example.wordpress.ui.mysite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.wordpress.R;
import com.example.wordpress.ui.mysite.configure.PeopleActivity;
import com.example.wordpress.ui.mysite.configure.SharingActivity;
import com.example.wordpress.ui.mysite.personalize.MenusActivity;
import com.example.wordpress.ui.mysite.personalize.ThemesActivity;
import com.example.wordpress.ui.mysite.publish.media.MediaActivity;
import com.example.wordpress.ui.mysite.publish.pages.PagesActivity;
import com.example.wordpress.ui.mysite.publish.posts.PostsActivity;

public class MySiteDetailActivity extends AppCompatActivity {
    String TAG = "MySiteDetailActivity";
    TextView SiteTitle, SiteURL;
    ImageView SiteIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_site_detail);

        this.setTitle("My Site");

        SiteTitle = findViewById(R.id.site_detail_title);
        SiteURL = findViewById(R.id.site_detail_url);
        SiteIcon = findViewById(R.id.site_detail_icon);
        Intent intent = getIntent();
        String receivedTitle =  intent.getStringExtra("title");
        String receivedURL = intent.getStringExtra("url");
        int receivedIcon = intent.getIntExtra("icon",0);

        SiteTitle.setText(receivedTitle);
        SiteURL.setText(receivedURL);
        SiteIcon.setImageResource(receivedIcon);
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Handle bottom navigation
//        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
//        bottomNav.setOnNavigationItemSelectedListener(navListener);

        // quick button
        findViewById(R.id.quick_action_stats_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatsActivity.class);
                startActivity(intent);
            }
        });
        // posts
        findViewById(R.id.quick_action_posts_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PostsActivity.class);
                startActivity(intent);
            }
        });

        // media
        findViewById(R.id.quick_action_media_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MediaActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.quick_action_pages_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PagesActivity.class);
                startActivity(intent);
            }
        });

        //stats
        findViewById(R.id.row_stats).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), StatsActivity.class);
                startActivity(intent);
            }
        });
        // activity log
        findViewById(R.id.row_activity_log).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ActivityLogActivity.class);
                startActivity(intent);
            }
        });

        // publish
            // posts
        findViewById(R.id.row_blog_posts).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PostsActivity.class);
                startActivity(intent);
            }
        });

            // media
        findViewById(R.id.row_media).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MediaActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.row_pages).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PagesActivity.class);
                startActivity(intent);
            }
        });

        // personalize
            // themes
        findViewById(R.id.row_themes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ThemesActivity.class);
                startActivity(intent);
            }
        });

            // menus
        findViewById(R.id.row_menus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MenusActivity.class);
                startActivity(intent);
            }
        });

        // configure
            // sharing
        findViewById(R.id.row_sharing).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SharingActivity.class);
                startActivity(intent);
            }
        });
            // people
        findViewById(R.id.row_people).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), PeopleActivity.class);
                startActivity(intent);
            }
        });

        // External
            // My Site
        findViewById(R.id.row_view_site).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), PeopleActivity.class);
//                startActivity(intent);
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://harliedesigns.design.blog/"));
                startActivity(browserIntent);
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

//    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
//            new BottomNavigationView.OnNavigationItemSelectedListener() {
//                @Override
//                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                    Fragment selectedFragment = null;
//                    switch (item.getItemId()) {
//                        case R.id.nav_my_site:
//                            selectedFragment = new MySiteActivity();
//                            break;
//                        case R.id.nav_reader:
//                            selectedFragment = new Reader();
//                            break;
//                        case R.id.nav_notifications:
//                            selectedFragment = new Notifications();
//                            break;
//                    }
//
//                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
//
//                    return true;
//                }
//            };

}

