package com.example.princ.inclass11;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class ImagesPagerAdapter extends FragmentStatePagerAdapter {

    private ArrayList<SearchImagesResponse.Hit> imageURLs;
    private final String TAG="demoIPAdapter";
    private Context ctx;

    ImagesPagerAdapter(FragmentManager fm, ArrayList<SearchImagesResponse.Hit> images,SearchPhotosActivity searchPhotosActivity) {
        super(fm);
        this.imageURLs=images;
        this.ctx=searchPhotosActivity;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new ImageObjectFragment();
        Bundle args = new Bundle();
        args.putString(ImageObjectFragment.ARG_OBJECT,imageURLs.get(position).largeImageURL);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public int getCount() {
        return imageURLs.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "IMAGE " + (position + 1);
    }

}
