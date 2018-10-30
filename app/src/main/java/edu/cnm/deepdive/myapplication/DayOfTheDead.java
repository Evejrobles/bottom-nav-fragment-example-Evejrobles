package edu.cnm.deepdive.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import edu.cnm.deepdive.fragment_example.R;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class DayOfTheDead extends Fragment {


  public DayOfTheDead() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_day_of_dead, container, false);
    RadioButton day1 = view.findViewById(R.id.day_1);
    RadioButton day2 = view.findViewById(R.id.day_2);
    RadioButton day3 = view.findViewById(R.id.day_3);
    DateFormat format = new SimpleDateFormat("MMM d");
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.MONTH, 9);
    calendar.set(Calendar.DAY_OF_MONTH, 31);
    day1.setText(format.format(calendar.getTime()));
    calendar.set(Calendar.MONTH, 10);
    calendar.set(Calendar.DAY_OF_MONTH, 1);
    day2.setText(format.format(calendar.getTime()));
    calendar.set(Calendar.DAY_OF_MONTH, 2);
    day3.setText(format.format(calendar.getTime()));
    return view;
  }
}