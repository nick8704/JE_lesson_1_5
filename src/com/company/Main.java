package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        System.out.print("Please enter any integer positive number: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            int n = Integer.parseInt(reader.readLine());
            StringBuilder resultString = new StringBuilder();
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    resultString.append(i).append(", ");
                }
            }
            System.out.println(resultString.substring(0, resultString.length() - 2) + ".");
        } catch (NumberFormatException e) {
            System.out.println("ERROR! You entered incorrect data.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}