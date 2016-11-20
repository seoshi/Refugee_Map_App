package ryhma.refugee_map_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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
            //Intent goToNextActivity = new Intent(getApplicationContext(), SettingsActivity.class);
            //startActivity(goToNextActivity);
            return true;
        }

        if (id == R.id.menu_about) {
            Intent goToNextActivity = new Intent(getApplicationContext(), AboutPage.class);
            startActivity(goToNextActivity);
        }

        if (id == R.id.menu_events) {
            Intent goToNextActivity = new Intent(getApplicationContext(), EventsPage.class);
            startActivity(goToNextActivity);
        }

        if (id == R.id.menu_map) {
            Intent goToNextActivity = new Intent(getApplicationContext(), MapsActivity.class);
            startActivity(goToNextActivity);
        }

        return super.onOptionsItemSelected(item);
    }
}
