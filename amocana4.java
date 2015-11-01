

import java.util.ArrayList;
import java.util.Scanner;

public class amocana4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int spec = scanner.nextInt();
        System.out.println(spec);
        ArrayList masivi = new ArrayList();

        while(true) {
            int winaElementi = scanner.nextInt();
            if(spec == winaElementi) {
                scanner.close();
                winaElementi = 0;
                int counter = -1;
                int cikli = -1;
                int maxCounter = 0;
                System.out.println(masivi);

                for(int i = 0; i < masivi.size(); ++i) {
                    if(counter < cikli) {
                        if(maxCounter < counter) {
                            maxCounter = counter;
                        }

                        counter = 0;
                        cikli = 0;
                    }

                    ++cikli;
                    if(((Integer)masivi.get(i)).intValue() > winaElementi) {
                        ++counter;
                    }

                    winaElementi = ((Integer)masivi.get(i)).intValue();
                    if(maxCounter < counter) {
                        maxCounter = counter;
                    }
                }

                System.out.println(maxCounter + 1);
                return;
            }

            masivi.add(Integer.valueOf(winaElementi));
        }
    }
}
