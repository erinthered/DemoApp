package com.example.demoapp.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * Created by Erin on 6/29/2014.
 */
public class DisplayMessageActivity extends Activity {

    TextView mTextView, nTextView, eTextView, pTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);

        if(savedInstanceState == null) {
            init();
        }
    }

    public void init() {
        mTextView = (TextView) findViewById(R.id.textview_tv);
        getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);
        mTextView.setText(getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE));

    }

}
