package edu.cnm.deepdive.fragment_example;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import edu.cnm.deepdive.myapplication.BalloonFiesta;
import edu.cnm.deepdive.myapplication.DayOfTheDead;
import edu.cnm.deepdive.myapplication.Home;

public class MainActivity extends AppCompatActivity
    implements BottomNavigationView.OnNavigationItemSelectedListener {


  private TextView fragmentTitle;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    fragmentTitle = findViewById(R.id.fragment_title);
    BottomNavigationView navigation = findViewById(R.id.navigation);
    navigation.setOnNavigationItemSelectedListener(this);
    navigation.setSelectedItemId(R.id.home);
  }

  @Override
  public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
    boolean handled = true;
    Fragment fragment = null;
    switch (menuItem.getItemId()) {
      case R.id.home:
        fragment = new Home();
        break;
      case R.id.balloon:
        fragment = new BalloonFiesta();
        break;
      case R.id.skull:
        fragment = new DayOfTheDead();
        break;
      default:
        handled = false;
    }
    if (handled) {
      fragmentTitle.setText(menuItem.getTitle());
      if (fragment != null) {
        getSupportFragmentManager().beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit();
      }
    }
    return handled;
  }
}
