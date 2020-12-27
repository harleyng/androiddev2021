package com.example.wordpress.ui.reader;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            default:
                return new Following();
            case 1:
                return new Discover();
            case 2:
                return new likes();
            case 3:
                return new saved();
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
        switch (position){
            case 0:
                return title = "Following";
            case 1:
                return title = "Discover";
            case 2:
                return title = "Likes";
            case 3:
                return title = "Saved";

        }
        return title;
    }
}
