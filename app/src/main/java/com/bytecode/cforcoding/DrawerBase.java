package com.bytecode.cforcoding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class DrawerBase extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    private static  String SHARED_PREF_NAME="cforcoding";

    @Override
    public void setContentView(View view) {
        drawerLayout = (DrawerLayout) getLayoutInflater().inflate(R.layout.activity_drawer_base,null);
        FrameLayout container = drawerLayout.findViewById(R.id.activityContainer);
        container.addView(view);
        super.setContentView(drawerLayout);

        Toolbar toolbar = drawerLayout.findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavigationView navigationView = drawerLayout.findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawerLayout.closeDrawer(GravityCompat.START);
        switch (item.getItemId()) {
            case R.id.nav_dash:
                startActivity(new Intent(this, DashboardActivity.class));
                overridePendingTransition(0, 0);
                break;
/*
            case R.id.nav_compiler:
                startActivity(new Intent(this, UserProfileActivity.class));
                overridePendingTransition(0, 0);
                break;
*/
            case R.id.nav_quiz:
                startActivity(new Intent(this, QuizActivity.class));
                overridePendingTransition(0, 0);
                break;

            case R.id.nav_notes:
                startActivity(new Intent(this, NotesActivity.class));
                overridePendingTransition(0, 0);
                break;

            case R.id.nav_about:
                startActivity(new Intent(this, AboutActivity.class));
                overridePendingTransition(0, 0);
                break;

            case R.id.nav_share:
                try{
                    Intent shareIntent = new Intent();
                    shareIntent.setAction(Intent.ACTION_SEND);
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT,"C For Coding");
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "http://play.google.com/store/apps/details?="+getApplicationContext().getPackageName());
                    shareIntent.setType("text/plain");
                    startActivity(Intent.createChooser(shareIntent, "Share Via"));
                }catch (Exception e){
                    Toast.makeText(this,"Unable to Share this app",Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.nav_privacy:
                startActivity(new Intent(this,PrivacyPolicy.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_term_condition:
                startActivity(new Intent(this,TermsConditions.class));
                overridePendingTransition(0,0);
                break;
            case R.id.nav_logout:
                SharedPreferences preferences = getSharedPreferences("checkbox",MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("Remember","false");
                editor.clear();
                editor.apply();
                startActivity(new Intent(this,LoginActivity.class));
                overridePendingTransition(0,0);
                finish();
                break;
            /*case R.id.nav_hack_rank:
                try{
                    gotoUrl("https://www.hackerrank.com/21mca3210");
                }catch (Exception e){
                    Toast.makeText(this,"Unable to load the profile",Toast.LENGTH_SHORT).show();
                }
                break;*/
        }
        return false;
    }
    protected void allocateActivityTitle(String titleString){
        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(titleString);
        }

    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }

}
