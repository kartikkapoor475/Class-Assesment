/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kartik
 */
import java.util.*;
public class Subarray 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int arr[]={10,20,30,40,50};
       int n=sc.nextInt();
       int k=sc.nextInt();
       int count=0;
       int sub=n+1-k;
       count=(sub*(sub+1))/2;
       System.out.println(count);
          
               
       
       
       
    }
    
}
