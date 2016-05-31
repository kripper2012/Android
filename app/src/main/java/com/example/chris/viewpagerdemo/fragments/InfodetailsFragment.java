package com.example.chris.viewpagerdemo.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.chris.viewpagerdemo.R;
import com.example.chris.viewpagerdemo.model.Information;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InfodetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InfodetailsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private TextView fullName;
    private TextView address;
    private TextView status;
    private TextView interest;
    private TextView height;
    private TextView car;
    private Information information;



    public InfodetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment InfodetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static InfodetailsFragment newInstance(String param1, String param2) {
        InfodetailsFragment fragment = new InfodetailsFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_infodetails, container, false);
        fullName = (TextView)rootView.findViewById(R.id.fullName);
        address =(TextView)rootView.findViewById(R.id.address);
        status = (TextView)rootView.findViewById(R.id.status);
        interest =(TextView)rootView.findViewById(R.id.interest);
        height =(TextView)rootView.findViewById(R.id.height);
        car = (TextView)rootView.findViewById(R.id.car);
        updateLayout();
        return rootView;
    }

    public void passData(Information information){
        this.information = information;
    }

    public void updateLayout(){
        fullName.setText(information.getFullName());
        address.setText(information.getAddress());
        status.setText(information.getStatus());
        interest.setText(information.getInterest());
        height.setText(information.getHeight());
        car.setText(information.getCar());
    }

}
