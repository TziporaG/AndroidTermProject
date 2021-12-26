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

    public void showAboutXylophone(View view) {

        showInfoDialog(HomeActivity.this,
                getString(R.string.title), "The xylophone literally meaning 'sound of wood' in Ancient Greek is a musical instrument in the percussion instrument family that consists of wooden bars struck by mallets. (Wikipedia) ");
    }
}