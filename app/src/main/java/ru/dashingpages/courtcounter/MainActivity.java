package ru.dashingpages.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    int numPointsA = 0;
    int numPointsB = 0;

    public void dispalyForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.numPointsA);
        scoreView.setText(String.valueOf(score));
    }

    public void dispalyForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.numPointsB);
        scoreView.setText(String.valueOf(score));
    }

    public void plusThreeA(View v) {
        numPointsA += 3;
        dispalyForTeamA(numPointsA);
    }

    public void plusTwoA(View v) {
        numPointsA += 2;
        dispalyForTeamA(numPointsA);
    }

    public void plusOneA(View v) {
        numPointsA += 1;
        dispalyForTeamA(numPointsA);
    }

    public void plusThreeB(View v) {
        numPointsB += 3;
        dispalyForTeamB(numPointsB);
    }

    public void plusTwoB(View v) {
        numPointsB += 2;
        dispalyForTeamB(numPointsB);
    }

    public void plusOneB(View v) {
        numPointsB += 1;
        dispalyForTeamB(numPointsB);
    }

    public void resetPoints(View v) {
        numPointsA = 0;
        numPointsB = 0;
        dispalyForTeamA(numPointsA);
        dispalyForTeamB(numPointsB);
    }

}
