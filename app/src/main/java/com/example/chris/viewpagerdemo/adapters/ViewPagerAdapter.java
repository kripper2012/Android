package com.example.chris.viewpagerdemo.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.chris.viewpagerdemo.fragments.InfodetailsFragment;
import com.example.chris.viewpagerdemo.model.Information;

import java.util.ArrayList;

/**
 * Created by Chris on 31/05/2016.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter{
    private ArrayList<Information> info;
    private Information infoDetails;
    private FragmentManager fragmentManager;


    public ViewPagerAdapter(FragmentManager fm,ArrayList<Information> info) {
        super(fm);
        this.info = info;
        this.fragmentManager = fm;
    }


    @Override
    public Fragment getItem(int position) {
        infoDetails = info.get(position);
        InfodetailsFragment infodetailsFragment = InfodetailsFragment.newInstance("","");
        infodetailsFragment.passData(infoDetails);
        return infodetailsFragment;
    }

    @Override
    public int getCount() {
        return info.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return info.get(position).getFullName();
    }
}
