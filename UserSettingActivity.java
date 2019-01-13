package com.example.deepa.preferenceactivity;;

import android.os.Bundle;
import android.preference.PreferenceActivity;


public class UserSettingActivity extends PreferenceActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // add the xml resource
        addPreferencesFromResource(R.xml.user_settings);


    }

}
