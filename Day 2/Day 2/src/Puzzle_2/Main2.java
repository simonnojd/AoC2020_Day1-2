package Puzzle_2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main2 {

    public static void main(String[] args){

        String fullLine;
        String[] subLine;

        String[] firstIndex;
        String[] secondIndex;

        String secondNumber;
        String[] finalSecondNumber;

        char letter;
        
        String firstNumber;
        int totalCorrectPasswords = 0;


        try {

            BufferedReader reader = new BufferedReader(
                    new FileReader("Day 2\\Day 2\\src\\Puzzle_1\\Database"));

            while ((fullLine = reader.readLine()) != null){

                subLine = fullLine.split(":");

                firstIndex = subLine[0].split("-");

                firstNumber = (firstIndex[0]);

                letter = subLine[0].charAt(subLine[0].length() - 1);

                secondIndex = subLine[0].split(" ");
                secondNumber = secondIndex[0];

                finalSecondNumber = secondNumber.split("-");

                if (letter == (subLine[1].charAt(Integer.parseInt(firstNumber))) &&
                        letter != (subLine[1].charAt(Integer.parseInt(finalSecondNumber[1])))){
                    totalCorrectPasswords++;
                } else if (letter == (subLine[1].charAt(Integer.parseInt(finalSecondNumber[1]))) &&
                        letter != (subLine[1].charAt(Integer.parseInt(firstNumber)))){
                    totalCorrectPasswords++;
                }
            }

            System.out.println(totalCorrectPasswords);
            
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
