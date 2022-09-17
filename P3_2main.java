package Nihar;
import java.util.Vector;

public class P3_2main {
    public static void main(String[] args) {
        P3_2 d[] = new P3_2[5];
        d[0] = new P3_2();
        d[1] = new P3_2();
        d[2] = new P3_2();
        d[3] = new P3_2();
        d[4] = new P3_2();
        Vector<P3_2> object1 = new Vector<>();
        object1.add(d[0]);
        object1.add(d[1]);
        object1.add(d[2]);
        object1.add(d[3]);
        object1.add(d[4]);
        for (int i = 0; i < 5; i++) {
            d[i].getPersonalDetails();
            d[i].getJobDetails();
            System.out.println("\n");
        }
        for (int j = 0; j < 5; j++) {
            d[j].displayPersonalDetails();
            d[j].displayJobDetails();
        }
        System.out.println("This program is made by 21CE100");
    }
}