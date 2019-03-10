package com.example.daggerimplementation.daggerSubComponent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.daggerimplementation.R;
import com.example.daggerimplementation.daggerSubComponent.di.DaggerParentComponent;
import com.example.daggerimplementation.daggerSubComponent.di.ParentComponent;

import javax.inject.Inject;

public class SubComponentActivity extends AppCompatActivity {

    @Inject
    IndividualDependency individualDependency;

    @Inject
    IndividualDependency2 individualDependency2;

    @Inject
    Navigator navigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUpDagger();
        setContentView(R.layout.activity_sub_component);
        TextView tv1 = findViewById(R.id.tv);
        tv1.setText(individualDependency.getName());
        TextView tv2 = findViewById(R.id.tv2);
        tv2.setText(individualDependency2.getName());
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigator.showToast(individualDependency2.getName());
            }
        });

        Toast.makeText(this,
                individualDependency.getPld() == individualDependency2.getPld() ? "Equal parent" : "not equal parent",
                Toast.LENGTH_SHORT).show();
        if (individualDependency.getPld() == individualDependency2.getPld()) {

        }
    }

    private void setUpDagger() {
        ParentComponent parentComponent = DaggerParentComponent.builder().context(this).build();
        parentComponent.getSubComponent().build().inject(this);

    }
}
