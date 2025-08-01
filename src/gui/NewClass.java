/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Mcacisi Sithole
 */
public class NewClass {
    public static void main(String[] args) {
        //MARK TESTER
        int mark1,mark2,mark3;
        double avg;
        double percentage;
        double finalMark;
        
        mark1=19;
        mark2=88;
        mark3=72;
        
        avg = (mark1+mark2+mark3)/300.0;
        System.out.println("avg = "+ avg);
        
        percentage = avg*100.0;
        System.out.println("perc = " + percentage);
       
        finalMark = (int)Math.round(percentage);
        System.out.println("Final mark = " + finalMark);
    }
}
