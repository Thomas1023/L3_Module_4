package threads;

// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 

import java.util.Random;

public class BruteForceCracker {
	static long code = (long)(new Random().nextDouble() * 1_000_000_000);
	
	static long startTime;
	static long endTime;
	static float elapsedTime;
	
	public static void main(String[] args) {
		System.out.println("Starting Brute Force Checker");
		
		
		int ctr = 0;
		while(!checkCode(ctr++));
		String fin = null;
		Thread[] t = new Thread[0];
		
		for(int i = 0; i<t.length; i++) {
			int x = i;
			int ped = 1000000000/t.length;
			t[i] = new Thread(()->{
				
				for(int g = x*ped; g<x*ped+ped; g++) {
					//System.out.println(g);
					if(checkCode(g)) {
						endTime = System.currentTimeMillis();
					}
				}
			});
			
			
		}
		startTime = System.currentTimeMillis();
		for(int i = 0; i<t.length; i++) {
			
			t[i].start();
		}
for(int i = 0; i<t.length; i++) {
			
			try {
				t[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		elapsedTime = (float)(endTime - startTime);
		elapsedTime /= 1000.f;
		System.out.println("Total time taken: " + elapsedTime + " seconds");
	}
	
	public static boolean checkCode(long p){
		if(p == code){
			return true;
		}else{
			return false;
		}
	}
}
