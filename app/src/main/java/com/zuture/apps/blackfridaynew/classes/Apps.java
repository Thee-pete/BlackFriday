package com.zuture.apps.blackfridaynew.classes;

import android.graphics.drawable.Drawable;

public class Apps {


    private Drawable appImgRsc;
    private String appTitle;
    private String appDesc;
    private String appLink;

    public Apps(Drawable appImgRsc, String appTitle, String appDesc,String appLink){
        this.appImgRsc= appImgRsc;
        this.appTitle= appTitle;
        this.appDesc= appDesc;
        this.appLink = appLink;
    }

    public void setAppImgRsc(Drawable appImgRsc) {
        this.appImgRsc = appImgRsc;
    }

    public Drawable getAppImgRsc() {
        return appImgRsc;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    public String getAppTitle() {
        return appTitle;
    }

    public void setAppDesc(String appDesc) {
        this.appDesc = appDesc;
    }

    public String getAppDesc() {
        return appDesc;
    }

    public void setAppLink(String appLink) {
        this.appLink = appLink;
    }

    public String getAppLink() {
        return appLink;
    }
}
