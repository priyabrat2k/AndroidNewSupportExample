package com.appifiedtech.androidnewsupportexample;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SnackBarActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPress;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack_bar);
        textView = (TextView) findViewById(R.id.textView2);
        btnPress = (Button) findViewById(R.id.btnPress);
        btnPress.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_snack_bar, menu);
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
        if (v.getId() == R.id.btnPress) {
            textView.setText("Pressed");
            //Snackbar.make(v,"I am SnackBar 1",Snackbar.LENGTH_LONG).show();
            /*Snackbar.make(v, "I am SnackBar 2", Snackbar.LENGTH_LONG).setAction("Undo", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.setText("Unpressed");
                }
            }).show();*/
            Snackbar.make(v, "I am SnackBar 3", Snackbar.LENGTH_LONG).setAction("Undo",onClickListener).show();
        }
    }
    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            textView.setText("Unpressed");
        }
    };
}
