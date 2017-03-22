package com.yzz.android.reflect;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @YzzAnnotation(id = R.id.button, click = true)
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        YzzAnn<MainActivity> yzzAnn = new YzzAnn<>();
        yzzAnn.bind(this);
        button.setText("yzz");
    }

    @Override
    public View findViewById(@IdRes int id) {
        return super.findViewById(id);
    }

    @Override
    public void finish() {
        super.finish();
    }


    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "click", Toast.LENGTH_LONG).show();
    }
}
