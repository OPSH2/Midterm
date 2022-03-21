package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView lvsp;
    ArrayList<XeDap> arrxedap;
    XeDapAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        AnhXa();
        adapter = new XeDapAdapter(this, R.layout.layoutsanpham, arrxedap);
        lvsp.setAdapter(adapter);
    }

    private void AnhXa() {
        lvsp = (ListView) findViewById(R.id.listviewsanpham);
        arrxedap = new ArrayList<>();
        arrxedap.add(new XeDap("Red Bull One", "$ 350", "$ 449", R.drawable.redbullone));
        arrxedap.add(new XeDap("Blue One", "$ 840", "$ 950", R.drawable.bifour__removebg_preview));
    }
}