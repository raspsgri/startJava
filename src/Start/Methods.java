// stationOne

package Start;
public class Methods {
    void printer(float x) {

        System.out.println(Math.abs(x));
    }
    void adder(int x) {

        Main.numOne += x;
    }
    void randomizer() {

        Main.randNum = (int) (Math.random() * 100);
    }
    void testerOne(float x) {
        if (x > 50.0) {
            System.out.println("Bo");
        }else{
            System.out.println("Ku");
        }
    }
    void testerTwo(float x) {
        int r  = (x>50) ? 1 : 0;
        System.out.println(r);
    }
    void testerThree(float x) {
        boolean r  = x > 50;
        System.out.println(r);
    }
    void looperOne(int x) {

        System.out.println("Random startNumber -> " + x);
        int m = Main.randNum;
        while (m > 0) {
            System.out.println(m);
            m --;
        }
    }
    int  sumRek(int k) {
        if (k > 0) {
            return k + sumRek(k - 1);
        } else {
            return 0;
        }
    }
    void sumRekShow(int x) {
        int result;
        result = sumRek(x);
        System.out.println("sumRek: " + result);
    }
}

