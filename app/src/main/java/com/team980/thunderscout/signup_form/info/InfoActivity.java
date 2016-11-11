package com.team980.thunderscout.signup_form.info;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.team980.thunderscout.signup_form.R;
import com.team980.thunderscout.signup_form.data.MentorData;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent launchIntent = getIntent();

        MentorData data = (MentorData) launchIntent.getSerializableExtra("com.team980.thunderscout.signup_form.INFO_STUDENT");

        setTitle(data.getName());

        setContentView(R.layout.activity_info);

        TextView studentEmail = (TextView) findViewById(R.id.info_studentEmail);
        studentEmail.setText(data.getEmail());

        TextView studentPhoneNumber = (TextView) findViewById(R.id.info_studentPhoneNumber);
        studentPhoneNumber.setText(data.getPhoneNumber());

        TextView studentGrade = (TextView) findViewById(R.id.info_studentCity);
        studentGrade.setText("" + data.getCity());

        TextView dataSource = (TextView) findViewById(R.id.info_dataSource);
        dataSource.setText(data.getDataSource());

        if (data.getDataSource() == MentorData.SOURCE_LOCAL_DEVICE) {
            dataSource.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        }
    }
}

