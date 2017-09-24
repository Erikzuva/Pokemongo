package com.edu.erik.apppokemongo.model;

import com.edu.erik.apppokemongo.R;
import com.edu.erik.apppokemongo.dueloPokemon;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Erik on 22/09/2017.
 */

public class Jugar implements dueloPokemon {
    private static Random generador=new Random();
    private static List<Pokemon> lstPokemon;
    public Jugar(){

    }
    private static List<Pokemon> listarPoke() {
        lstPokemon = new ArrayList<>();
        lstPokemon.add(new Pokemon(1,"Enredadera","Planta",600,500,1000,R.drawable.bulbasaur));
        lstPokemon.add(new Pokemon(2,"Lanza Llamas","Fuego",400,800,1000, R.drawable.charmander));
        lstPokemon.add(new Pokemon(3,"Lanza Llamas","Fuego",700,1400,800,R.drawable.charizar));
        return  lstPokemon;
    }

    @Override
    public Pokemon user(int foto) {
        Pokemon usuario=null;
        for (Pokemon poke:listarPoke()){
            if(poke.getFoto()==foto){
                usuario=poke;
                break;
            }
        }
        return usuario;
    }

    @Override
    public Pokemon rival() {
        Pokemon comp =listarPoke().get(generador.nextInt(listarPoke().size()));
        return  comp;
    }

    @Override
    public Mensaje ganador(Pokemon usuario, Pokemon computadora) {
        int userVT=usuario.getDefensa()+usuario.getVida() - computadora.getAtaque();
        int compVT=computadora.getDefensa()+computadora.getVida() - usuario.getAtaque();
        if(userVT==compVT){ return new Mensaje("Muy Cerca","Empate",R.drawable.precaucion);}
        else if(userVT<compVT){ return new Mensaje("Sigue intentando","Tu Pierdes",R.drawable.error);}
        else {return new Mensaje("Felicidades","Tu Ganas",R.drawable.infomacion);}
    }
}
