package com.example.android.trackmysleepquality.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

@SuppressLint("AppCompatCustomView")
public class SleepButton extends Button {
    public SleepButton(Context context) {
        super(context);
    }

    public SleepButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SleepButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public SleepButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public void changeTextTo(String s) {
        this.setText(s);
    }

    public void disappear() {
        this.setVisibility(INVISIBLE);
    }

    public void appear() {
        this.setVisibility(VISIBLE);
    }
}
