package edu.cnm.deepdive.fragment_example;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

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
    switch (menuItem.getItemId()) {
      case R.id.home:
        break;
      case R.id.balloon:
        break;
      case R.id.skull:
        break;
      default:
        handled = false;
    }
    return handled;
  }

}
