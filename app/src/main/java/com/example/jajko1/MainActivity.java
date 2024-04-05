package com.example.jajko1;

import android.os.Bundle;
import android.view.View;
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
    ImageView img1, img2, img3, img4, img5;
    TextView tvWynik;
    EditText etNum;
    int[] imgTab = {R.drawable.jajko, R.drawable.kurczak, R.drawable.zajaczek};
    int[] pointTab = {1, 2, 5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.imageView4);
        img2 = findViewById(R.id.imageView5);
        img3 = findViewById(R.id.imageView6);
        img4 = findViewById(R.id.imageView7);
        img5 = findViewById(R.id.imageView8);
        tvWynik = findViewById(R.id.textView6);
        etNum = findViewById(R.id.editTextNumber);
    }

    public void onClickLosuj(View view) {
        int temp;
        for(int i = 1; i < 5; i++)
        {
            temp = rand.nextInt(3);


        }
    }

    public void onClickCheck(View view) {

    }

    public void onClickReset(View view) {

    }
}