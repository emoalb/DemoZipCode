package com.example.zorak.demozipcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     final CheckZip mZip = new CheckZip();
        final EditText mEditText;
        Button mButton;
        final TextView mText, mText1;

        mButton = (Button)findViewById(R.id.button);
        mEditText = (EditText)findViewById(R.id.zipInputZip);
        mText = (TextView)findViewById(R.id.textView);
        mText1= (TextView)findViewById(R.id.textView2);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String Text = mEditText.getText().toString();
               if ( mZip.CheckCode(Text)==true) {
                   mText1 .setText(Text);
                   mText.setText("Valid zip code");
                   Toast.makeText(MainActivity.this,"Valid ZIP Code!",Toast.LENGTH_SHORT).show();

               }else
               {
                   mText.setText("NOT a valid zip code");
                   Toast.makeText(MainActivity.this,"Not a valid ZIP Code try again!",Toast.LENGTH_SHORT).show();
               }


               };


        };
        mButton.setOnClickListener(listener);

    }
}
