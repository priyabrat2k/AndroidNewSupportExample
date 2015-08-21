package com.appifiedtech.androidnewsupportexample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class FloatingActionButtonActivity extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton fImgBtnMedia, fImgBtnLock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);
        fImgBtnLock = (FloatingActionButton) findViewById(R.id.imgFloatbtn1);
        fImgBtnMedia = (FloatingActionButton) findViewById(R.id.imgFloatbtn2);
        fImgBtnLock.setOnClickListener(this);
        fImgBtnMedia.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_floating_action_button, menu);
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

    @Override
    public void onClick(View v) {

        int id = v.getId();
        if(id == R.id.imgFloatbtn1)
        {
            Toast.makeText(FloatingActionButtonActivity.this, "Clicked Lock", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.imgFloatbtn2)
        {
            Toast.makeText(FloatingActionButtonActivity.this, "Clicked Media", Toast.LENGTH_SHORT).show();
        }
    }
}
