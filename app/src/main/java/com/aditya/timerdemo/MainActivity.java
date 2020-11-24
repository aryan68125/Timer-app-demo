package com.aditya.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
Timer allows us to run our code at a specific time or over and over again

METHOD 1:-
First way to use the Timer is by use of Handeler and a Runnable
Handler allows us to do some Timing Function
Handler handler = new Handler(); this code runs runnable
Runnable runnable = new Runnable()
{
            @Override
            public void run()
            {
               //our Handler is going to run the code that is inside this Runnable
               handler.postDelayed(this, time in milli seconds) // Scheduling the Handler to run the code inside the runnable after X amount of time
                                                                //this is referring to the runnable
            }
        };

 handler.post(runnable); //At some point when we need to kick off the process i.e we are giving it a position to start

Method 2:-
Countdown Timer
new CountDownTimer(how many milliseconds do you want it to run for, Countdown interval i.e if you want it to do something in every 1 second you will pass 1000 milli seconds here)
{
	with this countdown timer we need to implement two more methods

	 public void onTick(long MillisecondsUntilDone)
               {
                   this method will be called whenever the countdown timer is reached
                   Log.i("seconds left", String.valueOf(MillisecondsUntilDone/1000)); //String.valueOf(MillisecondsUntilDone/1000) :- converts integer to String
               }
     public void onFinish()
               {
                   This function will run whenever the countdown timer is completely finished
               }
} .start();
         */
        /*
        Method 1 Syntax and actual code
        final Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                 Log.i("runnable", "a second has passed");
                 handler.postDelayed(this, 1000);
            }
        };
        handler.post(runnable);
         */

        new CountDownTimer(10000,1000)
        {
               public void onTick(long MillisecondsUntilDone)
               {
                        Log.i("left", String.valueOf(MillisecondsUntilDone/1000));
               }

               public void onFinish()
               {
                       Log.i("we are done", "No more countdown");
               }
        }.start();

    }
}