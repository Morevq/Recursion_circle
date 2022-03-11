package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View {
    void draws(int x, int y, int r, Paint paint, Canvas canvas){
        canvas.drawCircle(x,y,r,paint);
        if(r>1) {
            draws(x - r, y, r / 3, paint, canvas);
            draws(x + r, y, r / 3, paint, canvas);
            draws(x, y  - r, r / 3, paint, canvas);
            draws(x, y + r, r / 3, paint, canvas);
        }
    }
    public MyDraw(Context contex){
        super(contex);
        paint.setStyle(Paint.Style.STROKE);
    }
    Paint paint = new Paint();
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //canvas.drawCircle(100,100,50,paint);
        draws(500, 500, 250, paint, canvas);
    }
}
