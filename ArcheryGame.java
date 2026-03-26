package com.Archery;

import java.util.Scanner;

public class ArcheryGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double targetDistance = 100; // fixed target
        boolean gameRunning = true;

        System.out.println("🏹 Archery Game (Console)");
        System.out.println("Hit the target at distance 100!");

        while (gameRunning) {

            System.out.print("\nEnter angle (in degrees): ");
            double angle = sc.nextDouble();

            System.out.print("Enter power (1–50): ");
            double power = sc.nextDouble();

            // Convert angle to radians
            double rad = Math.toRadians(angle);

            // Simple projectile formula (range)
            double range = (power * power * Math.sin(2 * rad)) / 9.8;

            System.out.println("Arrow landed at distance: " + (int)range);

            // Check hit (±10 tolerance)
            if (range >= targetDistance - 10 && range <= targetDistance + 10) {
                System.out.println("🎯 HIT! You win!");
                gameRunning = false;
            } else {
                System.out.println("❌ Miss! Try again.");
            }
        }

        sc.close();
    }
}