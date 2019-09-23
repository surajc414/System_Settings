package com.trihutt.systemsettings;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.SettingInjectorService;
import android.os.Bundle;
import android.os.Handler;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Boolean ch2press=false;
    Button about;
    Button app_setting;
    Button open_setting,open_wifi,accessibility,add_account,airplane_mode,Appn,App_details,Data_uses,Security_setting,bluetooth_setting,Network_operator,Finger_enrol,date_setting,Disp_setting,Battery_saver;
    Button captioning_setting,cast_setting,notification_setting,external_storage_setting;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        about = findViewById(R.id.about_developer);
        open_setting = findViewById(R.id.open_setting);
        open_wifi = findViewById(R.id.open_wifi);
        accessibility = findViewById(R.id.accessibility_setting);
        add_account = findViewById(R.id.add_Account);
        airplane_mode = findViewById(R.id.airplane_mode);
        Appn=findViewById(R.id.apn_setting);
        App_details=findViewById(R.id.app_details);
        Data_uses=findViewById(R.id.data_uses);
        Security_setting=findViewById(R.id.security_setting);
        bluetooth_setting=findViewById(R.id.bluetooth_setting);
        Network_operator=findViewById(R.id.network_operator);
        Finger_enrol=findViewById(R.id.finger_enrol);
        date_setting=findViewById(R.id.date_settings);
        Disp_setting=findViewById(R.id.disp_settings);
        Battery_saver=findViewById(R.id.batery_settings);
        captioning_setting = findViewById(R.id.captioning_setting);
        cast_setting = findViewById(R.id.cast_setting);
        notification_setting = findViewById(R.id.notification_setting);
        external_storage_setting = findViewById(R.id.external_storage_setting);
        app_setting = findViewById(R.id.app_setting);

        open_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Settings.ACTION_SETTINGS);
                startActivity(intent);
            }
        });


        open_wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);

                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }
            }
        });

        accessibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS);

                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }
            }
        });

        add_account.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Settings.ACTION_ADD_ACCOUNT);

                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }
            }
        });

        airplane_mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS);

                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }
            }
        });
        Appn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Settings.ACTION_APN_SETTINGS);

                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }
            }
        });

        App_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }


            }
        });

        Data_uses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Settings.ACTION_DATA_USAGE_SETTINGS);
                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }

            }
        });
        Security_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Settings.ACTION_SECURITY_SETTINGS);
                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }
            }
        });

        bluetooth_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }
            }
        });
        Network_operator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Settings.ACTION_NETWORK_OPERATOR_SETTINGS);
                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }
            }
        });

        Finger_enrol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Settings.ACTION_FINGERPRINT_ENROLL);
                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }
            }
        });

        date_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Settings.ACTION_DATE_SETTINGS);
                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }

            }
        });


        Disp_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Settings.ACTION_DISPLAY_SETTINGS);
                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }

            }
        });
        Battery_saver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Settings.ACTION_BATTERY_SAVER_SETTINGS);
                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone", Toast.LENGTH_LONG).show();
                }


            }
        });


        captioning_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Settings.ACTION_CAPTIONING_SETTINGS);
                if(intent.resolveActivity(getPackageManager())!=null)
                    startActivity(intent);
                else
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone",Toast.LENGTH_SHORT).show();
            }
        });

        cast_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Settings.ACTION_CAST_SETTINGS);
                if(intent.resolveActivity(getPackageManager())!=null)
                    startActivity(intent);
                else
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone",Toast.LENGTH_SHORT).show();
            }
        });


        notification_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.ACTION_INTERNAL_STORAGE_SETTINGS);
                if(intent.resolveActivity(getPackageManager())!=null)
                    startActivity(intent);
                else
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone",Toast.LENGTH_SHORT).show();
            }
        });

        app_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS);
                if(intent.resolveActivity(getPackageManager())!=null)
                    startActivity(intent);
                else
                    Toast.makeText(getApplicationContext(),"This setting is not available in your phone",Toast.LENGTH_SHORT).show();
            }
        });
        external_storage_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Settings.ACTION_DEVICE_INFO_SETTINGS);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



            }

        });

    }

    @Override
    public void onBackPressed()
    {
        if(ch2press)
        {
            System.exit(1);
            Log.i("OnBAck Press","Works");
        }
        ch2press = true;

        Toast.makeText(getApplicationContext(),"Press back again to exit",Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                ch2press=false;

            }
        },2000);
    }
}
