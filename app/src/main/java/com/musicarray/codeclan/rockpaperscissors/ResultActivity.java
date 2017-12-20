package com.musicarray.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView resultView;
    Button playAgainButton;
    TextView playerScore;
    TextView computerScore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        resultView = findViewById(R.id.result_view);
        playAgainButton = findViewById(R.id.play_again_button);
        playerScore = findViewById(R.id.player_score_result);
        computerScore = findViewById(R.id.computer_score_result);
        Intent intent = getIntent();
        Game game = (Game)intent.getSerializableExtra("game");
        resultView.setText(game.generateWinner());
        playerScore.setText(game.getPlayerScore().toString());
        computerScore.setText(game.getComputerScore().toString());

    }

    public void onPlayAgainButtonClick(View button) {
        Intent intent2 = new Intent(this, GameActivity.class);
        Intent intent = getIntent();
        Game game = (Game)intent.getSerializableExtra("game");
        intent2.putExtra("game", game);
        startActivity(intent2);
    }

}
