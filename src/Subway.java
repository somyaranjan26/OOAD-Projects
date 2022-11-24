public abstract class Subway {

    final void makeSandwich() {
        cutBread();
        if (customerWantsMeat()) {
            addMeat();
        }
        if (customerWantsCheese()) {
            addCheese();
        }
        if (customerWantsVeggies()) {
            addVeggies();
        }
        if (customerWantsCondiments()) {
            addCondiments();
        }
        wrapBread();
    }

    public void cutBread() {
        System.out.println("The Bread is Cut.");
    }
    abstract void addMeat();
    abstract void addCheese();
    abstract void addVeggies();
    abstract void addCondiments();
    public void wrapBread() {
        System.out.println("The Bread is wrapped");
    }

    boolean customerWantsMeat() { return true; }
    boolean customerWantsCheese() { return true; }
    boolean customerWantsVeggies() { return true; }
    boolean customerWantsCondiments() { return true; }

}
