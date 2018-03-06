package com.company;

public class State {
    private int left = 0;
    private int boat = 1;
    public int right = 2;
    private int boatCapacity;

    public static int man;
    public static int wolf;
    public static int cabbege;
    public static int goat;

    final int target;

    public State(int capacity, int target, int M, int W, int C, int G){
        this.boatCapacity = capacity;
        man = M;
        wolf = W;
        cabbege = C;
        goat = G;
        this.target=target;
    }

    void fillBoat(){
        if (man == left && goat == left) {
            man = boat;
            goat = boat;

            printState();
            putFromLeftToRoght();
        }
        if (man == boat && cabbege == left) {
            cabbege = boat;
            printState();
            putFromLeftToRoght();
        }
        if (man == boat && wolf == left) {
            wolf = boat;
            printState();
            putFromLeftToRoght();
        }

    }

    public void putFromLeftToRoght() {
        if (man==boat && goat == boat) {
            goat = right;
            printState();
        }
        else if (man==boat && cabbege == boat){
            cabbege = right;
            printState();
        }
        else if (man==boat && wolf == boat){
            man = right;
            wolf = right;
            printState();
        }
    }

    void printState() {
        System.out.println("M=" + man + " W=" + wolf + " C=" + cabbege + " G=" + goat);
    }


}
