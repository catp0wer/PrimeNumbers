package com.company;

import java.util.ArrayList;
import java.util.List;

public class PrimeN {

    public void determinePrimeNum(int n){

        List<Integer> my_array = new ArrayList<Integer>();
       // int n=10;

        for (int i = n-1; i< n; i--){
            for (int j = i-1;j>0; j--){
                if(i%j == 0 && j!=1) {
                    break;
                }else if(j==1){
                    my_array.add(i);

                }
            }
        }
        System.out.println(my_array);



    }
}
