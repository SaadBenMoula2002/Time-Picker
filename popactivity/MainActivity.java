package ma.projet.android.popactivity;


import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.app.FragmentManager fm = getFragmentManager();
        PopActivity popActivity = new PopActivity();
        popActivity.show(fm, "Show fragment");
    }

    public void SetDate(String data) {
        TextView textView = findViewById(R.id.textView);
        textView.setText(data);
    }


}
