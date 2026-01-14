public class Gugudan {
    public static void main(String[] args) {

        for (int dan = 1; dan <= 9; dan += 3) {
            System.out.printf("\n--- %d단 ~ %d단 ---\n", dan, dan + 2);

            // 해당 묶음 내의 각 단(dan, dan+1, dan+2)의 곱셈 출력
            for (int i = 1; i <= 9; i++) {
                for (int j = 0; j < 3; j++) {
                    int currentDan = dan + j;
                    if (currentDan <= 9) { // 9단까지만 출력
                        System.out.printf("%d X %d = %2d  ", currentDan, i, currentDan * i);
                    }
                }
                System.out.println(); // 한 행(1~9)이 끝나면 줄바꿈
            }
        }
    }
}