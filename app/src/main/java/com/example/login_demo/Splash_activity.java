package com.example.login_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_activity extends AppCompatActivity {

    public static int SPALASH_SCREEN = 3000;
    Animation topanim, bottomanim;
    ImageView image;
    TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_activity);

        topanim = AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bottomanim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        image = findViewById(R.id.imageViewId);
        text1 = findViewById(R.id.textViewId);
        text2 = findViewById(R.id.textViewId2);

        image.setAnimation(topanim);
        text1.setAnimation(bottomanim);
        text2.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPALASH_SCREEN);
    }

}
