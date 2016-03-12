package com.dss.client;
import com.dss.helper.*;
public class TestClient2 extends Helper{
	public void  morn(){
		System.out.println("good morning");}
		
   public void even(){
	   System.out.println("good evening");}
   
   public static void main(String[] args){
	   TestClient2 t6 = new TestClient2();
	   t6.morn();
	   t6.even();
	   t6.gni();
   }
}