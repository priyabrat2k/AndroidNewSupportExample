package com.appifiedtech.androidnewsupportexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_launcher, menu);
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

    public void goTextInputLayoutActivity(View view) {
        startActivity(new Intent(getApplicationContext(),TextInputLayoutActivity.class));
    }

    public void goNavigationViewActivity(View view) {
        startActivity(new Intent(getApplicationContext(),NavigationViewActivity.class));
    }

    public void goSnackbarActivity(View view) {
        startActivity(new Intent(getApplicationContext(),SnackBarActivity.class));
    }

    public void goToolBarScrollingActivity(View view) {
        startActivity(new Intent(getApplicationContext(),FloatingActionButtonActivity.class));
    }

    public void goFloatingButtonActivity(View view) {
        startActivity(new Intent(getApplicationContext(),FloatingActionButtonActivity.class));
    }
}
