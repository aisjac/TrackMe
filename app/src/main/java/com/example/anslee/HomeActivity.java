package com.example.anslee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    EditText nameEditText;
    Button goButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        nameEditText = findViewById(R.id.nameEditTextId);
        goButton = findViewById(R.id.goButtonId);

        goButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  name = nameEditText.getText().toString().trim();
                if (!name.equals("")){
                    Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                    intent.putExtra("key",name);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(HomeActivity.this, "Type your name please...", Toast.LENGTH_SHORT).show();
                }
                
            }
        });
    }
}
