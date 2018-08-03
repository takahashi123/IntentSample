package com.websarva.wings.android.intentsample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;


public class MenuThanksActivity extends AppCompatActivity {

    private AdapterView lvMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_thanks2);





        Intent intent = getIntent();

            TextView tvMenuName = findViewById(R.id.tvMenuName);
            TextView tvMenuPrice = findViewById(R.id.tvMenuPrice);


            String menuName = intent.getStringExtra("menuName");
            String menuPrice = intent.getStringExtra("menuPrice");

            tvMenuName.setText(menuName);
            tvMenuPrice.setText(menuPrice);

        }
     public void onBackButtonClick(View view){
            finish();
     }
  }
