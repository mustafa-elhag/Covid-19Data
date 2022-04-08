package com.cst2335.covid_19data;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;



import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


        DrawerLayout drawerLayout;
        ActionBarDrawerToggle actionBarDrawerToggle;
        NavigationView navigationView;
        EditText etName;
        TextView tvFrom, tvTo;
        Button btnSearch;
        ProgressBar progressBar;

        String name, from, to;
        Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH);

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            etName = findViewById(R.id.et_name);
            tvFrom = findViewById(R.id.tv_from);
            tvTo = findViewById(R.id.tv_to);
            btnSearch = findViewById(R.id.btn_search);
            progressBar = findViewById(R.id.progress_bar);

            drawerLayout = findViewById(R.id.my_drawer_layout);
            navigationView = findViewById(R.id.navigation_view);
            actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);
            drawerLayout.addDrawerListener(actionBarDrawerToggle);
            actionBarDrawerToggle.syncState();
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(MenuItem menuItem) {
                    switch (menuItem.getItemId()) {

                        case R.id.nav_home: {
                            Intent i = new Intent(MainActivity.this, MainActivity.class);
                            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(i);
                            break;
                        }
                        case R.id.nav_save: {
                            Intent s = new Intent(MainActivity.this, StoredActivity.class);
                            startActivity(s);
                            break;
                        }
                    }
                    //close navigation drawer
                    drawerLayout.closeDrawer(GravityCompat.START);
                    return true;
                }
            });

        }}