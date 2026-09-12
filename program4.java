using System;

class Program
{
    static void analyzeInventory(int[] sectionA, int[] sectionB)
    {
        int totalA = 0;
        int totalB = 0;

        // Calculate total of Section A
        for (int i = 0; i < sectionA.Length; i++)
        {
            totalA += sectionA[i];
        }

        // Calculate total of Section B
        for (int i = 0; i < sectionB.Length; i++)
        {
            totalB += sectionB[i];
        }

        string status;

        if (totalA == totalB)
        {
            status = "Balanced";
        }
        else
        {
            status = "Not Balanced";
        }

        // Find highest quantity
        int highest = sectionA[0];
        string highestSection = "Section A";
        int highestIndex = 0;

        for (int i = 1; i < sectionA.Length; i++)
        {
            if (sectionA[i] > highest)
            {
                highest = sectionA[i];
                highestSection = "Section A";
                highestIndex = i;
            }
        }

        for (int i = 0; i < sectionB.Length; i++)
        {
            if (sectionB[i] > highest)
            {
                highest = sectionB[i];
                highestSection = "Section B";
                highestIndex = i;
            }
        }

        Console.WriteLine("Section A Total: " + totalA);
        Console.WriteLine("Section B Total: " + totalB);
        Console.WriteLine("Status: " + status);
        Console.WriteLine("Highest Quantity: " + highest +
                          " (" + highestSection +
                          ", Item " + highestIndex + ")");
    }

    static void Main()
    {
        int[] sectionA = { 20, 15, 30 };
        int[] sectionB = { 25, 10, 30 };

        analyzeInventory(sectionA, sectionB);
    }
}