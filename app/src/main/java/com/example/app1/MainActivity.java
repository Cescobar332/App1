package com.example.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TvPrincipal2;
    private EditText EtPrincipal;
    private Button BtnPrincipal2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linearlayout2);

        Log.d("ciclo vida", "pasamos por el onCreate.....");
        TvPrincipal2 = findViewById(R.id.tv_principal2);
        EtPrincipal = findViewById(R.id.et_principal);
        BtnPrincipal2 = findViewById(R.id.btn_principal2);

        BtnPrincipal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.d("mensaje_consola", "se dio click");
                TvPrincipal2.setTextColor(getResources().getColor(R.color.purple_200));

                String text = EtPrincipal.getText().toString();
                TvPrincipal2.setText(text);
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();

        Log.d("ciclo vida", "pasamos por el onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();

        Log.d("ciclo vida", "pasamos por el onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("ciclo vida", "pasamos por el onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("ciclo vida", "pasamos por el onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("ciclo vida", "pasamos por el onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("ciclo vida", "pasamos por el onDestroy");
    }
}