package t2t.tomatoes2tomatoes;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.content.ClipData;
import android.graphics.drawable.Drawable;
import android.view.DragEvent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.view.MotionEvent;
import java.lang.reflect.Method;
import android.view.View.OnTouchListener;
import android.view.View.OnClickListener;




public class BoardActivity extends ActionBarActivity implements OnTouchListener {

    ImageButton c0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        c0=(ImageButton)findViewById(R.id.card0);
        c0.setOnTouchListener(this);

    }
    float x,y= 0.0f;
    boolean moving=false;
    @Override
    public boolean onTouch(View v, MotionEvent event) {

        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                moving=true;
                break;
            case MotionEvent.ACTION_MOVE:
                    if(moving) {
                    x=event.getRawX()-c0.getWidth()/2;
                    y=event.getRawY()-c0.getHeight()*2;
                    c0.setX(x);
                     c0.setY(y);

                    }
                break;
            case MotionEvent.ACTION_UP:
                moving=false;
                break;
        }

        return true;

    }
}
