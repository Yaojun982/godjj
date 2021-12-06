package com.yao;
import java.util.Random;

public class RollingDice {
    public static void main(String[] args) {
        Random random = new Random();
        int[] dices = new int[6];
        for (int i = 1; i < 11; i++){
            int number = random.nextInt(6)+1;
            System.out.println("(" + i + ")" + number);

            switch (number){
                case 1:
                    dices[0]++;
                    break;
                case 2:
                    dices[1]++;
                    break;
                case 3:
                    dices[2]++;
                    break;
                case 4:
                    dices[3]++;
                    break;
                case 5:
                    dices[4]++;
                    break;
                case 6:
                    dices[5]++;
                    break;
                default:
                    System.out.println("end");
                    System.out.println(number);

            }

        }
        for(int j = 0; j<dices.length;j++){
            System.out.println(j+1 + " -> " + dices[j] + " times");
        }

    }
}