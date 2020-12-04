package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score=0;
    int scores =0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reset(View v){
        score=0;
        scores=0;
        displayForTeamA(score);
        displayForTeamB(scores);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int scores) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scores));
    }
    public void point3(View v){
        score=score+3;
        displayForTeamA(score);
    }
    public void point2(View v){
        score=score+2;
        displayForTeamA(score);
    }
    public void free(View v){
        score=score+1;
        displayForTeamA(score);
    }
    public void points3(View v){
        scores=scores+3;
        displayForTeamB(scores);
    }
    public void points2(View v){
        scores=scores+2;
        displayForTeamB(scores);
    }
    public void free1(View v){
        scores=scores+1;
        displayForTeamB(scores);
    }
}
