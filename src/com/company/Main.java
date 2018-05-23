package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.print("Please enter any integer positive number: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
            int n = Integer.parseInt(reader.readLine());
            int countDivider = 0;
            StringBuilder resultString = new StringBuilder();
            for (int i = 2; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        countDivider++;
                    }
                }
                if (countDivider == 2) {
                    resultString.append(i + ", ");
                }
                countDivider = 0;
            }
            System.out.println(resultString.substring(0, resultString.length() - 2) + ".");
        } catch (NumberFormatException e) {
            System.out.println("ERROR! You entered incorrect data.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}