public class Main {
    public static void main(String[] args) {

        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumber();
        Chain chainCalc3 = new MultiplyNumbers();
        Chain chainCalc4 = new DivideNumbers();
//        Chain chainCalc5 = new PowerNumbers();


        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);
//        chainCalc4.setNextChain(chainCalc5);
//      chainCalc5.setNextChain(chainCalc1); we are not doing this because, it will invoke an infinite loop.


        Numbers request = new Numbers(10,2, "div");

        chainCalc1.calculate(request);

//      Let's try to add power functionality to the program

    }
}