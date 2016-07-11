package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popularMoviesButton = (Button) findViewById(R.id.button_popular_movies);
        Button stockbutton = (Button) findViewById(R.id.stock_hawk_button);
        Button buildItBiggerButton = (Button) findViewById(R.id.built_it_bigger_button);
        Button makeYourAppmaterialButton = (Button) findViewById(R.id.make_your_app_material_button);
        Button goUbiquitousButton = (Button) findViewById(R.id.go_obiquitous_button);
        Button capstoneButton = (Button) findViewById(R.id.capstone_button);

        popularMoviesButton.setOnClickListener(v -> Toast.makeText(this, "This button will lunch my popular movies app", Toast.LENGTH_SHORT).show());
        stockbutton.setOnClickListener(v -> Toast.makeText(this, "This button will lunch my stock app", Toast.LENGTH_SHORT).show());
        buildItBiggerButton.setOnClickListener(v -> Toast.makeText(this, "This button will lunch my build it bigger app", Toast.LENGTH_SHORT).show());
        makeYourAppmaterialButton.setOnClickListener(v -> Toast.makeText(this, "This button will lunch my make your app material app", Toast.LENGTH_SHORT).show());
        goUbiquitousButton.setOnClickListener(v -> Toast.makeText(this, "This button will lunch my goUbiquitous app", Toast.LENGTH_SHORT).show());
        capstoneButton.setOnClickListener(v -> Toast.makeText(this, "This button will lunch my capstone app", Toast.LENGTH_SHORT).show());

    }

}
