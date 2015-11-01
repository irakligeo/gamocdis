
import java.util.ArrayList;
import java.util.Scanner;

public class amocana3 {
    public amocana3() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
        System.out.println(parseInt(st));
    }

    private static int parseInt(String st) {
        ArrayList masivi = new ArrayList();
        int counter = 0;
        boolean k = false;
        int sum = 0;

        int i;
        for(i = st.length() - 1; i >= 0; --i) {
            int var6 = st.charAt(i) - 48;
            masivi.add(Integer.valueOf(var6));
        }

        for(i = 0; i < masivi.size(); ++i) {
            sum = (int)((double)sum + (double)((Integer)masivi.get(i)).intValue() * Math.pow(10.0D, (double)counter));
            ++counter;
        }

        return sum;
    }
}

