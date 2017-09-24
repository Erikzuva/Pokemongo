package com.edu.erik.apppokemongo;

import android.app.Dialog;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.edu.erik.apppokemongo.model.Jugar;
import com.edu.erik.apppokemongo.model.Mensaje;
import com.edu.erik.apppokemongo.model.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView imgBulbasaur,imgCharmander,imgCharizar,imgUser,imgComputer;
    Button btnJugar,btnReiniciar;
    private Jugar play=new Jugar();
    Pokemon usuario=null;
    Pokemon computer=null;
    TextView txtUser,txtComp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inizializar();

        imgBulbasaur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario=play.user(R.drawable.bulbasaur);
                crearAtributos(txtUser,usuario);
                imgUser.setImageResource(usuario.getFoto());
            }
        });
        imgCharmander.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario=play.user(R.drawable.charmander);
                imgUser.setImageResource(usuario.getFoto());
                crearAtributos(txtUser,usuario);
            }
        });
        imgCharizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario=play.user(R.drawable.charizar);
                imgUser.setImageResource(usuario.getFoto());
                crearAtributos(txtUser,usuario);
            }
        });
        //jugar
        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               duelo();
            }
        });

        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Reiniciar();
            }
        });
    }
    private void duelo(){
        if(usuario!=null){
            computer=play.rival();
            imgComputer.setImageResource(computer.getFoto());
            Mensaje rpta=  play.ganador(usuario,computer);
            crearAtributos(txtComp,computer);
            btnJugar.setEnabled(false);

            crearMensaje(rpta);
        }else {
            Toast.makeText(MainActivity.this, "Seleccione un Pokemon", Toast.LENGTH_SHORT).show();
        }
    }
    private void Reiniciar(){
        usuario=null;
        computer=null;
        btnJugar.setEnabled(true);
        crearAtributos(txtUser);
        crearAtributos(txtComp);
        imgComputer.setImageResource(R.drawable.incognita);
        imgUser.setImageResource(R.drawable.incognita);
    }
    private void crearAtributos(TextView texto,Pokemon poke){
        texto.setText("TIPO: "+ poke.getTipo()+"\n"+
                     "ATT : "+ poke.getAtaque()+"\n"+
                     "DEF : "+ poke.getDefensa()+"\n"+
                     "HP  : "+ poke.getVida());
    }
    private void crearAtributos(TextView texto){
        texto.setText("TIPO: ???? \n"+
                "ATT : ????\n"+
                "DEF : ????\n"+
                "HP  : ????");
    }

    private void crearMensaje(Mensaje msg){
        AlertDialog.Builder build =new AlertDialog.Builder(this);
        build.setTitle(msg.getTitulo()).setIcon(msg.getIcono()).setMessage(msg.getMensaje()).show();
    }

    private void inizializar(){
        imgBulbasaur= (ImageView) findViewById(R.id.imgBulbasaur);
        imgCharmander= (ImageView) findViewById(R.id.imgCharmander);
        imgCharizar= (ImageView) findViewById(R.id.imgCharizar);
        imgUser= (ImageView) findViewById(R.id.imgUsuario);
        imgComputer= (ImageView) findViewById(R.id.imgComputer);
        btnJugar= (Button) findViewById(R.id.btnJugar);
        btnReiniciar= (Button) findViewById(R.id.btnReiniciar);
        txtUser= (TextView) findViewById(R.id.txtuser);
        txtComp= (TextView) findViewById(R.id.txtcomp);
        crearAtributos(txtUser);
        crearAtributos(txtComp);
    }
}
