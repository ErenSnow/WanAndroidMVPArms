package com.eren.wanandroidmvparms;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent appComponent = ArmsUtils.obtainAppComponentFromContext(this);
    }
}
