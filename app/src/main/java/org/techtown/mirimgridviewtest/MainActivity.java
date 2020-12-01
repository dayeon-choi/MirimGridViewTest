package org.techtown.mirimgridviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("영화포스터 목록");
        GridView gridv=findViewById(R.id.gridv);
        GridAdapter adapter=new GridAdapter(this);
        gridv.setAdapter(adapter);
    }
}