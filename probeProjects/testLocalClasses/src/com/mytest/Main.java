package com.mytest;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Global {
    class Cyclic {}
    void foo() {
        new Cyclic(); // create a Global.Cyclic
        class Cyclic1 extends Cyclic {} // circular definition
        {
            class Local {}
            {
                class Local2 {} // compile-time error
            }
            class Local3 {} // compile-time error
            class AnotherLocal {
                void bar() {
                    class Local {} // ok
                }
            }
        }
        class Local {} // ok, not in scope of prior Local
    }
}
