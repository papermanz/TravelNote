package com.Minhhieu.TravelNote;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.res.Configuration;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //con trỏ đến activity drawer
        drawerLayout = findViewById(R.id.activity_main_drawer);
        //điều khiển việc đóng mở action bar
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(drawerToggle);

        //icon hamburger vào actionbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        drawerToggle.syncState();
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }
    //sử dụng Main action làm menu của actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //chuyển activity khi chọn button trên action bar
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
       switch (item.getItemId()){
           case R.id.Search:
               Toast.makeText(this, "Search button selected", Toast.LENGTH_SHORT).show();
                return true;
           case R.id.about:
               Intent intent = new Intent(this, ContactActivity.class);
               startActivity(intent);
               return  true;
           case R.id.help:
               intent = new Intent(this, ContactActivity.class);
               startActivity(intent);
               return true;
       }
       return super.onOptionsItemSelected(item);
    }
}