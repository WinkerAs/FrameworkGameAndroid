package com.example.myapplication.framework;


public interface Pixmap {

    public int getWidth();

    public int getHeight();

    public Graphics.PixmapFormat getFormat();

    public void dispose();
}
