package com.tsahilgaanchin.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.*;
import android.view.*;

public class MainActivity extends Activity {

    float x = 300, y = 300;
    Paint paint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);

        setContentView(new View(this) {
            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                canvas.drawCircle(x, y, 80, paint);
            }

            @Override
            public boolean onTouchEvent(MotionEvent event) {
                x = event.getX();
                y = event.getY();
                invalidate();
                return true;
            }
        });
    }
}
