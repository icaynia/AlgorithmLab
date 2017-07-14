package T01_BubbleSort;

import java.io.IOException;

/**
 * Created by icaynia on 2017. 7. 15..
 */

public class Main
{
    public static void main(String[] args) throws IOException
    {
        int[] array = {1, 3, 7, 6, 9, 11, 4, 6, 2, 99, 12};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.run(array);

        Printer printer = new Printer();
        printer.print(sortedArray);
    }
}

class BubbleSort
{
    public int[] run(int[] args)
    {
        for (int i = 0; i < args.length - 1; i++)
        {
            for (int j = i; j < args.length; j++)
            {
                if (args[i] > args[j])
                {
                    int temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        return args;
    }
}

class Printer
{
    public void print(int[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            System.out.print(args[i] + " ");
        }
        System.out.println();
    }
}