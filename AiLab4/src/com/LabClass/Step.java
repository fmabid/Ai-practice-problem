package com.LabClass;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Step {

    HashSet<State> uniqueStates;

    void letsRoll() {

        int inp, fnl;

        int pls1 = 1;
        int pls2 = 2;
        int mulT3 = 3;
        int div4 = 4;

        Scanner sc=new Scanner(System.in);

        System.out.print("Initial state = ");
        inp = sc.nextInt();
        System.out.print("Final state = ");
        fnl = sc.nextInt();

        State initialState = new State(inp);
        State finalState = new State(fnl);
        State finalPath = null;

        uniqueStates = new HashSet<>();

        /*
         * Change queue to stack to convert to DFS
         */
        LinkedList<State> queue = new LinkedList<>();
        queue.add(initialState);

        while (!queue.isEmpty()) {
            State currState = queue.poll();
            if (currState.equals(finalState)) {
                finalPath = currState;
                break;
            }


        }
        if (finalPath != null) {
            System.out.println("J1  J2");
            System.out.println(finalPath);
        }
        else{
            System.out.println("Not Possible");

        }
    }

    /*
     * Checks whether State toCheck has been generated before, if not it is
     * added to queue and uniqueStates Set
     */
    void checkUniqueStates(HashSet<State> uniqueStates, State toCheck,
                           LinkedList<State> queue) {
        if (!uniqueStates.contains(toCheck)) {
            uniqueStates.add(toCheck);
            queue.add(toCheck);
        }
    }

    public static void main(String[] args) {
        new Step().letsRoll();
    }
}
