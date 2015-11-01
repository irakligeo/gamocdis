
    import java.util.Scanner;

    public class amocana2 {
        public amocana2() {
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] arr = new int[5];

            for(int i = 0; i < arr.length; ++i) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(checkTwoPairCategory(arr));
        }

        private static Boolean checkTwoPairCategory(int[] dice) {
            int[] arr = new int[7];

            int counter;
            for(counter = 0; counter < dice.length; ++counter) {
                ++arr[dice[counter]];
            }

            counter = 0;

            for(int i = 0; i < arr.length; ++i) {
                if(arr[i] == 2) {
                    ++counter;
                }
            }

            if(counter == 2) {
                return Boolean.valueOf(true);
            } else {
                return Boolean.valueOf(false);
            }
        }
    }

