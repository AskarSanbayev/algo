package com.algorithm.askar.array;

import java.io.*;
import java.util.StringTokenizer;

public class ClockWiseMultiDimensionArray {
    static int number = 1;

    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
        MyScanner myScanner = new MyScanner("input.txt");
        int n = myScanner.nextInt();
        int arr[][] = new int[n][n];
        arr[0][0] = 1;
        boolean l = true;
        recursive(arr, 0, 0, l);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                printWriter.print(arr[i][j] + " ");
            }
            printWriter.println();
        }
        printWriter.close();


    }

    private static void recursive(int arr[][], int x, int y, boolean l) {
        if (y < arr.length - 1 && arr[x][y + 1] == 0 && l) {
            arr[x][++y] = ++number;
            recursive(arr, x, y, l);
        } else if (x < arr.length - 1 && arr[x + 1][y] == 0 && l) {
            arr[++x][y] = ++number;
            if (x == arr.length - 1 || arr[x + 1][y] != 0) {
                l = false;
            }
            recursive(arr, x, y, l);
        } else if (y > 0 && arr[x][y - 1] == 0 && !l) {
            arr[x][--y] = ++number;
            recursive(arr, x, y, l);
        } else if (x > 0 && arr[x - 1][y] == 0 && !l) {
            arr[--x][y] = ++number;
            if (x == 0 || arr[x - 1][y] != 0) {
                l = true;
            }
            recursive(arr, x, y, l);
        }
    }

    static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner(String txt) throws FileNotFoundException {
            FileInputStream fileInputStream = new FileInputStream(txt);
            br = new BufferedReader(new InputStreamReader(fileInputStream));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
