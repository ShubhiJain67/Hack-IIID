package com.example.tejas.hack_iiid.Splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.airbnb.lottie.LottieAnimationView;
import com.example.tejas.hack_iiid.HOME.home_act;
import com.example.tejas.hack_iiid.MainActivity;
import com.example.tejas.hack_iiid.R;

public class Splash extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        LottieAnimationView splashAnim=findViewById(R.id.splashAnimView);
        splashAnim.playAnimation();

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent i = new Intent(Splash.this, home_act.class);
                startActivity(i);
<<<<<<< HEAD
                Intent intent = new Intent(Splash.this, MainActivity.class);
                startActivity(intent);

=======
>>>>>>> 8593788f2b78839b6507391989a3157f1fcc7895
                finish();
            }
        }, SPLASH_TIME_OUT);


    }

}
