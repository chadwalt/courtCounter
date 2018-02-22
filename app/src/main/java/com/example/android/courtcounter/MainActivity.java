package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increases the score of Team A by 3 points.
     */
    public void addThreeForTeamA(View v){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increases the score of Team A by 2 points.
     */
    public void addTwoForTeamA(View v){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increases the score of Team A by 1 point.
     */
    public void addoneForTeamA(View v){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increases the score of Team B by 3 points.
     */
    public void addThreeForTeamB(View v){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increases the score of Team B by 2 points.
     */
    public void addTwoForTeamB(View v){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increases the score of Team B by 1 point.
     */
    public void addoneForTeamB(View v){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
}