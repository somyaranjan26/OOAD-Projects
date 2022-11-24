public class Main {
    public static void main(String[] args) {

        Subway BMT = new ItalianSub();
        BMT.makeSandwich();

        System.out.println("");

        Subway VeggieDelite = new VeggieSub();
        VeggieDelite.makeSandwich();

    }
}