package com.alex;

public class Main {

    public static void main(String[] args) {
	for(int j = 0; j<100; j++){
	    if (isPrime(j+5) && j+1==3){
            System.out.println((j+5) + " is prime number, count " + (j+1));
            break;}
	    else if(isPrime(j+5)){
            System.out.println((j+5) + " is prime number, count " + (j+1));}



    }
    }


    public static boolean isPrime(int n) {
        if (n==1){return false;}

        for(int i=2; i<=n/2; i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }


}
