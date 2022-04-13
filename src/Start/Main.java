// stationOne

package Start;
public class Main {
    static float numOne = -10.07f;
    static int   randNum = (int) (Math.random() * 100);
    static Methods methods = new Methods();
    public static void main(String[] args) {
        methods.looperOne(randNum);
        methods.printer(numOne);
        methods.adder(randNum);
        methods.printer(numOne);
        methods.printer(randNum);
        methods.testerOne(randNum);
        methods.testerTwo(randNum);
        methods.testerThree(randNum);
        methods.sumRekShow(randNum);
        methods.randomizer();
    }
}