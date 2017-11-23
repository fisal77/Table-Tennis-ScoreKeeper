package com.fisal.tabletennisscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the result for 1st Team
    int firstTeamResult = 0;

    // Tracks the result for 2nd Team
    int secondTeamResult = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the result for 1st Team by 1 point.
     */
    public void addOneFor1stTeam(View v) {
        firstTeamResult = firstTeamResult + 1;
        displayFor1stTeam(firstTeamResult);
    }

    /**
     * Increase the result for 1st Team by 2 points.
     */
    public void addTwoFor1stTeam(View v) {
        firstTeamResult = firstTeamResult + 2;
        displayFor1stTeam(firstTeamResult);
    }

    /**
     * Increase the result for 2nd Team by 1 point.
     */
    public void addOneFor2ndTeam(View v) {
        secondTeamResult = secondTeamResult + 1;
        displayFor2ndTeam(secondTeamResult);
    }

    /**
     * Increase the result for 2nd Team by 2 points.
     */
    public void addTwoFor2ndTeam(View v) {
        secondTeamResult = secondTeamResult + 2;
        displayFor2ndTeam(secondTeamResult);
    }


    /**
     * Resets the result for both teams back to 0.
     */
    public void resetResult(View v) {
        firstTeamResult = 0;
        secondTeamResult = 0;
        displayFor1stTeam(firstTeamResult);
        displayFor2ndTeam(secondTeamResult);
    }

    /**
     * Displays the given result for 1st Team.
     */
    public void displayFor1stTeam(int result) {
        TextView resultView = findViewById(R.id.first_team_result);
        resultView.setText(String.valueOf(result));
    }

    /**
     * Displays the given result for 2nd Team.
     */
    public void displayFor2ndTeam(int result) {
        TextView resultView = findViewById(R.id.second_team_result);
        resultView.setText(String.valueOf(result));
    }

}
