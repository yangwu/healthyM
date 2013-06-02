
package com.yw.health;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Spinner paceLength, sensitivity;

    private TextView start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paceLength = (Spinner) findViewById(R.id.paceLengthValue);
        sensitivity = (Spinner) findViewById(R.id.sensitivityValue);

        paceLength.setAdapter(ArrayAdapter.createFromResource(this, R.array.pace_length, android.R.layout.simple_spinner_item));
        sensitivity.setAdapter(ArrayAdapter.createFromResource(this, R.array.sensitivity_value, android.R.layout.simple_spinner_item));

        start = (TextView) findViewById(R.id.start);
        start.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

        });
    }

}
