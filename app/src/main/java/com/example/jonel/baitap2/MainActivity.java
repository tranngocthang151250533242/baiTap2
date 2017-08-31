package com.example.jonel.baitap2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView lv;
    EditText Ngay;
    EditText congViec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText Ngay = (EditText)findViewById(R.id.ngay);
        EditText congViec = (EditText)findViewById(R.id.congviec);
        Button btn = (Button)findViewById(R.id.btnOK);
        Event();
    }
    private void Event(){
        lv = (TextView)findViewById(R.id.textView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lv.setText(Ngay+"  "+congViec);
            }
        });
    }
}
