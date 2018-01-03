package com.example.jw.stargrazed;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new Drawing(this));
    }

    public class Drawing extends View {
        Paint paint = null;

        public Drawing(Context context) {
            super(context);
            paint = new Paint();
        }

        @Override
        @SuppressWarnings("ResourceType")
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int x = getWidth();
            int y = getHeight();
            //drawStar(100, 100, "#00FF00", 20, canvas); //pass in the canvas

            TypedArray star = getResources().obtainTypedArray(R.array.ursa_minor0);
            drawStar(star.getFloat(0,0), star.getFloat(1,0),
                    "#000000", 5, canvas );
            star = getResources().obtainTypedArray(R.array.ursa_minor1);
            drawStar(star.getFloat(0,0), star.getFloat(1,0),
                    "#000000", 5, canvas );

            star = getResources().obtainTypedArray(R.array.ursa_minor2);
            drawStar(star.getFloat(0,0), star.getFloat(1,0),
                    "#000000", 5, canvas );
            star = getResources().obtainTypedArray(R.array.ursa_minor3);
            drawStar(star.getFloat(0,0), star.getFloat(1,0),
                    "#000000", 5, canvas );
            star = getResources().obtainTypedArray(R.array.ursa_minor4);
            drawStar(star.getFloat(0,0), star.getFloat(1,0),
                    "#000000", 5, canvas );
            star = getResources().obtainTypedArray(R.array.ursa_minor5);
            drawStar(star.getFloat(0,0), star.getFloat(1,0),
                    "#000000", 5, canvas );
            star = getResources().obtainTypedArray(R.array.ursa_minor6);
            drawStar(star.getFloat(0,0), star.getFloat(1,0),
                    "#000000", 5, canvas );

            //Log.d("ADebugTag", "Value: " + Float.toString(star.getFloat(0, 0)));

        }

        private void drawStar(float x, float y, String color, int radius, Canvas canvas){
            int dist_mult = 15; //so they aren't squashed together
            int x_offset = 100;
            int y_offset = 100;

            paint.setStyle(Paint.Style.FILL);
            // Use Color.parseColor to define HTML colors
            paint.setColor(Color.parseColor(color));
            canvas.drawCircle(Math.abs(x)*dist_mult - x_offset, y*dist_mult - y_offset, radius, paint);
        }
    }
}