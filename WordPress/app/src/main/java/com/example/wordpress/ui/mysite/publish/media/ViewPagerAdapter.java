package com.example.wordpress.ui.mysite.publish.media;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new AllFragment();
            case 1:
                return new ImagesFragment();
            case 2:
                return new DocumentsFragment();
            case 3:
                return new VideosFragment();
            default:
                return new AllFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = " ALL";
            case 1:
                title = " IMAGES";
            case 2:
                title = " DOCUMENTS";
            case 3:
                title = " VIDEOS";
        }
        return title;
    }
}
