import java.util.*;
import java.io.*;

public class ProblemA {
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

        for(int i=0; i<t; i++){
            String st = reader.nextLine();

            String[] letters = st.split("");

            String[] facebook = {"f","a","c","e","b","o","o","k"};
            int counter = 0;

            for(int j=0; j<letters.length; j++){
                if(counter==8){
                    break;
                }
                if(facebook[counter].equals(letters[j])){
                    counter++;
                }
            }

            if(counter == 8){
                System.out.println("Case #"+(i+1)+": YES");
            } else{
                System.out.println("Case #"+(i+1)+": NO");
            }
        }
    }
}
