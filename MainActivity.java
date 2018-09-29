package com.example.demmy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer one = 0;
    Integer two = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    1 требование стандартов по содержанию и оформлению документации на программный продук
//    2 действие разработчика по сертификации программного продукта +
//    3 орган выдающий сертификат +
//    4 показатели качевсва программного продукта +
//    5 модель качевства по стандарту ISO +
//    6 ввнутренние и внешние характеристики по стандарту ISO
//    7 измерители имметрики показателей качевства +
    public void addScoreFirst(View view) {

        one++;
        TextView tw = (TextView)findViewById(R.id.firstTeam);
        tw.setText(one.toString());

    }

    public void addScoreSecond(View view) {

        two++;
        TextView tw = (TextView)findViewById(R.id.secondTeam);
        tw.setText(two.toString());
        }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", one);
        outState.putInt("count", two);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")){
            one = savedInstanceState.getInt("count");
            TextView tw = (TextView)findViewById(R.id.firstTeam);
            tw.setText(one.toString());
        }
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("count")){
            two = savedInstanceState.getInt("count");
            TextView tw = (TextView)findViewById(R.id.secondTeam);
            tw.setText(two.toString());

        }

        TextView tw = (TextView)findViewById(R.id.secondTeam);
        tw.setText(two.toString());
    }

    public void ref(View view) {

        one=0;

        TextView tw = (TextView)findViewById(R.id.firstTeam);
        tw.setText(one.toString());

        two=0;

        tw = (TextView)findViewById(R.id.secondTeam);
        tw.setText(two.toString());

    }
}
