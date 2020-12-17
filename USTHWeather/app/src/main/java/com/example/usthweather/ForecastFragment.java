package com.example.usthweather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle SaveInstanceState) {
        View forecastFragment = inflater.inflate(R.layout.forecast_fragment, container, false);
//        forecastFragment.setBackgroundColor(Color.parseColor("#BEC4F1"));

        return forecastFragment;
    }
}
