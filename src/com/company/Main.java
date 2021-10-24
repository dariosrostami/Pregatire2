package com.company;
import java.io.*;
class DariosTime {
    private int hours;
    private int minutes;
    private int seconds;

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getMinutes() {
        return this.minutes;
    }
    public int setMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    DariosTime(int seconds){
        this.hours = seconds/3600;
        seconds = seconds%3600;
        this.minutes = seconds/60;
        seconds = seconds%60;
        this.seconds = seconds;
    }
    public void afisareTimp()
    {
        System.out.println("ora este: " + this.hours + " ore, " + this.minutes + " minute, " + this.seconds + " secunde");
    }
}
class Dreptunghi {
    int lungime;
    int latime;

    Dreptunghi(int lungime, int latime){
        this.lungime = lungime;
        this.latime = latime;
    }
    int getArie(){
        int arieDreptunghi;
        arieDreptunghi = lungime*latime;
        return arieDreptunghi;

    }
    int getPerimetru (){
        return 2*(latime+lungime);
    }

    public void afisareDreptunghi(){
        System.out.println("Aria este: " + getArie() + ". Perimetrul este: " + getPerimetru() + ".");
    }
}
public class Main {
    public static void main(String[] args) {
//        DariosTime DT = new DariosTime(3800);
//        DT.afisareTimp();
        Dreptunghi x;
        x = new Dreptunghi(5, 8);
        x.afisareDreptunghi();
    }
}
