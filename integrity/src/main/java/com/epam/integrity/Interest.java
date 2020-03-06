package com.epam.integrity;
class Interest{
    double principle;
    double rate;
    double time;
    Interest(double p,double r,double t){
        this.principle=p;
        this.rate=r;
        this.time=t;
        }
    String getSimpleinterest(){
        return "Rs"+String.format("%.2f", (principle*time*rate)/100);
    }
    String getCompoundInterest(){
        return "Rs"+String.format("%.2f",principle * Math.pow(1.0+rate/100.0,time) - principle);
    }
}
