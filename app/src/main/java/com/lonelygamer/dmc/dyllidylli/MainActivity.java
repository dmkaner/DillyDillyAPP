package com.lonelygamer.dmc.dyllidylli;

import android.app.ActionBar;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp, mp1, mp2, mp3, mp4, mp5, mp6, mp7;
    ImageView scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scroll = findViewById(R.id.scroll);

        mp = MediaPlayer.create(MainActivity.this, R.raw.test);

        mp1 = MediaPlayer.create(MainActivity.this, R.raw.d);
        mp2 = MediaPlayer.create(MainActivity.this, R.raw.d2);
        mp3 = MediaPlayer.create(MainActivity.this, R.raw.d3);
        mp4 = MediaPlayer.create(MainActivity.this, R.raw.d4);
        mp5 = MediaPlayer.create(MainActivity.this, R.raw.d5);
        mp6 = MediaPlayer.create(MainActivity.this, R.raw.d6);
        mp7 = MediaPlayer.create(MainActivity.this, R.raw.d7);

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
    }

    public void playSound(View v) {


        //mp.start();

        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        Random rand = new Random();
        int n = rand.nextInt(7) + 1;

        if (n ==1) {
            mp1.start();
        } else if (n == 2) {
            mp2.start();
        } else if (n == 3) {
            mp3.start();
        } else if (n == 4) {
            mp4.start();
        } else if (n == 5) {
            mp5.start();
        } else if (n == 6) {
            mp6.start();
        } else if (n == 7) {
            mp7.start();
        }

    }

    @Override
    protected void onDestroy() {
        mp1.release();
        mp2.release();
        mp3.release();
        mp4.release();
        mp5.release();
        mp6.release();
        mp7.release();

        super.onDestroy();
    }

    public void showHelp(View v){
        if (scroll.getVisibility() == View.INVISIBLE){
            scroll.setVisibility(View.VISIBLE);
        } else {
            scroll.setVisibility(View.INVISIBLE);
        }
    }

    public void unShowHelp(View v){
        if (scroll.getVisibility() == View.INVISIBLE){
            scroll.setVisibility(View.VISIBLE);
        } else {
            scroll.setVisibility(View.INVISIBLE);
        }
    }

}
