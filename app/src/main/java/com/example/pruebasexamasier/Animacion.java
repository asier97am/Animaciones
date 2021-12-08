package com.example.pruebasexamasier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.*;
import android.widget.ImageView;
import android.widget.TextView;

public class Animacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animacion);

        //implementar animacion  ------------------LOGO PRINCIPAL------------------
        ImageView mCycle = (ImageView) findViewById(R.id.imageView); //definimos una variable de tipo ImageView referenciada al id beach que es el LOGO PRINCIPAL
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.titleanimation); //aqui defino una variable Animaton y que cargue mi animacion llamada FADEIN
        mCycle.startAnimation(myanim2);//inicio Animacion

        ImageView mCycle1 = (ImageView) findViewById(R.id.imageView1); //definimos una variable de tipo ImageView referenciada al id beach que es el LOGO PRINCIPAL
        Animation myanim3 = AnimationUtils.loadAnimation(this, R.anim.slide_up); //aqui defino una variable Animaton y que cargue mi animacion llamada FADEIN
        mCycle1.startAnimation(myanim3);//inicio Animacion

        ImageView mCycle3 = (ImageView) findViewById(R.id.imageView2); //definimos una variable de tipo ImageView referenciada al id beach que es el LOGO PRINCIPAL
        Animation myanim4 = AnimationUtils.loadAnimation(this, R.anim.slide_down); //aqui defino una variable Animaton y que cargue mi animacion llamada FADEIN
        mCycle3.startAnimation(myanim4);//inicio Animacion



    }


}