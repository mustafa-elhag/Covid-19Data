package com.cst2335.covid_19data;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.cst2335.covid_19data.R;
import com.cst2335.covid_19data.DataAdapter;
import com.cst2335.covid_19data.DataHelper;
import com.cst2335.covid_19data.Data;

import java.util.List;



public class StoredActivity extends AppCompatActivity {



    DataHelper dataHelper;
    ListView listView;
    DataAdapter dataAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stored);

        dataHelper = new DataHelper(StoredActivity.this);

        listView = findViewById(R.id.list_view);
        List<Data> dataList =   dataHelper.getAllData();

        dataAdapter = new DataAdapter(StoredActivity.this, dataList, true);
        listView.setAdapter(dataAdapter);
    }

    }
