package com.jorgesys.app1.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import com.jorgesys.app1.R;

import java.util.ArrayList;
import java.util.List;

public class CustomView extends View {

    List<Float> X_coordinates;
    List<Float> Y_coordinates;

    Paint paint = new Paint();

    public CustomView(Context context) {
        super(context);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(15);
        paint.setStyle(Paint.Style.STROKE);
    }

    public void onDraw(Canvas canvas) {
        X_coordinates = new ArrayList<>();
        Y_coordinates = new ArrayList<>();

        X_coordinates.add((float) 100);
        X_coordinates.add((float) 200);
        X_coordinates.add((float) 300);
        X_coordinates.add((float) 400);
        X_coordinates.add((float) 500);

        Y_coordinates.add((float) 100);
        Y_coordinates.add((float) 200);
        Y_coordinates.add((float) 300);
        Y_coordinates.add((float) 400);
        Y_coordinates.add((float) 500);

        for (int i = 0; i < X_coordinates.size(); i++) {
            float x = X_coordinates.get(i);
            float y = Y_coordinates.get(i);

            //Create bitmap.
            Bitmap b = BitmapFactory.decodeResource(getResources(), R.drawable.and);
            //Draw bitmap.
            canvas.drawBitmap(b, x, y, paint);
            //Draw point.
            canvas.drawPoint(x, y, paint);

        }
        super.onDraw(canvas);
    }
}