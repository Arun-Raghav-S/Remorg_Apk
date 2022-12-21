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

public class Batch1  extends Fragment {
    Button cyl,python,ev,mal1010,mal1020,mel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //  return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.batch1,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        cyl=(Button)view.findViewById(R.id.cyl);
        python=(Button)view.findViewById(R.id.python);
        ev=(Button)view.findViewById(R.id.ev);
        mal1010=(Button)view.findViewById(R.id.mal1010);
        mal1020=(Button)view.findViewById(R.id.mal1020);
        mel=(Button)view.findViewById(R.id.mel1010);
        cyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u="https://drive.google.com/drive/folders/1H1cWc-YG4lT2-c9SuneqkDiufgauX_zE?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                startActivity(intent);


            }
        });
        python.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u="https://drive.google.com/drive/folders/10Ko9UiBt8bOB875OxsLpjdCy0PXo0a8C?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                startActivity(intent);

            }
        });
        ev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u="https://drive.google.com/drive/folders/1gBW14Bj-hGEaNqsfJyMjyqsnzhr80JQS?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                startActivity(intent);

            }
        });
        mal1010.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u="https://drive.google.com/drive/folders/1xijFleBbOnKVEAvQrPOENPoxPLbYwVRQ?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                startActivity(intent);

            }
        });
        mal1020.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u="https://drive.google.com/drive/folders/1_xRRY9n2-mp6XdKu3029cKZYSMPld9LF?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                startActivity(intent);

            }
        });
        mel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String u="https://drive.google.com/drive/folders/1sE1ifpWbFoheapA6e1F1U_Rp4oA1cFMh?usp=sharing";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(u));
                startActivity(intent);

            }
        });
    }
}
