package com.mobileappscompany.training.gitrepo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mixpanel.android.mpmetrics.MixpanelAPI;

public class MainActivity extends AppCompatActivity {

    String projectToken = "a36aaa945acefaf95a53219761ece7da";
    MixpanelAPI mixpanel = MixpanelAPI.getInstance(this, projectToken);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
