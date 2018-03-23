package com.ethings.ble.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ethings.ble.R;


public class MainActivity extends Activity {

    Button find, add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        overridePendingTransition(R.anim.left_to_right, R.anim.right_to_left);
    }
    public void initView(){
        find = findViewById(R.id.btn_find_tag);

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ListTagActivity.class);
                startActivity(i);
            }
        });
    }

}
