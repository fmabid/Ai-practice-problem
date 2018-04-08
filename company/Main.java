package com.company;

public class Main {

    public static void main(String[] args) {
        SimulatedAnnealing simulatedAnnealing= new SimulatedAnnealing();

        int[] solution = simulatedAnnealing.solve(8,10000, 1000, 0.95);

        System.out.println("the solution to nQueen is: ");
        for (int i=0; i<solution.length; i++){
            System.out.print(solution[i]+" ");
        }

        System.out.println("the h value of soln is: "+simulatedAnnealing.h(solution));
    }
}
