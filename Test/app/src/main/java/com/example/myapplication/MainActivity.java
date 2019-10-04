package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextClock;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    private TextView tView1;
    private TextView tView2;
    private TextView tView3;
    private TextView tView4;
    private TextView tView5;



    private Button twelveHourTime;
    private Button twentyFourHourTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView1 = (TextView) findViewById(R.id.textview1);
        tView2 = (TextView) findViewById(R.id.textview2);
        tView3 = (TextView) findViewById(R.id.textview3);
        tView4 = (TextView) findViewById(R.id.textview4);
        tView5 = (TextView) findViewById(R.id.textview5);

        //setup for buttons
        twelveHourTime = (Button)findViewById(R.id.button1);
        twentyFourHourTime = (Button)findViewById(R.id.button2);

        TextView twentyFourHrTime = (TextView) findViewById(R.id.textview);
        twentyFourHrTime.setVisibility(View.GONE);

        TextView twelveHrTime = (TextView) findViewById(R.id.textview0);
        twelveHrTime.setVisibility(View.VISIBLE);



        DateFormat dateFormat = new SimpleDateFormat("hh:mm a");

        //timezone setup
        TimeZone sydney = TimeZone.getTimeZone("Australia/Sydney");
        TextView sydneyTime = findViewById(R.id.textview1);
        Calendar sydneyCalendar = Calendar.getInstance(sydney);
        dateFormat.setCalendar(sydneyCalendar);
        dateFormat.setTimeZone(sydney);
        String stringTimeInSydney = dateFormat.format(sydneyCalendar.getTime());
        sydneyTime.setText(stringTimeInSydney);

        TimeZone losAngeles = TimeZone.getTimeZone("America/New York");
        TextView laTime = findViewById(R.id.textview2);
        Calendar laCalendar = Calendar.getInstance(losAngeles);
        dateFormat.setCalendar(laCalendar);
        dateFormat.setTimeZone(losAngeles);
        String stringTimeInLa = dateFormat.format(laCalendar.getTime());
        laTime.setText(stringTimeInLa);

        TimeZone london = TimeZone.getTimeZone("Europe/Berlin");
        TextView londonTime = findViewById(R.id.textview3);
        Calendar londonCalendar = Calendar.getInstance(london);
        dateFormat.setCalendar(londonCalendar);
        dateFormat.setTimeZone(london);
        String stringTimeInLondon = dateFormat.format(londonCalendar.getTime());
        londonTime.setText(stringTimeInLondon);

        TimeZone tokyo = TimeZone.getTimeZone("Asia/Seoul");
        TextView timeTokyo = findViewById(R.id.textview4);
        Calendar tokyoCalendar = Calendar.getInstance(tokyo);
        dateFormat.setCalendar(tokyoCalendar);
        dateFormat.setTimeZone(tokyo);
        String stringTimeInTokyo = dateFormat.format(tokyoCalendar.getTime());
        timeTokyo.setText(stringTimeInTokyo);

        TimeZone SF = TimeZone.getTimeZone("America/San Francisco");
        TextView timeSF = findViewById(R.id.textview5);
        Calendar SFCalendar = Calendar.getInstance(SF);
        dateFormat.setCalendar(SFCalendar);
        dateFormat.setTimeZone(SF);
        String stringTimeInSF = dateFormat.format(SFCalendar.getTime());
        timeSF.setText(stringTimeInSF);




        twelveHourTime.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                DateFormat dateFormat = new SimpleDateFormat("hh:mm a");

                TextView tFHT = (TextView) findViewById(R.id.textview);
                tFHT.setVisibility(View.GONE);

                TextView tHT = (TextView) findViewById(R.id.textview0);
                tHT.setVisibility(View.VISIBLE);

                TimeZone sydney = TimeZone.getTimeZone("Australia/Sydney");
                TextView sydneyTime = findViewById(R.id.textview1);
                Calendar sydneyCalendar = Calendar.getInstance(sydney);
                dateFormat.setCalendar(sydneyCalendar);
                dateFormat.setTimeZone(sydney);
                String stringTimeInSydney = dateFormat.format(sydneyCalendar.getTime());
                sydneyTime.setText(stringTimeInSydney);

                TimeZone NY = TimeZone.getTimeZone("America/New York");
                TextView NYTime = findViewById(R.id.textview2);
                Calendar NYCalendar = Calendar.getInstance(NY);
                dateFormat.setCalendar(NYCalendar);
                dateFormat.setTimeZone(NY);
                String stringTimeInNY = dateFormat.format(NYCalendar.getTime());
                NYTime.setText(stringTimeInNY);

                TimeZone berlin = TimeZone.getTimeZone("Europe/Berlin");
                TextView berlinTime = findViewById(R.id.textview3);
                Calendar berlinCalendar = Calendar.getInstance(berlin);
                dateFormat.setCalendar(berlinCalendar);
                dateFormat.setTimeZone(berlin);
                String stringTimeInBerlin = dateFormat.format(berlinCalendar.getTime());
                berlinTime.setText(stringTimeInBerlin);

                TimeZone seoul = TimeZone.getTimeZone("Asia/Seoul");
                TextView timeSeoul = findViewById(R.id.textview4);
                Calendar seoulCalendar = Calendar.getInstance(seoul);
                dateFormat.setCalendar(seoulCalendar);
                dateFormat.setTimeZone(seoul);
                String stringTimeInSeoul = dateFormat.format(seoulCalendar.getTime());
                timeSeoul.setText(stringTimeInSeoul);

                TimeZone SF = TimeZone.getTimeZone("America/San Francisco");
                TextView timeSF = findViewById(R.id.textview5);
                Calendar SFCalendar = Calendar.getInstance(SF);
                dateFormat.setCalendar(SFCalendar);
                dateFormat.setTimeZone(SF);
                String stringTimeInSF = dateFormat.format(SFCalendar.getTime());
                timeSF.setText(stringTimeInSF);
            }
        });

        twentyFourHourTime.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                DateFormat dateFormat = new SimpleDateFormat("HH:mm");

                TextView twentyFourHrTime = (TextView) findViewById(R.id.textview);
                twentyFourHrTime.setVisibility(View.VISIBLE);

                TextView twelveHrTime = (TextView) findViewById(R.id.textview0);
                twelveHrTime.setVisibility(View.GONE);

                TimeZone sydney = TimeZone.getTimeZone("Australia/Sydney");
                TextView sydneyTime = findViewById(R.id.textview1);
                Calendar sydneyCalendar = Calendar.getInstance(sydney);
                dateFormat.setCalendar(sydneyCalendar);
                dateFormat.setTimeZone(sydney);
                String stringTimeInSydney = dateFormat.format(sydneyCalendar.getTime());
                sydneyTime.setText(stringTimeInSydney);

                TimeZone NY = TimeZone.getTimeZone("America/New York");
                TextView NYTime = findViewById(R.id.textview2);
                Calendar NYCalendar = Calendar.getInstance(NY);
                dateFormat.setCalendar(NYCalendar);
                dateFormat.setTimeZone(NY);
                String stringTimeInNY = dateFormat.format(NYCalendar.getTime());
                NYTime.setText(stringTimeInNY);

                TimeZone berlin = TimeZone.getTimeZone("Europe/Berlin");
                TextView berlinTime = findViewById(R.id.textview3);
                Calendar berlinCalendar = Calendar.getInstance(berlin);
                dateFormat.setCalendar(berlinCalendar);
                dateFormat.setTimeZone(berlin);
                String stringTimeInBerlin = dateFormat.format(berlinCalendar.getTime());
                berlinTime.setText(stringTimeInBerlin);

                TimeZone seoul = TimeZone.getTimeZone("Asia/Seoul");
                TextView timeSeoul = findViewById(R.id.textview4);
                Calendar seoulCalendar = Calendar.getInstance(seoul);
                dateFormat.setCalendar(seoulCalendar);
                dateFormat.setTimeZone(seoul);
                String stringTimeInSeoul = dateFormat.format(seoulCalendar.getTime());
                timeSeoul.setText(stringTimeInSeoul);

                TimeZone SF = TimeZone.getTimeZone("America/San Francisco");
                TextView timeSF = findViewById(R.id.textview5);
                Calendar SFCalendar = Calendar.getInstance(SF);
                dateFormat.setCalendar(SFCalendar);
                dateFormat.setTimeZone(SF);
                String stringTimeInSF = dateFormat.format(SFCalendar.getTime());
                timeSF.setText(stringTimeInSF);
            }
        });
    }
}