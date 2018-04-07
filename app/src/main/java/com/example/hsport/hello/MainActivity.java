/**
 * Created by Gerald Shields 04/05/2018
 */

package com.example.hsport.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);
    }

    /**
     * @param view
     */
    public void countUp (View view){
        // What will happen when the user clicks on the button_count Button goes here.
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

    }

    /**
     * @param view
     */
    public void showToast (View view){
        // What will happen when the user clicks on the button_toast Button goes here.
        Toast toast = Toast.makeText(this, R.string.button_label_toast, Toast.LENGTH_LONG);
        toast.show();
    }
}
