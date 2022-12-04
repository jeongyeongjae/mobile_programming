package com.example.kiosk;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class Fragment02 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_02, container, false);

        CardView cardView13 = v.findViewById(R.id.CardView13);
        CardView cardView14 = v.findViewById(R.id.CardView14);
        CardView cardView15 = v.findViewById(R.id.CardView15);
        CardView cardView16 = v.findViewById(R.id.CardView16);
        CardView cardView17 = v.findViewById(R.id.CardView17);
        CardView cardView18 = v.findViewById(R.id.CardView18);
        CardView cardView19 = v.findViewById(R.id.CardView19);
        CardView cardView20 = v.findViewById(R.id.CardView20);

        cardView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("골드키위주스(4200)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("녹차라떼(3700)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("달고나라떼(3500)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("딸기주스(4200)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("이곡라떼(3500)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("초콜릿(3700)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("홍시주스(4200)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("화이트초콜릿(3700)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });

        return v;

    }
}