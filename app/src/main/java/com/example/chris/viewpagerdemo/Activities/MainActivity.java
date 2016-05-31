package com.example.chris.viewpagerdemo.Activities;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.chris.viewpagerdemo.R;
import com.example.chris.viewpagerdemo.fragments.ViewpagerFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        ViewpagerFragment viewpagerFragment = (ViewpagerFragment)fm.findFragmentById(R.id.viewpager);

        if(viewpagerFragment == null){
            viewpagerFragment = ViewpagerFragment.newInstance("blah","blah");
            fm.beginTransaction().add(R.id.container_main,viewpagerFragment).commit();
        }

    }
}
