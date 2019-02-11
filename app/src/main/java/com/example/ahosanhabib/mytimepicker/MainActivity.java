package com.example.ahosanhabib.mytimepicker;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private TextView textView;
    private TimePickerDialog timePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textviewID);
        button = findViewById(R.id.buttonID);

        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        TimePicker timePicker = new TimePicker(this);
        final int currenthour = timePicker.getCurrentHour();
        final int currentminute = timePicker.getCurrentMinute();

        timePickerDialog = new TimePickerDialog(MainActivity.this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                        textView.setText(hourOfDay+":"+minute);
                    }
                },currenthour,currentminute,false);
        timePickerDialog.show();

        };
    }
