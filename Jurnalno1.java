/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnalno1;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnalno1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner s = new Scanner (System.in);
	System.out.println ("Masukkan Angka : ");
	
	int b =0;
	int c =1;
	int a =s.nextInt();
	for(int i =1 ; i<=a; i++){
	System.out.print(c+" ");
	c=c+b;
	b=c-b;
	}
    }
}
