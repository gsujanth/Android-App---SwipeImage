package com.example.princ.inclass11;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class ImageObjectFragment extends Fragment {

    public static final String ARG_OBJECT = "object";
    private final String TAG="demoIOFragment";
    ImageView imageView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(
                R.layout.fragment_collection_object, container, false);
        Bundle args = getArguments();
        imageView = rootView.findViewById(R.id.imageView);
        if(args!=null) {
            Picasso.get().load(args.getString(ARG_OBJECT)).into(imageView);
            int pos=args.getInt("position");
            Toast.makeText(rootView.getContext(), "Image "+pos, Toast.LENGTH_SHORT).show();
        }
        return rootView;
    }
}
