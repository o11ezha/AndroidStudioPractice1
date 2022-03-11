package ru.mirea.goryacheva.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button15;
    private Button button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView myTextView = (TextView) findViewById(R.id.textView3);
        myTextView.setText("New text in MIREA");

        Button button17 = findViewById(R.id.button17);
        button17.setText("MireaButton");

        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);

        textView = findViewById(R.id.textView);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);

        View.OnClickListener oclButtonOk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Нажата кнопка ОК");
            }
        };

        View.OnClickListener oclButtonCancel = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Больше не нажата кнопка Ок");
            }
        };

        button15.setOnClickListener(oclButtonOk);
        button16.setOnClickListener(oclButtonCancel);
    }
}