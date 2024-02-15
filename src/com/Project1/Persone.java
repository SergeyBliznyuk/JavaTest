package com.Project1;

public class Persone implements HumanInterface, UFOInterface {

    private final int age;
    private Perconality sex;

    Persone(int age, Perconality se) {
        this.age = age;
        this.sex = se;}

    @Override
    public void talk() {
        System.out.println("I CAN talk");     }

    @Override
    public void walk() {
        System.out.println("I CAN walk");     }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public Perconality getPerson() {
        return this.sex;
    }

    @Override
    public void alienTalk() {
        System.out.println("I CANNOT talk");     }

    @Override
    public void alienWalk() {
        System.out.println("I CANNOT walk");     }

}
