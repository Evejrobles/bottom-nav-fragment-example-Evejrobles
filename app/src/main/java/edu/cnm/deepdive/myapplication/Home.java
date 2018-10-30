package edu.cnm.deepdive.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.thedeanda.lorem.LoremIpsum;
import edu.cnm.deepdive.fragment_example.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {



  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_home, container, false);
    TextView textView = view.findViewById(R.id.home_text);
    textView.setText(LoremIpsum.getInstance().getParagraphs(3, 6));
    return view;
  }
}