package com.example.panea.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int redPlayer = 0;
    int bluePlayer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Used for saving and restoring the app state after screen rotation
     */

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("redPlayer", redPlayer);
        outState.putInt("bluePlayer", bluePlayer);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        redPlayer = savedInstanceState.getInt("redPlayer");
        bluePlayer = savedInstanceState.getInt("bluePlayer");
        displayForRedPlayer(redPlayer);
        displayForBluePlayer(bluePlayer);
    }


    /**
     * Displays the given score for Red Player.
     */

    public void displayForRedPlayer(int score) {

        TextView scoreView = (TextView) findViewById(R.id.red_player_score);

        scoreView.setText(String.valueOf(score));

    }

    /**
     * Displays the given score for Blue Player.
     */

    public void displayForBluePlayer(int score) {
        TextView scoreView = (TextView) findViewById(R.id.blue_player_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Updates the score for red player.
     */

    public void addOneToRedPlayer(View view) {
        redPlayer = redPlayer + 1;
        displayForRedPlayer(redPlayer);
    }

    /**
     * Updates the score for blue player.
     */

    public void addOneToBluePlayer(View view) {
        bluePlayer = bluePlayer + 1;
        displayForBluePlayer(bluePlayer);
    }

    /**
     * Resets score for both players
     */

    public void resetScore(View view) {
        redPlayer = 0;
        bluePlayer = 0;
        displayForRedPlayer(redPlayer);
        displayForBluePlayer(bluePlayer);
    }
}
