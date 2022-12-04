package com.example.kiosk;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class Fragment03 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_03, container, false);

        CardView cardView21 = v.findViewById(R.id.CardView21);
        CardView cardView22 = v.findViewById(R.id.CardView22);
        CardView cardView23 = v.findViewById(R.id.CardView23);
        CardView cardView24 = v.findViewById(R.id.CardView24);
        CardView cardView25 = v.findViewById(R.id.CardView25);

        cardView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("녹차플랫치노(4200)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("망고플랫치노(3500)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("자몽플랫치노(3800)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("초콜릿칩플랫치노(4200)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("요거트플랫치노(4200)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });

        return v;
    }
}