package top.vitafresh.magicball;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public ImageView imgBall;
    public int imgArray[] = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBall=(ImageView)findViewById(R.id.imgBall);

    }

    protected void btnAskOnClick(View v){
        //Button click handler
        ((Button) v).setText("More");
        Random rnd = new Random();
        int n = rnd.nextInt(5);
        Log.d("DebInfo","Rnd=" + n);

        //Assign item from Image Aray to ImageView
        imgBall.setImageResource(imgArray[n]);

    }


}
