using System;

class Program
{
    static void findLongestStreak(string signalLog)
    {
        char currentChar = signalLog[0];
        int currentCount = 1;

        char longestChar = currentChar;
        int longestCount = 1;

        for (int i = 1; i < signalLog.Length; i++)
        {
            if (signalLog[i] == currentChar)
            {
                currentCount++;
            }
            else
            {
                currentChar = signalLog[i];
                currentCount = 1;
            }

            if (currentCount > longestCount)
            {
                longestCount = currentCount;
                longestChar = currentChar;
            }
        }

        Console.WriteLine("Longest Streak: '" + longestChar +
                          "' repeated " + longestCount + " times");
    }

    static void Main()
    {
        string signalLog = "RRRGGYYRR";

        findLongestStreak(signalLog);
    }
}