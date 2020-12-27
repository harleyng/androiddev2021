package com.example.wordpress.ui.mysite.publish.pages;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.wordpress.ui.mysite.publish.pages.PublishFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PublishFragment();
            case 1:
                return new DraftsFragment();
            case 2:
                return new ScheduledFragment();
            case 3:
                return new TrashedFragment();
            default:
                return new PublishFragment();
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
                title = " PUBLISH";
            case 1:
                title = " DRAFTS";
            case 2:
                title = " SCHEDULED";
            case 3:
                title = " TRASHED";
        }
        return title;
    }
}
