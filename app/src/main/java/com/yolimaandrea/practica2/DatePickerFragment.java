package com.yolimaandrea.practica2;

import android.annotation.TargetApi;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.DatePicker;

/**
 * Created by YolimaAndrea on 19/09/2016.
 */
public class DatePickerFragment extends android.app.DialogFragment
        implements DatePickerDialog.OnDateSetListener {

    @TargetApi(Build.VERSION_CODES.N)
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);

        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }

    public void onDateSet(DatePicker view, int year, int month, int day) {
        String fechaNac = String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year);
        Log log;
        log.d("Date",fechaNac);

    }
}