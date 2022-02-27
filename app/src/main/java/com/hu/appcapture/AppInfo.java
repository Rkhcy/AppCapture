package com.hu.appcapture;

import android.graphics.drawable.Drawable;

public class AppInfo {
    private String name;
    private Drawable icon;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    public Drawable getIcon() {
        return icon;
    }
}
