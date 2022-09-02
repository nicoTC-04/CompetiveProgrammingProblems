//package Codeforces;

import java.util.*;
import java.io.*;

public class NextRound158A {
    // For fast input output
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            try {
                br = new BufferedReader(
                        new FileReader("input.txt"));
                PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
                System.setOut(out);
            } catch (Exception e) {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
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

    // end of fast i/o code
    public static void main(String[] args) {
        FastReader reader = new FastReader();

        int n = reader.nextInt();
        int k = reader.nextInt();
        
        String x = reader.nextLine();
        String[] scores = x.split(" ");

        int target = Integer.parseInt(scores[k-1]);

        int count = 0;

        for(int i=0; i<n; i++){
            int actualScore = Integer.parseInt(scores[i]);
            if(actualScore > 0 && actualScore >= target){
                count++;
            }
        }
        System.out.println(count);
    }
}