package com.stackRoute;

public class Movie {

    //Declaration
    Actor actor1;



    Actor actor2;
    Actor actor3;


    public Movie( Actor actor1, Actor actor2, Actor actor3) {

        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }


    // Setter

    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1 +
                ", actor2=" + actor2 +
                ", actor3=" + actor3 +
                '}';
    }



    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }
    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public void setActor3(Actor actor3) {
        this.actor3 = actor3;
    }

    //To String Method

}
