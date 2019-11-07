package com.example.myapplication.framework;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;

import java.util.List;

public class AndroidInput implements Input{

    AccelerometrHandler accelHandler;
    KeyboardHandler keyHandler;
    TouchHandler touchHandler;

    public AndroidInput(Context context, View view, float scaleX, float scaleY) {

        accelHandler = new AccelerometrHandler(context);
        keyHandler = new KeyboardHandler(view);
        if(Integer.parseInt(Build.VERSION.SDK
        ) < 5)
            touchHandler = new SingleTouchHandler(view, scaleX, scaleY);
        else
            touchHandler = new Multitouchhandler(view, scaleX, scaleY);
        }

    @Override
    public boolean isKeyPressed(int keyCode) {
        return keyHandler.isKeyPressed(keyCode);
    }

    @Override
    public boolean isTouchDown(int pointer) {
        return touchHandler.isTouchDown(pointer);
    }

    @Override
    public int isTouchX(int pointer) {
        return touchHandler.getTouchX(pointer);
    }

    @Override
    public int isTouchY(int pointer) {
        return touchHandler.getTouchY(pointer);
    }

    @Override
    public float getAccelX() {
        return accelHandler.accelX;
    }

    @Override
    public float getAccelY() {
        return accelHandler.accelY;
    }

    @Override
    public float getAccelZ() {
        return accelHandler.accelZ;
    }

    @Override
    public List<TouchEvent> getTouchEvents() {
        return getTouchEvents();
    }

    @Override
    public List<KeyEvent> getKeyEvents() {
        return getKeyEvents();
    }
}
