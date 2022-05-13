public class CounterMain {
    public static void main(String[] args){
        Counter newNum = new Counter();
        System.out.println("The value is: " + newNum);
        newNum.increase();
        System.out.println("The value increased by 1: " + newNum);
        newNum.decrease();
        System.out.println("The value decreased by 1: " + newNum);
        newNum.increase(6);
        System.out.println("The value increased by num = " + newNum);
        newNum.decrease(4);
        System.out.println("The value decreased by num = " + newNum);

        Counter newNum2 = new Counter(8);
        System.out.println("The value is: " + newNum2);
        newNum2.increase();
        System.out.println("The value increased by 1: " + newNum2);
        newNum2.decrease();
        System.out.println("The value decreased by 1: " + newNum2);
        newNum2.increase(-1);
        System.out.println("The value increased by num = " + newNum2);
        newNum2.decrease(-2);
        System.out.println("The value decreased by num = " + newNum2);

    }
}
