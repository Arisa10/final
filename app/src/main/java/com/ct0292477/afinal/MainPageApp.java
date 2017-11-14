package com.ct0292477.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainPageApp extends AppCompatActivity {

    // Email, password edittext
    EditText txtUsername, txtPassword;

    // login button
    Button btnLogin;

    // Alert Dialog Manager
    AlertDialogManager alert = new AlertDialogManager();

    // Session Manager Class
    SessionManager session;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page_app);

        // Session Manager
        session = new SessionManager(getApplicationContext());

        // logout
        Button btn_email_create_account = (Button) findViewById(R.id.btn_email_create_account);
        btn_email_create_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainPageApp.this, Register.class);
                startActivity(i);

            }
        });

        // logout
        TextView forgotpw = (TextView) findViewById(R.id.textView41);
        forgotpw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainPageApp.this, ForgotPassword.class);
                startActivity(i);

            }
        });


        // Email, Password input text
        txtUsername = (EditText) findViewById(R.id.ExNov);
        txtPassword = (EditText) findViewById(R.id.editTextpw);

        Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();

        // Login button
        btnLogin = (Button) findViewById(R.id.btnLogIn);

        // Login button click event
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // Get username, password from EditText
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                // Check if username, password is filled
                if (username.trim().length() > 0 && password.trim().length() > 0) {
                    // For testing puspose username, password is checked with sample data
                    // username = test
                    // password = test
                    if (username.equalsIgnoreCase("a") || username.equalsIgnoreCase("b") || username.equalsIgnoreCase("c") ||
                            username.equalsIgnoreCase("d") || username.equalsIgnoreCase("e") || username.equalsIgnoreCase("f") ||
                            username.equalsIgnoreCase("g") || username.equalsIgnoreCase("h") || username.equalsIgnoreCase("i") ||
                            username.equalsIgnoreCase("j") || username.equalsIgnoreCase("k") || username.equalsIgnoreCase("l") ||
                            username.equalsIgnoreCase("m") || username.equalsIgnoreCase("n") || username.equalsIgnoreCase("o") ||
                            username.equalsIgnoreCase("p") || username.equalsIgnoreCase("q") || username.equalsIgnoreCase("r") ||
                            username.equalsIgnoreCase("s") || username.equalsIgnoreCase("t") || username.equalsIgnoreCase("u") ||
                            username.equalsIgnoreCase("v") || username.equalsIgnoreCase("w") || username.equalsIgnoreCase("x") ||
                            username.equalsIgnoreCase("y") || username.equalsIgnoreCase("z")

                            && password.equalsIgnoreCase("1") || username.equalsIgnoreCase("2") || username.equalsIgnoreCase("3") ||
                            password.equalsIgnoreCase("4") || username.equalsIgnoreCase("5") || username.equalsIgnoreCase("6") ||
                            password.equalsIgnoreCase("7") || username.equalsIgnoreCase("8") || username.equalsIgnoreCase("9") ||
                            password.equalsIgnoreCase("0")) {

                        // Creating user login session
                        // For testing i am stroing name, email as follow
                        // Use user real data
                        session.createLoginSession("", "Good day");

                        // Staring Swipe
                        Intent i = new Intent(getApplicationContext(), DailyUsage.class);
                        startActivity(i);
                        finish();

                    } else {
                        // username / password doesn't match
                        alert.showAlertDialog(MainPageApp.this, "Login failed..", "Username/Password is incorrect", false);
                    }
                } else {
                    // user didn't entered username or password
                    // Show alert asking him to enter the details
                    alert.showAlertDialog(MainPageApp.this, "Login failed..", "Please enter username and password", false);
                }

            }
        });
    }

}