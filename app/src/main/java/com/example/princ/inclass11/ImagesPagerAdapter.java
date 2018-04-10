package com.example.princ.inclass11;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Toast;

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
        args.putInt("position",position+1);
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

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
        //if(pos==imageURLs.size()-1)
            //Toast.makeText(ctx, "Last Image", Toast.LENGTH_SHORT).show();

    }

}
