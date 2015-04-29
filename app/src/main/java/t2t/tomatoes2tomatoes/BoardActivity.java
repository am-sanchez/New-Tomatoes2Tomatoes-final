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
import android.widget.ImageView;


public class BoardActivity extends ActionBarActivity {

    ImageButton c0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        c0=(ImageButton)findViewById(R.id.card0);

        c0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView placeCard = (ImageView) findViewById(R.id.placeholder);
                placeCard.setImageResource(R.drawable.red_card_design_preview);
            }
        });



    }
}
