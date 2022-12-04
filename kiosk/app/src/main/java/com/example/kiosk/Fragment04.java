package com.example.kiosk;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class Fragment04 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_04, container, false);

        CardView cardView26 = v.findViewById(R.id.CardView26);
        CardView cardView27 = v.findViewById(R.id.CardView27);
        CardView cardView28 = v.findViewById(R.id.CardView28);
        CardView cardView29 = v.findViewById(R.id.CardView29);
        CardView cardView30 = v.findViewById(R.id.CardView30);
        CardView cardView31 = v.findViewById(R.id.CardView31);

        cardView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("바닐라마카롱(2200)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("블루베리머핀(2000)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("수플레치즈케이크(3900)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("스노우쿠키슈(1800)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("이디야티라미수(2800)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("초콜렛청크쿠키(1900)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });

        return v;
    }
}