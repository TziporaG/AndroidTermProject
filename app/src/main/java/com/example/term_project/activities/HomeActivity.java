package com.example.term_project.activities;

import static com.example.term_project.lib.Utils.showInfoDialog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.term_project.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void startPlaying(View view) {
        startActivity (new Intent(getApplicationContext (), MainActivity.class));
    }

    //TODO add the text to this method and make it a string
    public void showAboutXylophone(View view) {

        showInfoDialog(HomeActivity.this,
                getString(R.string.info_title), "words...");
    }
}