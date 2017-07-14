package T02_SelectionSort;

import java.io.IOException;

/**
 * Created by icaynia on 2017. 7. 15..
 */
public class Main
{
    public static void main(String[] args) throws IOException
    {
        int[] array = {1, 65, 34 ,14 ,62, 7, 2, 77, 143};
        SelectionSort selectionSort = new SelectionSort();
        int[] sortedArray = selectionSort.run(array);
        Printer printer = new Printer();
        printer.print(sortedArray);
    }
}

class SelectionSort
{
    public int[] run(int[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            int minIndex = i;
            for (int j = i + 1; j < args.length; j++)
            {
                if (args[i] > args[j])
                {
                    minIndex = j;
                }
            }
            Swap.swap(args, minIndex, i);
        }
        return args;
    }
}

class Swap
{
    public static void swap(int[] args, int indexA, int indexB) {
        int temp = args[indexA];
        args[indexA] = args[indexB];
        args[indexB] = temp;
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
    }
}