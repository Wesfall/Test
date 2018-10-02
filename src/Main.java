public class Main {
    private final static int ROWS = 5, COLUMNS = 11;        //константы - 6 строк, 11 столбцов

    public static void main(String[] args) {
        for (int i = 0; i < ROWS; i++) {
            int countStarsInRow = ROWS - i;
            for (int j = 0; j < COLUMNS; j++) {
                if (j < countStarsInRow || j >= COLUMNS - countStarsInRow) {
                    System.out.print(' ');
                } else {
                    System.out.print('*');
                }
            }
            System.out.print('\n');
        }
    }
}
