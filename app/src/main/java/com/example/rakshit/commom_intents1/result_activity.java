package com.example.rakshit.commom_intents1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.rakshit.common_intents1.R;

public class result_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);

        Bundle extras = getIntent().getExtras();
        String input = extras.getString("editText");
        TextView view1 = (TextView)findViewById(R.id.editText3);
        view1.setText(input);


    }

}
