import java.util.Arrays;
import java.util.Random;



public class TestTableau {
    void main() {
        Random r = new Random();
        int[] Tab = new int[100];
        for (int i = 0; i < 100; i++) {
            Tab[i] = r.nextInt(100, 200);
            System.out.println(Tab[i]);

        }
        System.out.println("la somme est :" + Arrays.stream(Tab).sum());
        int min=Tab[0];
        for (int i=0;i<100;i++){
            if(Tab[i]<min){
               min=Tab[i];
            }


        }
        System.out.println(min);

        System.out.println("le maximum est :" + Arrays.stream(Tab).max().orElse(Integer.MAX_VALUE));
        System.out.println("le minimumm est :" + Arrays.stream(Tab).min().orElse(Integer.MIN_VALUE));
        int[] occu = new int[201];
        for (int num : Tab) {
            occu[num]++;
        }
        for (int i = 100; i < 201; i++) {
            if (occu[i] == Arrays.stream(occu).max().orElse(Integer.MAX_VALUE)) {
                System.out.println(i + ":" + occu[i]);
            }
        }

    }
}
