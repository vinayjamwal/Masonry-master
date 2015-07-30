package com.grafixartist.masonry;

/**
 * Created by Virtuoso on 7/30/2015.
 */
public class Items {

     int images;

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    String names;

    public Items(int images,String names ){
        this.images=images;
        this.names=names;
    }



}
