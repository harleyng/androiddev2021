package com.example.usthweather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class WeatherFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle SaveInstanceState) {
        View weatherFragment = inflater.inflate(R.layout.weather_fragment, container, false);

        return weatherFragment;
    }
}
