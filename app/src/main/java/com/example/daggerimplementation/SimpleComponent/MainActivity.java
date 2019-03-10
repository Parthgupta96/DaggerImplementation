package com.example.daggerimplementation.SimpleComponent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.daggerimplementation.BaseActivity;
import com.example.daggerimplementation.R;
import com.example.daggerimplementation.SimpleComponent.di.AComponent;
import com.example.daggerimplementation.SimpleComponent.di.DaggerAComponent;
import com.example.daggerimplementation.daggerSubComponent.SubComponentActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    //this line creates MembersInjector class for this class
    @Inject
    A injectedA;

    @Inject
    A injectedA2;

    @Inject
    B injectedB;//if two objects of same type are injected then they have same value but are different

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    startActivity(new Intent(MainActivity.this, Main2Activity.class));
                    showToast(injectedA.name);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    showToast(injectedB.name);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    startActivity(new Intent(MainActivity.this, SubComponentActivity.class));
                    showToast(injectedA2.name);
                    return true;
            }
            return false;
        }
    };

    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setDagger();
        setContentView(R.layout.activity_main);

        mTextMessage = findViewById(R.id.message);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private void setDagger() {
//        .aModule(new AModule()) can remove this line
//        as builder implementation creates a new instance of module if null only if it has empty constructor
        AComponent component = DaggerAComponent.builder()
                .build();


        component.inject(this);
//        injectedA = component.getA();
    }

}
