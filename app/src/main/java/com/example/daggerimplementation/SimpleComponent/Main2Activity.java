package com.example.daggerimplementation.SimpleComponent;

import android.os.Bundle;
import android.widget.TextView;

import com.example.daggerimplementation.BaseActivity;
import com.example.daggerimplementation.R;
import com.example.daggerimplementation.SimpleComponent.di.AComponent;
import com.example.daggerimplementation.SimpleComponent.di.DaggerAComponent;

import javax.inject.Inject;

public class Main2Activity extends BaseActivity {

    @Inject
    A injectedA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setDagger();

        TextView tv = findViewById(R.id.tv);
        tv.setText(injectedA.name);
    }

    private void setDagger() {
        AComponent component = DaggerAComponent.builder()
                .build();
        component.inject(this);
    }
}
