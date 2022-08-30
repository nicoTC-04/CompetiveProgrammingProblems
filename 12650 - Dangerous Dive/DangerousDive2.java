import java.util.*;
import java.io.*;

public class DangerousDive2 {
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

        while(true){
            
            String l1 = reader.nextLine();
            String l2 = reader.nextLine();

            if(l1.equals(null)){
                break;
            }
    
            int N = 0;
            int R = 0;
    
            for (int i = 0; i < l1.length(); i++) {
                if (l1.substring(i, i + 1).equals(" ")) {
                    N = Integer.parseInt(l1.substring(i - 1, i));
                    R = Integer.parseInt(l1.substring(i + 1, l1.length()));
    
                    break;
                }
            }
    
            if (N == R) {
                System.out.println("*");
            } else {
                int counter = 0;
                int[] survive = new int[R];
    
                for (int j = 0; j <= l2.length(); j++) {
    
                    if (j == l2.length()) {
                        survive[counter] = Integer.parseInt(l2.substring(j - 1, j));
    
                        counter++;
                    } else {
                        if (l2.substring(j, j + 1).equals(" ")) {
                            survive[counter] = Integer.parseInt(l2.substring(j - 1, j));
    
                            counter++;
                        }
                    }
                }
    
                HashSet<Integer> todos = new HashSet<Integer>();
    
                for (int k = 0; k < R; k++) {
                    todos.add(survive[k]);
                }
    
                for (int l = 1; l <= N; l++) {
                    if (todos.contains(l)) {
                        //
                    } else {
                        System.out.print(l + " ");
                    }
                }
            }
            System.out.println("");
        }
    }
}