package com.example.kiosk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Korea extends AppCompatActivity {
    ViewPager2 pager;
    TextView textView2,textView4;
    Button button, button2;
    class MyPagerAdapter extends FragmentStateAdapter {
        ArrayList<Fragment> items = new ArrayList<Fragment>();
        public MyPagerAdapter(FragmentActivity fm){
            super(fm);
        }
        public void addItem(Fragment item){
            items.add(item);
        }


        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return items.get(position);
        }


        @Override
        public int getItemCount(){
            return items.size();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korea);

        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        button = findViewById(R.id.button4);
        button2 = findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView2.setText(null);
                textView4.setText("원");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    FileOutputStream fos = openFileOutput("MENU.txt", Context.MODE_PRIVATE);
                    fos.write(textView2.getText().toString().getBytes());
                    fos.close();
                }catch (IOException e){
                }
                Toast.makeText(getApplicationContext(), "주문이 완료되었습니다", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(4);

        MyPagerAdapter adapter = new MyPagerAdapter(this);

        Fragment01 fragment1 = new Fragment01();
        adapter.addItem(fragment1);

        Fragment02 fragment2 = new Fragment02();
        adapter.addItem(fragment2);

        Fragment03 fragment3 = new Fragment03();
        adapter.addItem(fragment3);

        Fragment04 fragment4 = new Fragment04();
        adapter.addItem(fragment4);

        pager.setAdapter(adapter);


    }
    String sum;
    int sum1 =0;
    public void Sum(int num){
        sum1+=num;
        sum= Integer.toString(sum1)+("원");
        textView4.setText(sum);
    }
}
