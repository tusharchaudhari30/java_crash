package com.tushar;

import java.sql.Connection;

// A Java program to illustrate Dynamic Method
// Dispatch using hierarchical inheritance
class A
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}

class B extends A
{
    @Override
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}

class C extends A
{
    @Override
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}

// Driver class
class Dispatch
{
    public static void main(String args[])
    {

        A a = new A();
        B b = new B();
        C c = new C();
        a.m1();
        b.m1();
        c.m1();

        A polyb= new B();
        A polyc= new C();

        System.out.println("poly begin");
        polyb.m1();
        polyc.m1();
        polyb= new C();
        System.out.println("Polyb morphed");
        polyb.m1();

    }
}