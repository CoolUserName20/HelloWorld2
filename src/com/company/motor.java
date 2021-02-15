package com.company;

public class motor {
    private String motorName;
    private int motorPower;

    public motor(String motorName, int motorPower) {
        this.motorName = motorName;
        this.motorPower = motorPower;
    }

    public String getMotorName() {
        return motorName;
    }

    public void setMotorName(String motorName) {
        this.motorName = motorName;
    }

    public void testMethod() {
         for (int i=0; i< motorName.length(); i++) {
             if (motorPower == 2) {
                 break;
                 //System.out.print(1);
             }
         }
    }
}
