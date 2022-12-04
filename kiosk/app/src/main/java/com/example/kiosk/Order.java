package com.example.kiosk;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.IOException;

public class Order extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);

        textView=findViewById(R.id.textView33);
try {
    FileInputStream fis = openFileInput("MENU.txt");
    byte[] buffer = new byte[fis.available()];
    fis.read(buffer);
    textView.setText(new String(buffer));
    fis.close();
}catch (IOException e){};

    }
}
