package com.example.phase3.recipe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class track extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_track);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) { switch(item.getItemId()) {
        case R.id.bt_info:
            Intent user_profile = new Intent(this,user_prof.class);
            startActivity(user_profile);
            return(true);
        case R.id.bt_rec:
            Intent recip = new Intent(this,recipes.class);
            startActivity(recip);
            return(true);
        case R.id.bt_saved:
            Intent saved_rec = new Intent(this,saved_rec.class);
            startActivity(saved_rec);
            return(true);
        case R.id.bt_7plan:
            Intent week = new Intent(this,seven_plan.class);
            startActivity(week);
            return(true);
        case R.id.bt_track:
            Intent tracker = new Intent(this,track.class);
            startActivity(tracker);
            return(true);
        case R.id.bt_groupplan:
            Intent groupmeal = new Intent(this,group.class);
            startActivity(groupmeal);
            return(true);
        case R.id.bt_help:
            Intent support = new Intent(this,help.class);
            startActivity(support);
            return(true);
        case R.id.bt_logout:
            Intent leave = new Intent(this,logout.class);
            startActivity(leave);
            return(true);


    }
        return(super.onOptionsItemSelected(item));
    }
}
