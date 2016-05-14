package com.iquarkt.buttonsandgraphics;

import android.app.Activity;
import android.os.Bundle;

public class ButtonsAndGraphicsActivity extends Activity
{
    GraphicsView mGraphicsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mGraphicsView = new GraphicsView(this);

        setContentView(R.layout.activity_buttons_and_graphics);

//        setContentView(mGraphicsView);
        //setContentView(new GraphicsView(this));
    }
}
