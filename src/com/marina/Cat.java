package com.marina;

public class Cat extends Pet {


    public Cat(String name, int age) {
        super(name,age);
    }

    @Override
    public void voice() {
        System.out.println(getName()+ "is mjaykaet."+ " He is "+ getAge() + " years old.");
    }
}
