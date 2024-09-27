package com.example.myfirststepand;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
    private Button toast,alert,CounterBtn;
    private TextView count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        toast=findViewById(R.id.toast);
        alert=findViewById(R.id.alert);
        CounterBtn=findViewById(R.id.CounterBtn);
        count=findViewById(R.id.count);
        /*toast.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Votre click sur toast montrer ici!",Toast.LENGTH_LONG).show();
            }
        });
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder b=new AlertDialog.Builder(MainActivity.this);
                b.setTitle("Button d'alert");
                b.setMessage("C'est la boite d'alert de CHAJARI Salma");
                b.setPositiveButton("Continue", ((dialog, which) -> {

                }));
                b.setNegativeButton("cancel",((dialog, which) -> {}));
                b.show();
            }
        });

        CounterBtn.setOnClickListener(new View.OnClickListener() {
            int cunt = 0;
            @Override
            public void onClick(View v) {
                cunt++;
                count.setText(String.valueOf(cunt));
            }
        });*/

        View.OnClickListener btn= new View.OnClickListener() {
            int cunt = 0;
            @Override
            public void onClick(View v) {
                if(v==toast){
                    Toast.makeText(MainActivity.this,"Button cliqué",Toast.LENGTH_LONG).show();
                }else if(v==alert){
                    AlertDialog.Builder b=new AlertDialog.Builder(MainActivity.this);
                    b.setTitle("Button d'alert");
                    b.setMessage("C'est la boite d'alert de CHAJARI Salma");
                    b.setPositiveButton("Continue", ((dialog, which) -> {
                    }));
                    b.setNegativeButton("cancel",((dialog, which) -> {}));
                    b.show();
                } else if (v==CounterBtn) {
                    cunt++;
                    count.setText(String.valueOf(cunt));
                }
            }
        };
        toast.setOnClickListener(btn);
        alert.setOnClickListener(btn);
        CounterBtn.setOnClickListener(btn);
    }
}