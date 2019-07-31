package com.github.muhin007.courtcounter;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int scoreTeamA = 0;
    public int scoreTeamB = 0;
    final int PLUS_THREE_POINTS = 3;
    final int PLUS_TWO_POINTS = 2;
    final int PLUS_ONE_POINT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusThreePointsTeamA(View view){
        scoreTeamA += PLUS_THREE_POINTS;
        displayTotalScoreTeamA(scoreTeamA);
    }
    public void plusTwoPointsTeamA(View view){
        scoreTeamA += PLUS_TWO_POINTS;
        displayTotalScoreTeamA(scoreTeamA);
    }
    public void plusOnePointTeamA(View view){
        scoreTeamA += PLUS_ONE_POINT;
        displayTotalScoreTeamA(scoreTeamA);
    }

    @SuppressLint("SetTextI18n")
    private void displayTotalScoreTeamA(int point) {
        TextView quantityTextView = findViewById(
                R.id.total_score_A);
        quantityTextView.setText("" + point);
    }

    public void plusThreePointsTeamB(View view){
        scoreTeamB += PLUS_THREE_POINTS;
        displayTotalScoreTeamB(scoreTeamB);
    }
    public void plusTwoPointsTeamB(View view){
        scoreTeamB += PLUS_TWO_POINTS;
        displayTotalScoreTeamB(scoreTeamB);
    }
    public void plusOnePointTeamB(View view){
        scoreTeamB += PLUS_ONE_POINT;
        displayTotalScoreTeamB(scoreTeamB);
    }

    @SuppressLint("SetTextI18n")
    private void displayTotalScoreTeamB(int point) {
        TextView quantityTextView = findViewById(
                R.id.total_score_B);
        quantityTextView.setText("" + point);
    }
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTotalScoreTeamA(scoreTeamA);
        displayTotalScoreTeamB(scoreTeamB);
    }
}
