package com.jagdish.psidemo.utility;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;

public class Utility {

    private static final String TAG = Utility.class.getName();

    public static String getDateTime() {
        String datetime = "";

        try {
            Date date = Calendar.getInstance().getTime();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = df.format(date);

            SimpleDateFormat tf = new SimpleDateFormat("hh:mm:ss");
            String formattedTime = tf.format(date);
            datetime = formattedDate + "T" + formattedTime;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Log.d(TAG, "jk current date time: " + datetime);
        return datetime;
    }

    public static String getDate() {
        String formattedDate = "";
        try {
            Date date = Calendar.getInstance().getTime();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            formattedDate = df.format(date);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Log.d(TAG, "jk current date: " + formattedDate);

        return formattedDate;
    }

}
