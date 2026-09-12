using System;

class Program
{
    static void classifyWordLengths(string review)
    {
        string[] words = review.Split(' ');

        int shortCount = 0;
        int mediumCount = 0;
        int longCount = 0;

        for (int i = 0; i < words.Length; i++)
        {
            int length = words[i].Length;

            if (length >= 1 && length <= 4)
            {
                shortCount++;
            }
            else if (length >= 5 && length <= 8)
            {
                mediumCount++;
            }
            else
            {
                longCount++;
            }
        }

        Console.WriteLine("Short: " + shortCount +
                          " | Medium: " + mediumCount +
                          " | Long: " + longCount);
    }

    static void Main()
    {
        string review = "This movie was absolutely fantastic and thrilling";

        classifyWordLengths(review);
    }
}