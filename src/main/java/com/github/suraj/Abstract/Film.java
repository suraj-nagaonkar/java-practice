package com.github.suraj.Abstract;

/**
 * @author 25-02-2022
 */

abstract public class Film {
   abstract void filmMusic();
    String Genre;
    String Title;
    public void backgroundScore(){
        System.out.print("Ready to create BGM for the selected movie");
    }

    Film(){
        System.out.println("Film is selected");
    }
}

class Fandry extends Film {
    public void filmMusic() {
        System.out.println("Film music for fandry");
    }

    Fandry(){
        System.out.println("Film fandry selected");
    }
}

    class Main{
        public static void main(String args[]){
            Fandry capernaum = new Fandry();
            capernaum.filmMusic();
        }
    }


