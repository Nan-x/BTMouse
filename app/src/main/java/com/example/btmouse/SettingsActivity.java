package com.example.btmouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;

import com.example.psrab.btmouse.R;

public class SettingsActivity extends AppCompatActivity {


  ImageButton discoverbutton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_setting);






    //----Buttons

    discoverbutton = (ImageButton) findViewById(R.id.DiscoverButton);
    discoverbutton.setOnClickListener(v -> {
      Intent activity2Intent = new Intent(getApplicationContext(), DiscoverActivity.class);
      startActivity(activity2Intent);
    });






    //---ACTION BAR

    Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
    setSupportActionBar(myToolbar);

  }
}
