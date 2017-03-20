package com.tab.tablice_zadania;

public class Main {

    public static void main(String[] args) {

        int n = 10, i, j, suma;
        int tablica[][] = new int[n][n];

        for (i=0; i<n; i++)
        {
            for (j=0; j<n; j++)
            {
                if (j == 0) tablica[i][j] = i;
                if (j == 1) tablica[i][j] = i*i;
                if (j > i) tablica[i][j] = 0;
            }
        }
        for (i=0; i<n; i++)
        {
            for (j=0; j<n; j++)
            {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        suma = 0;

        for(i=0; i<n; i++)
        {
            suma = suma+tablica[i][0];
        }
        System.out.println("Suma liczb znajdujących się w pierwszej kolumnie to "
                + suma);

        suma = 0;

        for (i=0; i<n; i++)
        {
            suma = suma + tablica[i][1];
        }
        System.out.println("Suma liczb znajdujacych sie w drugiej kolumnie to "
                + suma);

    }
}
