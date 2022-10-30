package com.company.Задание3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double m = sc.nextInt();
        PotentialEnergy energy1 = new PotentialEnergy(h,m);
        double o = energy1.energy(h,m,PotentialEnergy.g);
        System.out.println(o);
    }
}
