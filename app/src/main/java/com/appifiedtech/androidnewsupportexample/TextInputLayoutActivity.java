package com.appifiedtech.androidnewsupportexample;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TextInputLayoutActivity extends AppCompatActivity {

    private TextInputLayout textInputLayoutUserName, textInputLayoutUserPass;
    private EditText editTextUserName, editTextUserPass;
    private String txtUserName, txtUserPass;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textInputLayoutUserName = (TextInputLayout) findViewById(R.id.inputLayoutUserName);
        textInputLayoutUserPass = (TextInputLayout) findViewById(R.id.inputLayoutUserPass);
        editTextUserName = (EditText) findViewById(R.id.editTextUserName);
        editTextUserPass = (EditText) findViewById(R.id.editTextUserPass);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtUserName = editTextUserName.getText().toString();
                txtUserPass = editTextUserPass.getText().toString();
                if (txtUserName.equals("") || txtUserPass.equals("")) {
                    if (txtUserName.equals("")) {
                        textInputLayoutUserName.setError("Invalid Username");
                    }else
                        textInputLayoutUserName.setError("");
                    if (txtUserPass.equals("")) {
                        textInputLayoutUserPass.setError("Invalid Password");
                    }else
                        textInputLayoutUserPass.setError("");
                }else {
                    Toast.makeText(getApplicationContext(),"Validated Successfully",Toast.LENGTH_LONG).show();
                }
            }
        });
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
}
