/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcacisi;

/**
 *THIS IS A PROTOTYPE PROGRAM TO IMPROVE MY BASIC JAVA SKILLS
 * STUDENT MARK RECORDER FOR STUDENT TO STORE MARKS & CHECK THEIR OWN PROGRESS IN EACH MODULE
 * @author Mcacisi Sithole
 */
public class Student {
    
    private String studNo;
    private String initials;
    private String surname;
    private String Module;
    private int mark1, mark2, mark3;  
    private int finalMark;
    private String Admission;
    
    
    public Student(String studNo, String initials, String surname, String module, int mark1, int mark2, int mark3,int finalMark, String Admission){
      this.studNo = studNo;
      this.initials = initials;
      this.surname = surname;
      this.Module = module;
      this.mark1 = mark1;
      this.mark2 = mark2;
      this.mark3 = mark3;
      this.finalMark = finalMark;
      this.Admission = Admission;
    }

    public String getStudNo() {
        return studNo;
    }

    public String getInitials() {
        return initials;
    }

    public String getSurname() {
        return surname;
    }

    public String getModule() {
        return Module;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public int getFinalMark() {
        return finalMark;
    }

    public String getAdmission() {
        return Admission;
    }

    

    public void setStudNo(String studNo) {
        this.studNo = studNo;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setModule(String Module) {
        this.Module = Module;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    public void setTotalMark(int finalMark) {
        this.finalMark = finalMark;
    }

    public void setAdmission(String Admission) {
        this.Admission = Admission;
    }
   
    
    @Override
    public String toString(){
        return studNo + "\t" + initials + "\t" + surname + "\t" + Module + "\t" + mark1 + "\t" +
                mark2 + "\t" + mark3 + "\t" + finalMark + "\t" + Admission ;
    }
}
