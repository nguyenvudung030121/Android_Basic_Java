package com.example.bacsic_homepage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;


public class homepage_Activity extends AppCompatActivity {
    ImageButton btn_info_student;
    ImageButton btn_notification;
    ImageButton btn_chatbox;
    void getView() {
        btn_info_student = findViewById(R.id.img_button_student);
        btn_chatbox = findViewById(R.id.img_button_chatbox);
        btn_notification= findViewById(R.id.img_button_notification);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_homepage);
        getView();
        btn_info_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage_Activity.this,student_information.class);
                startActivity(intent);
            }
        });

        btn_chatbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage_Activity.this,chatbox_Activity.class);
                startActivity(intent);
            }
        });

        btn_notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(homepage_Activity.this,notification_Activity.class);
                startActivity(intent);
            }
        });

    }

    public void onBackPressed() {
        Intent startMain = new Intent(Intent.ACTION_MAIN);
        startMain.addCategory(Intent.CATEGORY_HOME);
        startMain.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(startMain);
    }

}