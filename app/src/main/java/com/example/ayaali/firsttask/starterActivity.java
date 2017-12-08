package com.example.ayaali.firsttask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class starterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter);
        Thread timer=new Thread() {
            public void run() {

                try
                {
                    sleep(3000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally {
                    Intent main=new Intent("MainActivity");
                    startActivity(main);
                }
            }

        };
        timer.start();
    }
}
