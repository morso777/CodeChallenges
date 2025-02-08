package org.example;

public class ReturnNumbersAdded {

    public static void main (String [] args){
        String input = "abc123";
        int suma=0;
        int number= 0;

        for(int i= 0; i<input.length(); i++){
            char ch = input.charAt(i);

            if(Character.isDigit(ch)){
                number+= Character.getNumericValue(ch);
                suma+=number;
            }
        }
        System.out.println(" The sum of numbers returned is : " + suma);
    }
}
