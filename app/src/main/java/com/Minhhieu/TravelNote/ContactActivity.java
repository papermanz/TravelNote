package com.Minhhieu.TravelNote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

public class ContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    // xây dựng nút back để chuyển về activity main
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
    }
    //đón lấy sự kiện onOptionsItemSelected(), lần này bạn check với item có id là android.R.id.home,
    // đây là id sẵn có của hệ thống đối với item back này
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case android.R.id.home:
                finish(); //kết thúc 1 activity
                return (true);
        }
        return super.onOptionsItemSelected(item);
    }
}