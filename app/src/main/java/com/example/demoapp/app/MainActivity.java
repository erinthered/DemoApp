package com.example.demoapp.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;


public class MainActivity extends Activity {

    Button mButton, nButton, eButton, pButton;


    public final static String EXTRA_MESSAGE = "com.example.DemoApp.MESSAGE";
    public final static String PREF_KEY = "com.example.DemoApp.PREFERENCE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonClick();
    }

    public void buttonClick() {

        mButton = (Button) findViewById(R.id.myButton);
        nButton = (Button) findViewById(R.id.nameButton);
        eButton = (Button) findViewById(R.id.emailButton);
        pButton = (Button) findViewById(R.id.phoneButton);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //any code inside here will be executed when this view is clicked
                Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);

                EditText editText = (EditText) findViewById(R.id.edit_message);

                intent.putExtra(EXTRA_MESSAGE, ((EditText) findViewById(R.id.edit_message)).getText().toString());
                startActivity(intent);
//                String message = editText.getText().toString();
//                intent.putExtra(EXTRA_MESSAGE, message);

            }
        });

        nButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
                EditText eText = (EditText) findViewById(R.id.edit_name);
                intent.putExtra(EXTRA_MESSAGE, ((EditText) findViewById(R.id.edit_name)).getText().toString());
                startActivity(intent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {


            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**Called when the user clicks the send button */
    public void sendMessage() {
        //Do something in response to button
        Intent intent = new Intent (this, DisplayMessageActivity.class);
        //grab edit text by view id and set it to the editText object
        EditText editText = (EditText) findViewById(R.id.edit_message);
        //set the contents typed in editText to the String object message
        String message = editText.getText().toString();
        //put string message inside the intent which will later be extracted in your second activity
        intent.putExtra(EXTRA_MESSAGE, message);
        //start your second activity using the intent that we have just configured
        startActivity(intent);
        
    }

}
