package com.zhou.jvm;

public class TestUseTLAB {
     public static void allocdemo(){
    	 byte[] by = new byte[2];
    	 by[0] = 1;
     }
     
     public static void main(String[] args){
    	 long startTime = System.currentTimeMillis();
    	 for(int i = 0;i<10000000;i++){
    		 allocdemo();
    	 }
    	 long endTime = System.currentTimeMillis();
    	 System.out.println(endTime-startTime);
     }
}