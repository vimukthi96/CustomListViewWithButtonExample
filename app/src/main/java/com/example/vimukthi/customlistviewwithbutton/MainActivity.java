package com.example.vimukthi.customlistviewwithbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
   // CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String>listItems= new ArrayList<String>();

        listItems.add("abcd");
        listItems.add("1234");
        listItems.add("sxd");
        listItems.add("rrftyg");

        listView=(ListView)findViewById(R.id.lstView);
        ArrayAdapter<String>customAdapter =new ArrayAdapter<String>(MainActivity.this,R.layout.custom,listItems);
        listView.setAdapter(customAdapter);

    }
}
