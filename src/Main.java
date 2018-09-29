//Работу выполнил Шапошников Александр, группа 3110
public class Main {
    private final static int ROWS = 6, COLUMNS = 11;        //константы - 6 строк, 11 столбцов
    public static void main(String[] args)
    {
    int Arr[][];                        //объявление массива
    Arr = new int [ROWS][COLUMNS];      //формирование массива
        for(int i=0;i<ROWS;i++)
        {
            int counter = 4-i;           // счётчик, в 1 строке 5 нулей, во 2 строке 4 нуля и т.д.
            for (int j=0;j<COLUMNS;j++)
            {
                if(j<=counter||j>=10-counter)
                {
                    Arr[i][j]=(int)0;
                }
                else
                    Arr[i][j]=(int)1;

            }
        }
        for(int i=0;i<ROWS;i++)             //печатаь массива
        {
            for(int j=0;j<COLUMNS;j++)
            {
                if(Arr[i][j]==(int)0)
                {
                    System.out.print(' ');
                }
                else
                    System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}
