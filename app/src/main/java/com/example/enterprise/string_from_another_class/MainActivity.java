package com.example.enterprise.string_from_another_class;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView quantityTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView quantityTextView = (TextView) findViewById(R.id.editText2);
        TextView label = (TextView) findViewById(R.id.textView);

        // String from Gateway class to Toast output
        Gateway MyGateway = new Gateway();
        Toast.makeText(getApplicationContext(), MyGateway.getKnowledge(), Toast.LENGTH_LONG).show();

        // String to Edittext box
        quantityTextView.setText("" + MyGateway.getKnowledge());

        // String to Textview label
        label.setText(MyGateway.getKnowledge());
    }
}
