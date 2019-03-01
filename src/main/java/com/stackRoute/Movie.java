package com.stackRoute;

public class Movie {

    //Declaration



    Actor actor;

    // Setter

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    //To String Method

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
