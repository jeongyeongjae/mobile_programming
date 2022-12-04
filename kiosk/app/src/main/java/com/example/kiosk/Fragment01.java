package com.example.kiosk;

import android.content.Context;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.FileOutputStream;
import java.io.IOException;


public class Fragment01 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_01, container, false);

        CardView cardView = v.findViewById(R.id.CardView1);
        CardView cardView2 = v.findViewById(R.id.CardView2);
        CardView cardView3 = v.findViewById(R.id.CardView3);
        CardView cardView4 = v.findViewById(R.id.CardView4);
        CardView cardView5 = v.findViewById(R.id.CardView5);
        CardView cardView6 = v.findViewById(R.id.CardView6);
        CardView cardView7 = v.findViewById(R.id.CardView7);
        CardView cardView8 = v.findViewById(R.id.CardView8);
        CardView cardView9 = v.findViewById(R.id.CardView9);
        CardView cardView10 = v.findViewById(R.id.CardView10);
        CardView cardView11 = v.findViewById(R.id.CardView11);
        CardView cardView12 = v.findViewById(R.id.CardView12);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=2900;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("에스프레소(2900)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("카푸치노(3700)\n");
              /*  sum1+=num;
                sum= Integer.toString(sum1)+("원");
                ((Korea)getActivity()).textView4.setText(sum);*/
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("아인슈페너(3700)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("카페라떼(3700)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("토피넛라떼(4000)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("아메리카노(3200)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("바닐라라떼(3900)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("카라멜마끼아또(3900)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("달고나믹스치노(4200)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("카페모카(3900)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("콜드브루(3700)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        cardView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num=3700;
                Toast.makeText(getActivity().getApplicationContext(), "추가되었습니다", Toast.LENGTH_SHORT).show();
                ((Korea)getActivity()).textView2.append("흑당콜드브루(3700)\n");
                ((Korea)getActivity()).Sum(num);
            }
        });
        return v;
    }


}
