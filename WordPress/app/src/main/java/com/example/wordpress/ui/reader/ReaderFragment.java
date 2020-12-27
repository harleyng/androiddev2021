package com.example.wordpress.ui.reader;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.wordpress.R;
import com.google.android.material.tabs.TabLayout;

public class ReaderFragment extends Fragment {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    Button btn_like;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true);
        getActivity().setTitle("Reader");
        return inflater.inflate(R.layout.activity_reader_menu, container, false);
    }

    @Override
    public void onViewCreated(View view,
                              Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mTabLayout = view.findViewById(R.id.tabLayout);
        mViewPager = view.findViewById(R.id.view_page);

//        btn_like = (Button) findViewById(R.id.btn_like);
//        FragmentManager fragmentManager = getFragmentManager();
//        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        btn_like.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                likes Likes = new likes();
//                fragmentTransaction.add(R.id.frm_likes, Likes);
//                fragmentTransaction.commit();
//            }
//        });

        com.example.wordpress.ui.reader.ViewPagerAdapter vIewPagerAdapter = new com.example.wordpress.ui.reader.ViewPagerAdapter(getFragmentManager(),
                FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(vIewPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);

    }
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.demo1, menu);
    }

}
