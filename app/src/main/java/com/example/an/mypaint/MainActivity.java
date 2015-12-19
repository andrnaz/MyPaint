package com.example.an.mypaint;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public static final int LINE = 1;
    public static final int RECTANGLE = 3;
    public static final int SQUARE = 4;
    public static final int CIRCLE = 5;
    public static final int TRIANGLE = 6;
    public static final int SMOOTHLINE = 2;

    public static final float TOUCH_TOLERANCE = 4;
    public static final float TOUCH_STROKE_WIDTH = 5;

 String sMenu;
 static int iMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(new DrawingView(this));
   }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("LINE");
        menu.add("SMOOTHLINE");
        menu.add("RECTANGLE");
        menu.add("SQUARE");
        menu.add("CIRCLE");
        menu.add("TRIANGLE");


        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        sMenu = item.getTitle().toString();
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();


switch ( item.getTitle().toString() ){
    case "LINE":
       iMenu = 1;
        break;
    case "SMOOTHLINE":
        iMenu = 2;
        break;
    case "RECTANGLE":
        iMenu = 3;
        break;
    case "SQUARE":
        iMenu = 4;
        break;
    case "CIRCLE":
        iMenu = 5;
        break;
    case "TRIANGLE":
        iMenu = 6;
        break;


};
        return super.onOptionsItemSelected(item);
    }
}
