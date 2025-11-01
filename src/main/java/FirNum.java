class FirNum {

    public int calc(int n) {
        return n;
    }
}
class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();

        //Should be 10
        System.out.println(firTest.test(firNum, 10));

        //Should be 6
        System.out.println(new FirNumSum().calc(3));
        System.out.println(new FirNumSum().calc(84)); //3570
        System.out.println(new FirNumSum().calc(0)); // 0

        //Should be 120
        System.out.println(firTest.test(firNum, 5));
        System.out.println(new FirNumFactorial().calc(5));
    }
}
class FirNumSum extends FirNum {
    @Override
    public int calc(int n) {
        return n * (n + 1) / 2;
    }
}
class FirNumFactorial extends FirNum {

    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
        return result;
    }
}