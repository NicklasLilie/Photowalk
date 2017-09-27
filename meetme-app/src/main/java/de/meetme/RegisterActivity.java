package de.meetme;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class RegisterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etFirstname = (EditText) findViewById(R.id.etFirstname);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final EditText etConfirmPassword = (EditText) findViewById(R.id.etConfirmPassword);
        final EditText etLastname = (EditText) findViewById(R.id.etLastname);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final RadioButton rbModel = (RadioButton) findViewById(R.id.rbModel);
        final RadioButton rbPhotorapher = (RadioButton) findViewById(R.id.rbPhotographer);

        final Button button_register = (Button) findViewById(R.id.btn_register);
    }
}
