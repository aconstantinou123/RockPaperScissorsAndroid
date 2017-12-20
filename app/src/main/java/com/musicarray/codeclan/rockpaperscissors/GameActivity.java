package com.musicarray.codeclan.rockpaperscissors;

import android.content.Intent;
import android.os.TestLooperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {

    Button rockButton;
    Button scissorButton;
    Button paperButton;
    Game game;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

    rockButton = findViewById(R.id.rock_button);
    scissorButton = findViewById(R.id.scissors_button);
    paperButton = findViewById(R.id.paper_button);
    game = new Game();
    Intent intent = getIntent();

    if (intent.getSerializableExtra("game") != null){
        game = (Game)intent.getSerializableExtra("game");
    }


//    if there is an intent with extras
//                update the score to be the score from extras


    }

    public void onRockButtonClicked(View button){
        game.playerChoiceRock();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("game", game);
        startActivity(intent);

    }

    public void onScissorButtonClicked(View button){
        game.playerChoiceScissors();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("game", game);
        startActivity(intent);

    }

    public void onPaperButtonClicked(View button){
        game.playerChoicePaper();
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("game", game);
        startActivity(intent);

    }



}
