public class Main {
    public static void main(String[] args) {
        int countDivNum = 0;
        long INT_MAX = Long.MAX_VALUE;

        for (int i = 0; i < INT_MAX; i++) {
            if (i < 100) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        countDivNum++;
                    }
                }
                if (countDivNum == 2) {
                    System.out.println(i);
                }
                countDivNum = 0;
            } else {
                break;
            }
        }
    }
}