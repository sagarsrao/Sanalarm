package com.example.sumit.sanalarm;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends Activity  implements View.OnClickListener {

    private PendingIntent pintent;
    Context context;
    Ringtone ringtone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = (Button) findViewById(R.id.start);
        Button end = (Button) findViewById(R.id.end);
        start.setOnClickListener(this);
        end.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.start:
               /* startService(new Intent(this, MyService.class));
                Calendar cal = Calendar.getInstance();*/
                /*Intent intent = new Intent(this, MyService.class);
                PendingIntent pintent = PendingIntent
                        .getService(this, 0, intent, 0);



 */

                /*Intent myIntent = new Intent(MainActivity.this,
                        MyService.class);

                pintent = PendingIntent.getService(MainActivity.this,
                        0, myIntent, 0);

                AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

                Calendar calendar = Calendar.getInstance();*/

                /*Intent intent = new Intent(MainActivity.this, MyService.class);
                 pintent = PendingIntent.getService(MainActivity.this, 0, intent, 0);*/
                /*AlarmManager alarm = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
                Calendar calendar = Calendar.getInstance();
                alarm.setRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), 30*1000, pintent);*/
               /* Uri uri = RingtoneManager.getActualDefaultRingtoneUri(getApplicationContext(),RingtoneManager.TYPE_ALARM);
                Ringtone ringtone = RingtoneManager.getRingtone(getApplicationContext(), uri);
                ringtone.play();*/

               /* Intent startIntent = new Intent(getApplicationContext(), MyService.class);
                Intent ringtoneServiceStartIntent=null;
                boolean ringtoneUri;
                ringtoneServiceStartIntent.putExtra("ringtone-uri", ringtoneUri);
                getApplicationContext().startService(startIntent);*/
                /*Intent i1=new Intent(context,MyService.class);
                context.startService(i1);*/

                /*Intent startIntent = new Intent(context, MyService.class);
                Intent ringtoneServiceStartIntent=null;
                Uri ringtoneUri=null;
                ringtoneServiceStartIntent.putExtra("ringtone-uri", ringtoneUri);
                context.startService(startIntent);*/


                Uri uri = RingtoneManager.getActualDefaultRingtoneUri(getApplicationContext(),RingtoneManager.TYPE_ALARM);
                ringtone = RingtoneManager.getRingtone(getApplicationContext(), uri);
                ringtone.play();
                break;
            case R.id.end:

                ringtone.stop();
               //stopService(new Intent(getBaseContext(), MyService.class));
          /* AlarmManager     alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

                alarmManager.cancel(pintent);*/



                // Tell the user about what we did.

               // ringtone = RingtoneManager.getRingtone(getActivity());
               /* Intent stopIntent = new Intent(context, MyService.class);
                context.stopService(stopIntent);*/
                Toast.makeText(MainActivity.this, "Cancel!",
                        Toast.LENGTH_LONG).show();

                break;
            default:
                break;
        }



    }
}
