package com.example.expensetracker;


import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class monthly_expense extends Activity {

    CalendarView calender;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monthly_expense);

        calender = (CalendarView)findViewById(R.id.calendarView);
        textview = (TextView)findViewById(R.id.textView);

        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {

                textview.setText("Date is : " + dayOfMonth +" / " + (month+1) + " / " + year);

            }
        });
    }
}
