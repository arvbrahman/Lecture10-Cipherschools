class A{

    final int noOfAlphabets=26; //Final variables - values assigned once cannot be changed
    final int noOfDigits;
    // Either assign values to final  variables at the time of declaration or in constructor

    A(){
        noOfDigits=10;
    }

    final void fun(){  
        System.out.println("Hi I'm a function in A");
    }
}


final class B extends A{   // Final classes cannot be inherited
    // void fun(){
    //     System.out.println("I'm function in B overriding function in A");
    // }
}

// class C extends B{

// }

public class FinalStudy {
    public static void main(String[] args) {
        
    }
}
