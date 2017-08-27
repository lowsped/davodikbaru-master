package xyz.soalatihan.dapodik;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import static xyz.soalatihan.dapodik.R.id.button001;
import static xyz.soalatihan.dapodik.R.id.button005;

public class pkb extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pkb);

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        Button button001 = (Button) findViewById(R.id.button001);
        Button button002 = (Button) findViewById(R.id.button002);
        Button button003 = (Button) findViewById(R.id.button003);
        Button button004 = (Button) findViewById(R.id.button004);
        Button button005 = (Button) findViewById(R.id.button005);


        button001.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), pkbprofil.class);
                startActivity(i);
            }
        });
        button002.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), pkbnilai.class);
                startActivity(i);
            }
        });
        button003.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), pkbhasil.class);
                startActivity(i);
            }
        });
        button004.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), pkblatihan.class);
                startActivity(i);
            }
        });
        button005.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), pkbhome.class);
                startActivity(i);
            }
        });

    }
}

