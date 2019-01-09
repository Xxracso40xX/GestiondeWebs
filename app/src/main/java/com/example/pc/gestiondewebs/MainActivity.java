package com.example.pc.gestiondewebs;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.Menu;
import android.view.MenuItem;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuBuilder m = (MenuBuilder) menu;
        m.setOptionalIconsVisible(true);
        return true;
    }


    @SuppressLint("NewApi")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i42 = new Intent(Intent.ACTION_CALL);
        String cadena = "";
        switch (item.getItemId()) {
            case R.id.opcion1:
                cadena = "https://es-es.facebook.com/";
                break;
            case R.id.opcion2:
                cadena = "https://twitter.com/?lang=es";
                break;
            case R.id.opcion3:
                cadena = "https://www.reddit.com/";
                break;
        }
        Uri uri = Uri.parse(cadena);
        startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
        return false;
    }
}
