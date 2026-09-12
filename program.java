using System;

class Program
{
    static void checkDuplicateSeats(int[] seatNumbers)
    {
        bool found = false;

        for (int i = 0; i < seatNumbers.Length; i++)
        {
            for (int j = i + 1; j < seatNumbers.Length; j++)
            {
                if (seatNumbers[i] == seatNumbers[j])
                {
                    Console.WriteLine("Duplicate Seat Number Found: " + seatNumbers[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found)
        {
            Console.WriteLine("No Duplicate Seats Found");
        }
    }

    static void Main()
    {
        int[] seats = { 101, 102, 103, 102, 105 };

        checkDuplicateSeats(seats);
    }
}
