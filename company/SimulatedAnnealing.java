package com.company;

import java.util.Random;

/**
 * Created by student on 4/8/2018.
 */
public class SimulatedAnnealing {
    Random random=new Random();

    //IMPLEMENT THIS
    public int[] solve(int n, int maxIterations, double initialTemperature, double coolingFactor){
        int[] current = this.generateRandomBoard(n);

        for (int i=0; i<maxIterations; i++) {
            double T = schedule(initialTemperature, i, coolingFactor);

            if (T == 0) {
                return current;
            } else {
                int[] next = this.successorOfCurrent(n, current);

                int E = this.h(next) - this.h(current);

            }
        }

        return current;
    }

    public int h(int[] board){
        int attacks=0;
        for (int i=0; i<board.length; i++){
            int column1=i;
            int row1=board[column1];
            for (int j=0; j<board.length; j++){
                int column2=j;
                if (column1==column2){continue;}
                int row2=board[column2];
                if(row1==row2){++attacks;}
                int rowDifference=Math.abs(row1-row2);
                int columnDifference=Math.abs(column1-column2);
                if(rowDifference==columnDifference){++attacks;}
            }
        }
        return -(attacks/2);
    }//DO NOT TOUCH


    private double schedule(double t0, int counter, double coolingFactor){//IMPLEMENT THIS
        double tk=0;

        tk = t0 * Math.pow(coolingFactor,counter);

        return tk;
    }

    private int[] successorOfCurrent(int n, int[] current){//IMPLEMENT THIS
        int[] next=new int[n];

        next = this.generateRandomBoard(n);

        if (next == current) {
            next = this.generateRandomBoard(n);
        }

        return next;
    }

    private int[] generateRandomBoard(int n){
        int[] board=new int[n];
        for (int i=0; i<n; i++){
            board[i]= random.nextInt(n);
        }
        return board;
    }//DO NOT TOUCH
}
