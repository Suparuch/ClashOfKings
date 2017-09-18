package com.somkual.clashofkings;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void menuAction(View view) {
        int intID = view.getId();
        Button button = (Button) findViewById(intID);
        String mTag = String.valueOf(view.getTag());
        String title = button.getText().toString();
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("mTag", mTag);
        intent.putExtra("title", title);
        startActivity(intent);
    }
}
