package com.myapplicationdev.android.p07ps_mydatabook;

import android.graphics.drawable.Drawable;

public class NavigationItem {
    private String menuChoice;
    private Drawable menuImage;

    public NavigationItem(String menuChoice, Drawable menuImage) {
        this.menuChoice = menuChoice;
        this.menuImage = menuImage;
    }

    public String getMenuChoice() {
        return menuChoice;
    }

    public void setMenuChoice(String menuChoice) {
        this.menuChoice = menuChoice;
    }

    public Drawable getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(Drawable menuImage) {
        this.menuImage = menuImage;
    }
}
