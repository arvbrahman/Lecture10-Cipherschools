class Loan{
    int rate;

    Loan(){
        System.out.println("Hi, I'm default constructor of Loan");
    }

    Loan(int rate){
        this.rate=rate;
    }

    void printRate(){
        System.out.println(this.rate);
    }
}

class carLoan extends Loan{
    int rate;

    carLoan(){
        System.out.println("Hi, I'm default constructor of carLoan");
        System.out.println(super.rate);  //To refer instance variable of parent class
    }

    carLoan(int rate){
        super(7);  //To invoke constructor of parent class
        this.rate=rate;
    }

    void printRate(){
        System.out.println(this.rate);
        super.printRate();  //To invoke methods of parent class
        System.out.println(super.rate);
    }
}
public class SuperStudy {
    public static void main(String[] args) {
        carLoan cl2 = new carLoan();
        carLoan cl = new carLoan(8);
        cl.printRate();

        
    }
    
}