package com.FrancisExer_02_GuessNumbersPropertiesTest;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        Random r = new Random();
        int number = r.nextInt(10) + 1;

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入要猜的数字");
            int guessNumber = sc.nextInt();

            if (guessNumber > number) {
                System.out.println("猜大了");
            } else if (guessNumber < number) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }


}
