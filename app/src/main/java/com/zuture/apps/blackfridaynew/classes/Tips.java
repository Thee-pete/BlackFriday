package com.zuture.apps.blackfridaynew.classes;

public class Tips {
    private String tipTitle;
    private String tipDesc;

    public Tips(String tipTitle, String tipDesc){
        this.tipTitle= tipTitle;
        this.tipDesc=tipDesc;
    }

    public void setTipTitle(String tipTitle) {
        this.tipTitle = tipTitle;
    }

    public String getTipTitle() {
        return tipTitle;
    }

    public void setTipDesc(String tipDesc) {
        this.tipDesc = tipDesc;
    }

    public String getTipDesc() {
        return tipDesc;
    }
}
