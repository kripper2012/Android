package com.example.chris.viewpagerdemo.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.chris.viewpagerdemo.R;
import com.example.chris.viewpagerdemo.adapters.ViewPagerAdapter;
import com.example.chris.viewpagerdemo.model.Information;
import com.example.chris.viewpagerdemo.services.DetailsService;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ViewpagerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ViewpagerFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ViewPagerAdapter viewPagerAdapter;
    ArrayList<Information> infoDetails;
    PagerTabStrip mPagerTabStrip;
    ViewPager viewPager;

    public ViewpagerFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ViewpagerFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ViewpagerFragment newInstance(String param1, String param2) {
        ViewpagerFragment fragment = new ViewpagerFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_viewpager, container, false);;
        mPagerTabStrip = (PagerTabStrip)rootView.findViewById(R.id.pager_tab_strip);
        mPagerTabStrip.setTabIndicatorColor(Color.rgb(190, 23, 23));
        mPagerTabStrip.setTextSize(2, 19.0f);
        infoDetails = new ArrayList<>();
        infoDetails.addAll(DetailsService.getInstance().getInformation());
        viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), infoDetails);
        viewPager = (ViewPager)rootView.findViewById(R.id.pager);
        viewPager.setAdapter(viewPagerAdapter);
        return rootView;
    }

}
