package com.example.vaishu.dt1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView myT,myT1,myT2,myT3,myT4,myT5,myT6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myT = (TextView) findViewById(R.id.textView3);
        myT1 = (TextView) findViewById(R.id.textView4);
        myT2= (TextView) findViewById(R.id.textView5);
        myT3 = (TextView) findViewById(R.id.textView6);
        myT4 = (TextView) findViewById(R.id.textView7);
        myT5 = (TextView) findViewById(R.id.textView8);
    }

    int n;
    int[] cnt= new int[]{0, 0, 0, 0, 0, 0};
    int ch = 0;

    public void infinitystone(View view) {


        String[] stones = {"Power Stone", "Space Stone", "Time Stone", "Reality Stone", "Soul Stone", "Mind Stone"};
        String mesg="You got all the stones";
        Random rand = new Random();
        n = rand.nextInt(6);
        if (cnt[n] != 1) {

            TextView myText = (TextView) findViewById(R.id.textView);
            String myString = stones[n];
            myText.setText(myString);
            switch (n) {
                case 0:
                    myText.setTextColor(Color.rgb(157, 4, 223));

                    myT.setTextColor(Color.rgb(157, 4, 223));
                    myT.setText(myString);
                    break;
                case 1:
                    myText.setTextColor(Color.rgb(19, 210, 238));

                    myT1.setTextColor(Color.rgb(19, 210, 238));
                    myT1.setText(myString);
                    break;
                case 2:
                    myText.setTextColor(Color.rgb(21, 221, 35));

                    myT2.setTextColor(Color.rgb(21, 221, 35));
                    myT2.setText(myString);
                    break;
                case 3:
                    myText.setTextColor(Color.rgb(229, 20, 20));

                    myT3.setTextColor(Color.rgb(229, 20, 20));
                    myT3.setText(myString);
                    break;
                case 4:
                    myText.setTextColor(Color.rgb(255, 143, 3));

                    myT4.setTextColor(Color.rgb(255, 143, 3));
                    myT4.setText(myString);
                    break;
                case 5:
                    myText.setTextColor(Color.rgb(251, 216, 9));

                    myT5.setTextColor(Color.rgb(251, 216, 9));
                    myT5.setText(myString);
                    break;
            }


        }
        cnt[n] = 1;
       /* String test=String.valueOf(cnt[n]);
        TextView myT7 = (TextView) findViewById(R.id.textView10);
        myT7.setText(test);*/
        ch = 0;
        for (int i = 0; i < 6; i++)
            if (cnt[i] == 0)
                ch = 1;

        if (ch == 0) {
            myT6 = (TextView) findViewById(R.id.textView9);
            myT6.setText(mesg);

        }


    }

   public void reset(View view) {
        String s=" ";
        for (int i = 0; i < 6; i++)
            cnt[i] = 0;

        myT.setText(s);
       myT1.setText(s);
       myT2.setText(s);
       myT3.setText(s);
       myT4.setText(s);
       myT5.setText(s);
       myT6.setText(s);

        ch = 0;
    }
}
