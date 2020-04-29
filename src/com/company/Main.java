package com.company;

public class Main {

    public static void main(String[] args) {
	int sum, i;

	sum=0;
	for(i=1; i<=256; ){
	    sum+=i;
	    i*=2;
    }
        System.out.println(sum);
    }
}
