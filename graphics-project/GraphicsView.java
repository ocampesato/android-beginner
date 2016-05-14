package com.iquarkt.buttonsandgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

public class GraphicsView extends View
{
    private ShapeDrawable mDrawable;

    public GraphicsView(Context context)
    {
        super(context);

        int x=10, y=10, width=300, height=300;

        mDrawable = new ShapeDrawable(new OvalShape());
        mDrawable.getPaint().setColor(0xff0000);
        mDrawable.setBounds(x, y, x + width, y + height);
    }

    protected void onDraw(Canvas canvas)
    {
        mDrawable.draw(canvas);
    }
}
