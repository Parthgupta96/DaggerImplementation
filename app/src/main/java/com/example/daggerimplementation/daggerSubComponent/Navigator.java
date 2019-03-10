package com.example.daggerimplementation.daggerSubComponent;

import android.content.Context;
import android.widget.Toast;

public class Navigator {
    private Context context;

    public Navigator(Context context) {
        this.context = context;
    }

    public void showToast(String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
