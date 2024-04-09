package com.example.jajko1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();
    int res = 0;
    Button btSpr;
    int licznik1 = 0, licznik2 = 0;
    int[] ids = {R.id.imageView4, R.id.imageView5, R.id.imageView6, R.id.imageView7, R.id.imageView8};
    ImageView[] imageViews = new ImageView[ids.length];
    TextView tvWynik, tvLicznik;
    EditText etNum;
    int[] imgTab = {R.drawable.jajko, R.drawable.kurczak, R.drawable.zajaczek};
    int[] pointTab = {1, 2, 5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < ids.length; i++) {
            imageViews[i] = findViewById(ids[i]);
        }
        tvWynik = findViewById(R.id.textView6);
        etNum = findViewById(R.id.editTextNumber);
        btSpr = findViewById(R.id.button2);
        tvLicznik = findViewById(R.id.textView);
    }

    public void onClickLosuj(View view) {
        int temp;
        for(int i = 0; i < 5; i++)
        {
            temp = rand.nextInt(3);
            imageViews[i].setImageResource(imgTab[temp]);
            if(temp == 0)
            {
              res+=1;
            } else if(temp == 1)
            {
                res+=2;
            } else if (temp == 2) {
                res+=5;
            }
        }
        btSpr.setEnabled(true);
    }

    public void onClickCheck(View view) {
        int input;
        licznik2 += 1;
        if(etNum.getText() != null)
        {
            input = Integer.parseInt(String.valueOf(etNum.getText()));
        } else
        {
            return;
        }
        if(input == res)
        {
            tvWynik.setText("Dobrze");
            licznik1 += 1;

        } else
        {
            tvWynik.setText("Spróbuj jeszcze raz");
        }
        tvLicznik.setText(licznik1 + "/" + licznik2);
    }

    public void onClickReset(View view) {
        for (int i = 0; i < ids.length; i++) {
            imageViews[i].setImageResource(R.drawable.blank);
            res = 0;
            licznik1 = 0;
            licznik2 = 0;
            tvLicznik.setText("0/0");
        }
        btSpr.setEnabled(false);
    }
}