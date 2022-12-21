package com.example.remorgnew;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Batch2  extends Fragment {
    Button bbl,eel,ev,mal1010,mal1020,phl;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
      //  return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.batch2,container,false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bbl=(Button)view.findViewById(R.id.bbl);
        eel=(Button)view.findViewById(R.id.eel);
        ev=(Button)view.findViewById(R.id.ev);
        mal1010=(Button)view.findViewById(R.id.mal1010);
        mal1020=(Button)view.findViewById(R.id.mal1020);
        phl=(Button)view.findViewById(R.id.phl);
        bbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u="https://drive.google.com/drive/folders/1qBDztY4nKnN9UyJ8FLkyFdKWQ4x0FMIl?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                startActivity(intent);


            }
        });
        eel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u="https://drive.google.com/drive/folders/1KJJw8Byya6BCVbILn3PtMDhNhAfo2wll?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                startActivity(intent);

            }
        });
        ev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u="https://drive.google.com/drive/folders/1Fb2gGgWySD5ETZ2QxSyYFezS0uqaY7kK?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                startActivity(intent);

            }
        });
        mal1010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u="https://drive.google.com/drive/folders/1ShraWAA5J3T-ZRTZpCSWtxx0NC8tiuqz?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                startActivity(intent);

            }
        });
        mal1020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u="https://drive.google.com/drive/folders/1NxuGLfwqBs530Fo30dgL1xLsxdsXv8FU?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                startActivity(intent);

            }
        });
        phl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u="https://drive.google.com/drive/folders/1wfiskvefOUYDUuhrTBGX6iLLlxA4UeWv?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                startActivity(intent);

            }
        });
    }
}
