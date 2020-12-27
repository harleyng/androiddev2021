package com.example.wordpress;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.wordpress.ui.mysite.MySiteFragment;
import com.example.wordpress.ui.notifications.NotificationsActivity;
import com.example.wordpress.ui.reader.ReaderFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MySiteFragment()).commit();
        this.setTitle("My Site");
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment  selectedFragment = null;
                    switch (item.getItemId()) {
                        case R.id.nav_my_site:
                            selectedFragment = new MySiteFragment();
                            break;
                        case R.id.nav_reader:
                            selectedFragment = new ReaderFragment();
                            break;
                        case R.id.nav_notifications:
                            selectedFragment = new NotificationsActivity();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

                    return true;
                }
            };
}