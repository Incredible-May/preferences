package com.example.xiaomei.preferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.preference.PreferenceFragment;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager mFragmentManager = getFragmentManager();

        FragmentTransaction mFragmentTransaction = mFragmentManager

                .beginTransaction();

        PrefsFragment mPrefsFragment = new PrefsFragment();

        mFragmentTransaction.replace(android.R.id.content, mPrefsFragment);

        mFragmentTransaction.commit();
    }
    public static class PrefsFragment extends PreferenceFragment {



        @Override

        public void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);



            // Load the preferences from an XML resource

            addPreferencesFromResource(R.xml.preferences);

        }

    }
}
