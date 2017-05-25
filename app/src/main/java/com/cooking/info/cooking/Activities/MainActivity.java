package com.cooking.info.cooking.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.cooking.info.cooking.Fragment.Dessert;
import com.cooking.info.cooking.Fragment.MainCourse;
import com.cooking.info.cooking.Fragment.Starters;
import com.cooking.info.cooking.R;
import com.cooking.info.cooking.Util.Utility;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private BottomNavigationView bottomNavigation;
    private FloatingActionButton floatingActionButton;
    private Fragment fragment;
    private FragmentManager fragmentManager;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            fragmentManager.popBackStack(null,FragmentManager.POP_BACK_STACK_INCLUSIVE);
            final FragmentTransaction transaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_starters:
                    fragment = new Starters();
                    transaction.replace(R.id.main_container, fragment).addToBackStack(null).commit();
                    return true;
                case R.id.navigation_main_course:
                    fragment = new MainCourse();
                    transaction.replace(R.id.main_container, fragment).addToBackStack(null).commit();
                    return true;
                case R.id.navigation_dessert:
                    fragment = new Dessert();
                    transaction.replace(R.id.main_container, fragment).addToBackStack(null).commit();
                    return true;
            }
             return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, Login.class);
                MainActivity.this.startActivity(myIntent);
            }
        });
        bottomNavigation.inflateMenu(R.menu.navigation);
        fragmentManager = getSupportFragmentManager();
        //mTextMessage = (TextView) findViewById(R.id.message);
        bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        bottomNavigation.setSelectedItemId(R.id.navigation_main_course);

        if(! Utility.isConnectingToInternet(this)){
            Toast.makeText(this,"Please check network connection!",Toast.LENGTH_LONG).show();
        }
    }

}
