package com.Bridgelabz.Day5;

public class EmpWageBuilderUC2 {
    public static void main(String[] args) {
        int IS_PART_TIME = 1 ;
        int IS_FULL_TIME = 2 ;
        int Emp_Rate_Per_Hr = 20 ;
        int empHrs = 0 ;
        int empwage = 0;
        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == IS_PART_TIME)
            empHrs = 4;
        else if (empcheck == IS_FULL_TIME )
            empHrs = 8;
        empwage = empHrs * Emp_Rate_Per_Hr ;
        System.out.println("Emp wage :" +empwage);

    }
}
