import java.util.*;
import java.io.*;

public class ProblemC {
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

        int t = reader.nextInt();

        for(int i=0; i<t;i++){
            int N = Integer.parseInt(reader.nextLine());

            String[] strings = reader.nextLine().split(" ");

            int[] numbers = new int[strings.length];

            for(int j=0; j<N; j++){
                numbers[j] = Integer.parseInt(strings[j]);
            }

            int[] sums = new int[numbers.length];

            int partialSum = 0;

            for(int j=0; j<sums.length; j++){
                partialSum += numbers[j];

                sums[j] = partialSum;
            }

            int maxSums = 0;
            int maxIndex = 0;

            for(int j=0; j<sums.length; j++){
                if(sums[j]>maxSums){
                    maxSums = sums[j];
                    maxIndex = j;
                }
            }

            int max = 0;

            for(int j=maxIndex; j>=0; j--){
                if(sums[j]<0){
                    max = maxSums - sums[j];
                    break;
                }
            }

            System.out.println("Case #"+i+": "+max);
        }
    }
}
