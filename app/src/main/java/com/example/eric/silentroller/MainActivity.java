package com.example.eric.silentroller;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    static String TAG = "It's working!";
    private Button button;
    private EditText editText;
    Animation fadeOut;
    TextView textView;
    Button startFadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "setcontentview");
        button = (Button) findViewById(R.id.button);
        startFadeOut = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.editText);
        button.setOnClickListener(this);

    }

    public void onClick(View view) {
        Log.d(TAG, "button was clicked");


        editText = (EditText) findViewById(R.id.editText);
        int die1 = (int) (Math.random() * 11) + 2;
        String rollAsString = Integer.toString(die1);
        editText.setText(rollAsString);
        fadeOut = new AlphaAnimation(1.0f,0.0f);
        fadeOut.setDuration(4000);
        Log.d(TAG, "fadeComplete");
        textView.startAnimation(fadeOut);
        fadeOut.setFillAfter(true);

    }
}
