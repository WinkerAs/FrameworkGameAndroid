package com.example.myapplication.framework;

import android.text.method.Touch;
import android.view.View;

import java.util.List;

public interface TouchHandler extends View.OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<TouchEvent> getTouchEvents();
}
