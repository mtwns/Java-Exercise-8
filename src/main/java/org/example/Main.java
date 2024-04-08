package org.example;

import org.example.classes.VideoJuegos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<VideoJuegos> listaVideojuegos = new ArrayList<VideoJuegos>();

        VideoJuegos game1 = new VideoJuegos(1,"DarkSouls1","PlayStation4",1,"Souls");
        VideoJuegos game2 = new VideoJuegos(2,"DarkSouls2","PlayStation4",1,"Souls");
        VideoJuegos game3 = new VideoJuegos(3,"DarkSouls3","PlayStation4",1,"Souls");
        VideoJuegos game4 = new VideoJuegos(4,"Bloodborne","PlayStation4",1,"Souls");
        VideoJuegos game5 = new VideoJuegos(5,"EldenRing","PC",1,"Souls");

        listaVideojuegos.add(game1);
        listaVideojuegos.add(game2);
        listaVideojuegos.add(game3);
        listaVideojuegos.add(game4);
        listaVideojuegos.add(game5);

        for (VideoJuegos game: listaVideojuegos) {
            System.out.println("Titulo: " + game.getTitulo() + " Consola: " + game.getConsola() + " Jugadores: "+ game.getCantidadJugadores());
        }

        for (VideoJuegos game:
             listaVideojuegos) {
            if(game.getConsola().equals("PC")){
                System.out.printf(game.toString());
            }
        }
    }
}