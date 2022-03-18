package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        button = findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        if(mCount%2==0){
            button.setBackgroundColor(getResources().getColor(R.color.pink));
        }

        else if(mCount==0){
            button.setBackgroundColor(getResources().getColor(R.color.gray));
        }
        else{
            button.setBackgroundColor(getResources().getColor(R.color.gray));
        }

    }
    public void resetCount(View view) {
        mCount = 0;
        if (mShowCount != null)
            button.setBackgroundColor(getResources().getColor(R.color.gray));
        mShowCount.setText(Integer.toString(mCount));
    }
}