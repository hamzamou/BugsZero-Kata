package com.adaptionsoft.games.model;

import java.util.ArrayList;

public class Round {

    ArrayList players;
    int[] places;
    int[] purses;
    boolean[] inPenaltyBox;

    public Round(ArrayList players, int[] places, int[] purses, boolean[] inPenaltyBox) {
        this.players = players;
        this.places = places;
        this.purses = purses;
        this.inPenaltyBox = inPenaltyBox;
    }

    public ArrayList getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList players) {
        this.players = players;
    }

    public int[] getPlaces() {
        return places;
    }

    public void setPlaces(int[] places) {
        this.places = places;
    }

    public int[] getPurses() {
        return purses;
    }

    public void setPurses(int[] purses) {
        this.purses = purses;
    }

    public boolean[] getInPenaltyBox() {
        return inPenaltyBox;
    }

    public void setInPenaltyBox(boolean[] inPenaltyBox) {
        this.inPenaltyBox = inPenaltyBox;
    }
}
