package exampleSnippet;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Solution {

    /*
     * Complete the 'getScoreDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY numSeq as parameter.
     */

    public static int getScoreDifference(List<Integer> numSeq) {
        // Write your code here
        int first=0, second=0;
        List<Integer> sum = new ArrayList<Integer>();
        sum.addAll(numSeq);
        for(int i=0;i<sum.size();i++){
            if(i%2==0)
            {
                first += sum.get(i);
                int temp = sum.get(i);
                sum.remove(i);
                i--;
                if(temp%2 ==0){
                    Collections.reverse(sum);

                }

            }
            else{
                second += sum.get(i);
                int temp = sum.get(i);
                sum.remove(i);
                i--;
                if(temp%2 ==0){
                    Collections.reverse(sum);
                }
            }
        }
        System.out.println("kk");
        return first-second;

    }

    public static void main(String[] args){
        System.out.println(Solution.getScoreDifference(Arrays.asList(2,1,4,3)));
    }

}



