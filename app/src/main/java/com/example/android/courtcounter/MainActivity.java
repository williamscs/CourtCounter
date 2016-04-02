package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

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

    public void threePointerScoredForTeamA(View v){
        this.scoreTeamA += 3;
        displayForTeamA(this.scoreTeamA);
    }

    public void twoPointerScoredForTeamA(View v){
        this.scoreTeamA += 2;
        displayForTeamA(this.scoreTeamA);
    }

    public void freeThrowScoredForTeamA(View v){
        this.scoreTeamA += 1;
        displayForTeamA(this.scoreTeamA);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void threePointerScoredForTeamB(View v){
        this.scoreTeamB += 3;
        displayForTeamB(this.scoreTeamB);
    }

    public void twoPointerScoredForTeamB(View v){
        this.scoreTeamB += 2;
        displayForTeamB(this.scoreTeamB);
    }

    public void freeThrowScoredForTeamB(View v){
        this.scoreTeamB += 1;
        displayForTeamB(this.scoreTeamB);
    }
}
