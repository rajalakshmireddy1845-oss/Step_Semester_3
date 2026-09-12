using System;

class Program
{
    static void checkTypingAccuracy(string original, string typed)
    {
        int matched = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.Length; i++)
        {
            if (original[i] == typed[i])
            {
                matched++;
            }
            else if (firstMismatch == -1)
            {
                firstMismatch = i;
            }
        }

        double accuracy = ((double)matched / original.Length) * 100;

        Console.WriteLine("Matched: " + matched + "/" + original.Length);
        Console.WriteLine("Accuracy: " + accuracy.ToString("F2") + "%");

        if (firstMismatch == -1)
        {
            Console.WriteLine("No Mismatches");
        }
        else
        {
            Console.WriteLine("First Mismatch at position: " + firstMismatch);
        }
    }

    static void Main()
    {
        string original = "hello world";
        string typed = "hello worlt";

        checkTypingAccuracy(original, typed);
    }
}