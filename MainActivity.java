package com.syahri.negaradanmatauang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.ListView);
        String [] negaradanmatauang = {
                "Indonesia   =  Rupiah",
                "Malaysia   =   Ringgit",
                "Singapore   =  Dollar Singapore",
                "Thailand   =   Baht",
                "Japan   =   Yen",
                "Korea   =   Won"};
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, negaradanmatauang);
        list.setAdapter(myAdapter);
    }
}