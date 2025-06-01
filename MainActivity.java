
package com.coulfang;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView hello = new TextView(this);
        hello.setText("Bienvenue dans CoulFang !");
        setContentView(hello);
    }
}
