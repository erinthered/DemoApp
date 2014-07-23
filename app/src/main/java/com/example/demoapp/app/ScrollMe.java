package com.example.demoapp.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.demoapp.app.R;

public class ScrollMe extends Activity {

    TextView headerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_scrollme);

        if(savedInstanceState==null) {
            eButton();
        }
    }

    public void eButton() {
        headerTextView = (TextView) findViewById(R.id.scroll_header);
        getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
        headerTextView.setText(getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.scroll_me, menu);
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
}
