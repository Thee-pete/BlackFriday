package com.zuture.apps.blackfridaynew.classes;

import android.graphics.drawable.Drawable;

public class Stores {

    private Drawable imageRsc;
    private String storeTitle;
    private String storeDesc;
    private String storeLink;

    public  Stores(Drawable imageRsc, String storeTitle, String storeDesc, String storeLink){
        this.imageRsc=imageRsc;
        this.storeTitle= storeTitle;
        this.storeDesc= storeDesc;
        this.storeLink= storeLink;
    }


    public void setImageRsc(Drawable imageRsc) {
        this.imageRsc = imageRsc;
    }

    public Drawable getImageRsc() {
        return imageRsc;
    }

    public void setStoreTitle(String storeTitle) {
        this.storeTitle = storeTitle;
    }

    public String getStoreTitle() {
        return storeTitle;
    }

    public void setStoreDesc(String storeDesc) {
        this.storeDesc = storeDesc;
    }

    public String getStoreDesc() {
        return storeDesc;
    }

    public void setStoreLink(String storeLink) {
        this.storeLink = storeLink;
    }

    public String getStoreLink() {
        return storeLink;
    }
}
