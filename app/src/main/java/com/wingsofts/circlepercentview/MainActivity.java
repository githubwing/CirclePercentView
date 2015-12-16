package com.wingsofts.circlepercentview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mButton;
    private CirclePercentView mCirclePercentView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCirclePercentView = (CirclePercentView) findViewById(R.id.circleView);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = (int)(Math.random()*100);
                mCirclePercentView.setPercent(n);
            }
        });
    }
}
