package Puzzle_1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args){
        String fullLine;
        String[] subLine;
        String[] firstIndex;
        String[] secondIndex;
        String secondNumber;
        String[] finalSecondNumber;
        String letter;
        String firstNumber;
        int letterCounter;
        int totalCorrectPasswords = 0;

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("Day 2\\Day 2\\src\\Puzzle_1\\Database"));
            while ((fullLine = reader.readLine()) != null){
                letterCounter = 0;
                subLine = fullLine.split(":");
                firstIndex = subLine[0].split("-");
                firstNumber = firstIndex[0];
                letter = subLine[0].substring(subLine[0].length() - 1);
                secondIndex = subLine[0].split(" ");
                secondNumber = secondIndex[0];
                finalSecondNumber = secondNumber.split("-");
                for (int i = 1; i < subLine[1].length(); i++) {
                    if (letter.equals(subLine[1].substring(i, i+1))){
                        letterCounter++;
                    }
                }
                if (letterCounter >= Integer.parseInt(firstNumber) &&
                        letterCounter <=Integer.parseInt(finalSecondNumber[1])){
                    totalCorrectPasswords++;
                }
            }
            System.out.println(totalCorrectPasswords);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}