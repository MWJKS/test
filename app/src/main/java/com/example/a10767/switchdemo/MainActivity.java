package com.example.a10767.switchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Switch mSwitch;
    private Switch mSwitch2;
    private Switch mSwitch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSwitch = findViewById(R.id.switch_btn);
        mSwitch2 = findViewById(R.id.switch_btn2);
        mSwitch3 = findViewById(R.id.switch_btn3);
        mSwitch2.setChecked(true);
        mSwitch3.setEnabled(false);
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(MainActivity.this, "按钮已打开", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "按钮已关闭", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
