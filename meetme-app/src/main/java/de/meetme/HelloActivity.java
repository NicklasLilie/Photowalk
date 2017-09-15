package de.meetme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class HelloActivity extends Activity {

    private static final String TAG = "HelloActivity";
    private static final String HOSTNAME = "<here your IP or hostname>";
    private static final int PORT = 8087;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_layout);
        Log.e(TAG, "run client");
/*
        RestClient httpclient = new RestClient("http://" + HOSTNAME + ":" + PORT);
        try {
            Person p = httpclient.getApiService().getPerson(1);
            Log.e(TAG, p.toString());

        } catch (Exception e) {
            Log.e(TAG, "Error: " + e);
            e.printStackTrace();
        }
    */
        final Button loginLink = (Button) findViewById(R.id.button_loginlink);
        //links button on welcome page to login page
        loginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(HelloActivity.this, loginpage.class);
                HelloActivity.this.startActivity(loginIntent);
            }
        });

        final Button registerLink2 = (Button) findViewById(R.id.button_registerlink);
        //links button on welcome page to registration page
        registerLink2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent2 = new Intent(HelloActivity.this, RegisterActivity.class);
                HelloActivity.this.startActivity(registerIntent2);
            }
        });
    }

   /* @Override
    public void onStart() {
        super.onStart();
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText("Hello world!");
    }*/

}
