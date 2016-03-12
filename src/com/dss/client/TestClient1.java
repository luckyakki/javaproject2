package com.dss.client;
import com.dss.interfac.*;

public class TestClient1 implements Message {
	public void  morn(){
		System.out.println("good morning");}
		
   public void even(){
	   System.out.println("good evening");}
   
   public void gni(){
	   System.out.println("good night"); }
   
   public static void main(String[] args){
	   TestClient1 t5 = new TestClient1();
	   t5.morn();
	   t5.even();
	   t5.gni();
	   }
   }

   
	
	
