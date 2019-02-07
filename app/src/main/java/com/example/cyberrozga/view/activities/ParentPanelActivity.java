package com.example.cyberrozga.view.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cyberrozga.R;

public class ParentPanelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_panel);
        Button marks = (Button) findViewById(R.id.marksPreviewButton);
        Button send = (Button) findViewById(R.id.sendToTeacherButton);
        Button inbox = (Button) findViewById(R.id.inboxParentButton);

        marks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ParentPanelActivity.this, ChildrenPanelActivity.class));
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ParentPanelActivity.this, MailToTeacher.class));
            }
        });
        inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ParentPanelActivity.this, ParentInbox.class));
            }
        });

    }
}
