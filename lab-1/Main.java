package com.company;

public class Main {
    public static void stepsNeeded(State state){
        state.fillBoat();

        while((State.man != state.target && State.cabbege != state.target)
                || (State.man != state.target && State.goat != state.target)
                || (State.man != state.target && State.wolf != state.target)
                || State.man != state.target){

            state.putFromLeftToRoght();

            if(State.man == state.target){
                break;
            }
            if(State.man == 0){
                state.fillBoat();
            }
        }
    }

    public static void main(String[] args) {
        State state = new State(2,2,0,0,0,0);
        state.printState();
        stepsNeeded(state);
    }
}
