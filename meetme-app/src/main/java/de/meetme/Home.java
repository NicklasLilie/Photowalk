package de.meetme;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

//import de.meetme.app.R;

public class Home extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final Button btnCreateWalk = (Button) findViewById(R.id.btnCreateWalk);

        final Button btnJoinWalk = (Button) findViewById(R.id.btnJoinWalk);

        btnCreateWalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(Home.this, CreateWalk.class);
                Home.this.startActivity(homeIntent);
            }
        });

        btnJoinWalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent homeIntent = new Intent(Home.this, JoinWalk.class);
                Home.this.startActivity(homeIntent);
            }
        });
    }


}
