package com.example.princ.inclass11;

import java.util.ArrayList;

public class SearchImagesResponse {

    ArrayList<Hit> hits=new ArrayList<>();

    public class Hit{
        String largeImageURL;

        @Override
        public String toString() {
            return "Hit{" +
                    "largeImageURL='" + largeImageURL + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "SearchImagesResponse{" +
                ", hits=" + hits +
                '}';
    }
}
