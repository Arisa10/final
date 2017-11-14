package com.ct0292477.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

public class Register extends AppCompatActivity {

    Button btnRegister, btnSignin;
    EditText ename, eemail, epass;
    private FirebaseAuth mAuth;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page_app);

        mAuth = FirebaseAuth.getInstance();

        ename = (EditText) findViewById(R.id.name);
        eemail = (EditText) findViewById(R.id.email);
        epass = (EditText) findViewById(R.id.password);
        btnRegister = (Button) findViewById(R.id.ButtonReg);

        if (mAuth.getCurrentUser() != null) {
            finish();
            startActivity(new Intent(getApplicationContext(), MainPageApp.class));
        }

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getemail = eemail.getText().toString().trim();
                String getpassword = epass.getText().toString().trim();
                callsignup(getemail,getpassword);

            }
        });


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String getemail = eemail.getText().toString().trim();
                String getpassword = epass.getText().toString().trim();
                callsignup(getemail,getpassword);

            }
        });
    }

    private void callsignup(String email, String password) {

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d("TESTING", "createUserWithEmail:onComplete:" + task.isSuccessful());

                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()){
                            Toast.makeText(Register.this, R.string.auth_failed,
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            userProfile();
                            Toast.makeText(Register.this, "Create Account", Toast.LENGTH_SHORT).show();
                            Log.d("TESTING", "Created Account");
                        }

                    }
                });
    }


    private void userProfile(){
        FirebaseUser user = mAuth.getCurrentUser();
        if(user!=null){
            UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
                    .setDisplayName(ename.getText().toString().trim())
                    .build();
            user.updateProfile(profileUpdates)
                    .addOnCompleteListener(new OnCompleteListener<Void>(){
                        @Override
                        public void onComplete(@NonNull Task<Void>task){
                            if(task.isSuccessful()){
                                Log.d("TESTING","User profile updated.");
                            }
                        }
                    });
        }
    }

    private void calllogin(String email, String password) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.d("TESTING", "signInWithEmail:onComplete:" + task.isSuccessful());

                        // If sign in fails, display a message to the user. If sign in succeeds
                        // the auth state listener will be notified and logic to handle the
                        // signed in user can be handled in the listener.
                        if (!task.isSuccessful()) {
                            Log.w("TESTING", "signInWithEmail:failed", task.getException());
                            Toast.makeText(Register.this, "Failed", Toast.LENGTH_SHORT).show();
                        }

                        else {
                            Intent i = new Intent(Register.this, DailyUsage.class);
                            finish();
                            startActivity(i);
                        }
                    }
                });
    }

}


