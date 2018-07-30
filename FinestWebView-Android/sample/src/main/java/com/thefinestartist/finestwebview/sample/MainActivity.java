package com.thefinestartist.finestwebview.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.thefinestartist.finestwebview.FinestWebView;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
  }

  public void onClick(View view) {
      new FinestWebView.Builder(this).titleDefault("Uplift")
          .show("http://upliftcincy.com/login");
  }
}
