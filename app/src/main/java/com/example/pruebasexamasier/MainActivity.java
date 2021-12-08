package com.example.pruebasexamasier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //implementar animacion  ------------------LOGO PRINCIPAL------------------
        ImageView mSea = (ImageView) findViewById(R.id.logo); //definimos una variable de tipo ImageView referenciada al id beach que es el LOGO PRINCIPAL
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein); //aqui defino una variable Animaton y que cargue mi animacion llamada FADEIN
        mSea.startAnimation(myanim);//inicio Animacion

        ImageView mSea1 = (ImageView) findViewById(R.id.logo2); //definimos una variable de tipo ImageView referenciada al id beach que es el LOGO PRINCIPAL
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.move); //aqui defino una variable Animaton y que cargue mi animacion llamada FADEIN
        mSea1.startAnimation(myanim2);//inicio Animacion
         ImageView mSea2 = (ImageView) findViewById(R.id.logo3); //definimos una variable de tipo ImageView referenciada al id beach que es el LOGO PRINCIPAL
        Animation myanim33 = AnimationUtils.loadAnimation(this, R.anim.finala); //aqui defino una variable Animaton y que cargue mi animacion llamada FADEIN
        mSea2.startAnimation(myanim33);//inicio Animacion

        ImageView mCycle1 = (ImageView) findViewById(R.id.imageView1); //definimos una variable de tipo ImageView referenciada al id beach que es el LOGO PRINCIPAL
        Animation myanim3 = AnimationUtils.loadAnimation(this, R.anim.slide_up); //aqui defino una variable Animaton y que cargue mi animacion llamada FADEIN
        mCycle1.startAnimation(myanim3);//inicio Animacion

        ImageView mCycle3 = (ImageView) findViewById(R.id.imageView2); //definimos una variable de tipo ImageView referenciada al id beach que es el LOGO PRINCIPAL
        Animation myanim4 = AnimationUtils.loadAnimation(this, R.anim.slide_down); //aqui defino una variable Animaton y que cargue mi animacion llamada FADEIN
        mCycle3.startAnimation(myanim4);//inicio Animacion

        ImageView mCycle4 = (ImageView) findViewById(R.id.imageView3); //definimos una variable de tipo ImageView referenciada al id beach que es el LOGO PRINCIPAL
        Animation myanim5 = AnimationUtils.loadAnimation(this, R.anim.blink); //aqui defino una variable Animaton y que cargue mi animacion llamada FADEIN
        mCycle4.startAnimation(myanim5);//inicio Animacion

        ImageView mCycle5 = (ImageView) findViewById(R.id.imageView4); //definimos una variable de tipo ImageView referenciada al id beach que es el LOGO PRINCIPAL
        Animation myanim6 = AnimationUtils.loadAnimation(this, R.anim.zoom_in); //aqui defino una variable Animaton y que cargue mi animacion llamada FADEIN
        mCycle5.startAnimation(myanim6);//inicio Animacion

        ImageView mCycle6 = (ImageView) findViewById(R.id.imageView5); //definimos una variable de tipo ImageView referenciada al id beach que es el LOGO PRINCIPAL
        Animation myanim7 = AnimationUtils.loadAnimation(this, R.anim.zoom_out); //aqui defino una variable Animaton y que cargue mi animacion llamada FADEIN
        mCycle6.startAnimation(myanim7);//inicio Animacion

        ImageView mCycle7 = (ImageView) findViewById(R.id.imageView6); //definimos una variable de tipo ImageView referenciada al id beach que es el LOGO PRINCIPAL
        Animation myanim8 = AnimationUtils.loadAnimation(this, R.anim.rotate); //aqui defino una variable Animaton y que cargue mi animacion llamada FADEIN
        mCycle7.startAnimation(myanim8);//inicio Animacion

    }

    public void pulsarLogo(View view){
        Intent intent=new Intent(MainActivity.this,Animacion.class);
        startActivity(intent);

    }
}