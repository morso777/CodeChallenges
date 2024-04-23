package org.example;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        fizzbuzz(10);
    }
    public static List<String> fizzbuzz(int n) {
        List<String> results = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String result = "";
            if (i % 3 == 0) {
                result += "Fizz";
            }
            if (i % 5 == 0) {
                result += "Buzz";
            }
            if (result.isEmpty()) {
                results.add(Integer.toString(i));
            } else {
                results.add(result);
            }
        }
        System.out.println(results);
        return results;
    }
}
