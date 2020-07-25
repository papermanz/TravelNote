package com.Minhhieu.TravelNote;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    //sử dụng Main action làm menu của actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //thông báo khi chọn button trên action bar
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
       switch (item.getItemId()){
           case R.id.Search:
               Toast.makeText(this, "Search button selected", Toast.LENGTH_SHORT).show();
                return true;
           case R.id.about:
               Toast.makeText(this, "About button selected", Toast.LENGTH_SHORT).show();
               return true;
           case R.id.help:
               Toast.makeText(this,"Help button selected",Toast.LENGTH_SHORT).show();
               return true;
       }
       return super.onOptionsItemSelected(item);
    }
}