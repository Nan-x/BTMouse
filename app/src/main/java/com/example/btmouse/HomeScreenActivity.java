package com.example.btmouse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.psrab.btmouse.R;

public class HomeScreenActivity extends AppCompatActivity {

  ImageButton trackpadbutton;
  ImageButton mousebutton;
  ImageButton settingsbutton;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home_screen);



    //--Buttons

  trackpadbutton = (ImageButton) findViewById(R.id.TrackPadButton);
     trackpadbutton.setOnClickListener(v -> {
       Intent activity2Intent = new Intent(getApplicationContext(), DiscoverActivity.class);
       activity2Intent.putExtra("flag", true);

       startActivity(activity2Intent);
  });

    mousebutton = (ImageButton) findViewById(R.id.MouseButton);
    mousebutton.setOnClickListener(v -> {
      Intent activity2Intent = new Intent(getApplicationContext(), DiscoverActivity.class);
      activity2Intent.putExtra("flag", false);


      startActivity(activity2Intent);
    });

    Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
    setSupportActionBar(myToolbar);
}

}
