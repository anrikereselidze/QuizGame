package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class questionsActivity extends AppCompatActivity {
    private Button LastPage;
    RadioButton rb;
    RadioGroup rg1, rg2, rg3, rg4, rg5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        initViews();

        LastPage = (Button) findViewById(R.id.scoreActivity);
      LastPage.setOnClickListener(new View.OnClickListener() {
            @Override
          public void onClick(View v) {

              int score = 0;
              int radioId = rg1.getCheckedRadioButtonId();
              if (radioId == R.id.radio_button1_3)
                  score++;

              radioId = rg2.getCheckedRadioButtonId();
              if (radioId == R.id.radio_button2_3)
                  score++;

              radioId = rg3.getCheckedRadioButtonId();
              if (radioId == R.id.radio_button3_1)
                  score++;


              radioId = rg4.getCheckedRadioButtonId();
              if (radioId == R.id.radio_button4_3)
                  score++;

              radioId = rg5.getCheckedRadioButtonId();
              if (radioId == R.id.radio_button5_3)
                  score++;

              System.out.println("Score - "+score);

              Intent i = new Intent(getBaseContext(), score.class);
              i.putExtra("abc", score);
              startActivity(i);
          }

        });






        }





public  void score() {
    Intent intent = new Intent(this, score.class);
    startActivity(intent);

}


    public void initViews(){
        rg1 = (RadioGroup) findViewById(R.id.radio_group1);
        rg2 = (RadioGroup) findViewById(R.id.radio_group2);
        rg3 = (RadioGroup) findViewById(R.id.radio_group3);
        rg4 = (RadioGroup) findViewById(R.id.radio_group4);
        rg5 = (RadioGroup) findViewById(R.id.radio_group5);

        LastPage =(Button)findViewById(R.id.scoreActivity);
    }

}
