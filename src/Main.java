public class Main {
    public static void main(String[] args) {
        /*Integer*/
        CommonClass<Integer> ic = new CommonClass<>(10);
        ic.setWrapper(20);
        ic.print();

        /*Double*/
        CommonClass<Double> dc = new CommonClass<>(45.25);
        dc.setWrapper(32.58);
        dc.print();

        /*Boolean*/
        CommonClass<Boolean> bc = new CommonClass<>(true);
        bc.setWrapper(false);
        bc.print();

    }
}
