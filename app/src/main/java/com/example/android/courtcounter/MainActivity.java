package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    // Bind Views using ButterKnife.
    @BindView(R.id.team_a_score) TextView ScoreViewA;
    @BindView(R.id.team_b_score) TextView scoreViewB;

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        ScoreViewA.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        scoreViewB.setText(String.valueOf(score));
    }

    /**
     * Increases the score of Team A by 3 points.
     */
    @OnClick(R.id.addThreeForTeamA)
    public void addThreeForTeamA(){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increases the score of Team A by 2 points.
     */
    @OnClick(R.id.addTwoForTeamA)
    public void addTwoForTeamA(){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increases the score of Team A by 1 point.
     */
    @OnClick(R.id.addoneForTeamA)
    public void addoneForTeamA(){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    @OnClick(R.id.resetScore)
    public void resetScore() {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increases the score of Team B by 3 points.
     */
    @OnClick(R.id.addThreeForTeamB)
    public void addThreeForTeamB(){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increases the score of Team B by 2 points.
     */
    @OnClick(R.id.addTwoForTeamB)
    public void addTwoForTeamB(){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increases the score of Team B by 1 point.
     */
    @OnClick(R.id.addOneForTeamB)
    public void addOneForTeamB(){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
}
