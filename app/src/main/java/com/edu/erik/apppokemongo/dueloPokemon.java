package com.edu.erik.apppokemongo;

import com.edu.erik.apppokemongo.model.Mensaje;
import com.edu.erik.apppokemongo.model.Pokemon;

/**
 * Created by Erik on 22/09/2017.
 */

public interface dueloPokemon {
    Pokemon user(int foto);
    Pokemon rival();
    Mensaje ganador(Pokemon usuario, Pokemon computadora);
}
