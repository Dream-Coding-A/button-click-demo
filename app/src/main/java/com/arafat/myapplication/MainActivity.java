package com.arafat.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//adding listner to button 2nd way...(implements View.OnclickListener)
public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {

    private Button login_button,logout_button;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login_button = findViewById(R.id.login_btn_ID);
        logout_button = findViewById(R.id.logout_btn_ID);
        textView1 = findViewById(R.id.text_ID);

        /*Adding listner 2nd way....

        login_button.setOnClickListener(this);
        logout_button.setOnClickListener(this);*/

        //adding listner to button 3rd way...

        Handler handler = new Handler();

        login_button.setOnClickListener(handler);
        logout_button.setOnClickListener(handler);


    }

    /*@Override
    public void onClick(View v) {
        if(v.getId()==R.id.login_btn_ID){
            textView1.setText("Login button is clicked !");
        }
        else {
            textView1.setText("Logout button is clicked !");
        }
    }*/

    //Adding listner into buttton 3rd way...

    class Handler implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if (v.getId()==R.id.login_btn_ID){
                textView1.setText("Login button is clicked !");
            }else {
                textView1.setText("Logout button is clicked !");
            }
        }
    }
}
