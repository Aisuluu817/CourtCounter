package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int scoreA = 0;
    int scoreB = 0;

    public void threePointsA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void TwoPointsA(View view) {
        scoreA+=2;
        displayForTeamA(scoreA);
    }
    public void FreeThrowA(View view) {
        scoreA++;
        displayForTeamA(scoreA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void threePointsB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void TwoPointsB(View view) {
        scoreB+=2;
        displayForTeamB(scoreB);
    }
    public void FreeThrowB(View view) {
        scoreB++;
        displayForTeamB(scoreB);
    }
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }



}