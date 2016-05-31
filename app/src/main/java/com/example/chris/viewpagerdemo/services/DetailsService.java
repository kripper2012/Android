package com.example.chris.viewpagerdemo.services;

import com.example.chris.viewpagerdemo.model.Information;

import java.util.ArrayList;

/**
 * Created by Chris on 31/05/2016.
 */
public class DetailsService {
    private static DetailsService ourInstance = new DetailsService();

    public static DetailsService getInstance() {
        return ourInstance;
    }

    private DetailsService() {
    }

    public ArrayList<Information> getInformation(){
        ArrayList<Information> info = new ArrayList<>();
        info.add(new Information("Yoda", "10 Hight Street", "Married", "Footie", "6ft2", "Porsche"));
        info.add(new Information("Homer Simpson", "22 Springfield Road", "Married", "Drinking", "5ft10", "Fiat"));
        info.add(new Information("George Constanza", "10 Broadway", "Single", "Complaining", "5ft5", "Stolen"));

        return info;

    }
}
