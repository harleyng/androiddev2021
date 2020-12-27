package com.example.wordpress.ui.mysite;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wordpress.R;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class StatsDays extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stats_days, container, false);

    }
    public void onViewCreated(View view,
                              Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        BarChart chart = view.findViewById(R.id.chart);

        BarData data = new BarData(getXAxisValues(), getDataSet());
        chart.setData(data);
        chart.setDescription("");
        chart.animateXY(2000, 2000);
        chart.invalidate();
    }

    private ArrayList getDataSet() {
        ArrayList dataSets = null;

        ArrayList valueSet = new ArrayList();
        BarEntry v1e1 = new BarEntry(110.000f, 0); // Jan
        valueSet.add(v1e1);
        BarEntry v1e2 = new BarEntry(40.000f, 1); // Feb
        valueSet.add(v1e2);
        BarEntry v1e3 = new BarEntry(60.000f, 2); // Mar
        valueSet.add(v1e3);
        BarEntry v1e4 = new BarEntry(30.000f, 3); // Apr
        valueSet.add(v1e4);
        BarEntry v1e5 = new BarEntry(90.000f, 4); // May
        valueSet.add(v1e5);
        BarEntry v1e6 = new BarEntry(100.000f, 5); // Jun
        valueSet.add(v1e6);
        BarEntry v2e1 = new BarEntry(150.000f, 6); // Jan
        valueSet.add(v2e1);
        BarEntry v2e2 = new BarEntry(90.000f, 7); // Feb
        valueSet.add(v2e2);
        BarEntry v2e3 = new BarEntry(120.000f, 8); // Mar
        valueSet.add(v2e3);
        BarEntry v2e4 = new BarEntry(60.000f, 9); // Apr
        valueSet.add(v2e4);
        BarEntry v2e5 = new BarEntry(20.000f, 10); // May
        valueSet.add(v2e5);
        BarEntry v2e6 = new BarEntry(80.000f, 11); // Jun
        valueSet.add(v2e6);

        BarDataSet barDataSet = new BarDataSet(valueSet, "Brand 1");
        barDataSet.setColor(Color.rgb(114, 174, 230));

        dataSets = new ArrayList();
        dataSets.add(barDataSet);
        return dataSets;
    }

    private ArrayList getXAxisValues() {
        ArrayList xAxis = new ArrayList();
        xAxis.add("JAN");
        xAxis.add("FEB");
        xAxis.add("MAR");
        xAxis.add("APR");
        xAxis.add("MAY");
        xAxis.add("JUN");
        xAxis.add("JUL");
        xAxis.add("AUG");
        xAxis.add("SEP");
        xAxis.add("OCT");
        xAxis.add("NOV");
        xAxis.add("DEC");

        return xAxis;
    }
}