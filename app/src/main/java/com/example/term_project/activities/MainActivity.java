package com.example.term_project.activities;

import static com.example.term_project.lib.Utils.showInfoDialog;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.term_project.R;
import com.example.term_project.models.Xylophone;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private Xylophone xylophone;
    private Snackbar mSnackBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupToolbar();
        setupViews();
        setupFAB();
        setupFields();
    }

    /**
    private void startHomeScreen() {

        dismissSnackBarIfShown();
        Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
        startActivityForResult(intent, 1);
    }*/

    private void setupFields() {
        Intent intent = new Intent(this,MainActivity. class);
        Bundle bundle = new Bundle();
        xylophone = new Xylophone(getApplicationContext());
    }

    private void setupViews() {
        mSnackBar =
                Snackbar.make(findViewById(android.R.id.content), getString(R.string.welcome),
                        Snackbar.LENGTH_LONG);
    }

    private void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void setupFAB() {
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInfoDialog(MainActivity.this,
                        getString(R.string.info_title), xylophone.getInfo());
            }
        });
    }

    private void dismissSnackBarIfShown() {
        if (mSnackBar.isShown()) {
            mSnackBar.dismiss();
        }
    }

    public void a(View view) {

        xylophone.a(view);
    }
    public void b(View view) {

        xylophone.b(view);
    }
    public  void c(View view) {

        xylophone.c(view);
    }
    public  void d(View view) {

        xylophone.d(view);
    }
    public  void e(View view) {

        xylophone.e(view);
    }
    public void f(View view) {

        xylophone.f(view);
    }
    public  void g(View view) {

        xylophone.g(view);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
       if (itemId == R.id.action_settings) {
            showSettings();
            return true;
        } else if (itemId == R.id.action_about) {
            showAbout();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showAbout() {
        dismissSnackBarIfShown();
        showInfoDialog(MainActivity.this, "About Xylophone App",
                "\nThank you for playing beautiful music! Hope you enjoy!\n" +
                        "\nBy Tehila Raful and Tzipora Gutmann");
    }

    private void showSettings() {
        dismissSnackBarIfShown();
        Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
        startActivityForResult(intent, 1);
    }



}
