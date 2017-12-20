package com.musicarray.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        startButton = findViewById(R.id.start_button);

    }

    public void onStartButtonClicked(View button) {
        Intent intent = new Intent(this, GameActivity.class);

        startActivity(intent);
    }
}
