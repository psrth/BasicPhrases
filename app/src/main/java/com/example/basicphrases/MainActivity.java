package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void hello(View view)
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.hello);
        mediaPlayer.start();
    }

    public void goodEvening(View view)
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.goodevening);
        mediaPlayer.start();
    }

    public void doYouSpeakEnglish(View view)
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.doyouspeakenglish);
        mediaPlayer.start();
    }

    public void howAreYou(View view)
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.howareyou);
        mediaPlayer.start();
    }

    public void comeFrom(View view)
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.ilivein);
        mediaPlayer.start();
    }

    public void myNameIs(View view)
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.mynameis);
        mediaPlayer.start();
    }

    public void please(View view)
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.please);
        mediaPlayer.start();
    }

    public void thankYou(View view)
    {
        mediaPlayer = MediaPlayer.create(this, R.raw.welcome);
        mediaPlayer.start();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
