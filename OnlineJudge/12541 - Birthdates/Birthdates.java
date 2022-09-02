import java.util.*;
import java.util.HashMap;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.io.*;

public class Birthdates {
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

        HashMap<String, Date> people = new HashMap<String, Date>();

        int peopleNum = reader.nextInt();
        String tempName;
        String tempDate;
        String l1;
        String nOld = "";
        String nYoung = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        Date d1 = new Date();

        for(int i=0; i < peopleNum; i++){
            l1 = reader.nextLine();

            tempName = l1.substring(0, l1.indexOf(' '));
            tempDate = l1.substring(l1.indexOf(' ') + 1);

            
            try {
                d1 = sdf.parse(tempDate);
            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            

            if(i == 0){
                nOld = tempName;
                nYoung = tempName;
            }

            people.put(tempName, d1);
        }

        Date d2 = people.get(nOld);
        Date d3 = people.get(nYoung);

        for (String j : people.keySet()){
           if(nOld == j){
                continue;
           }

            Calendar cal = Calendar.getInstance();

            d2 = people.get(nOld);
            d3 = people.get(nYoung);

            cal.setTime(d2);
            long y = cal.getTimeInMillis();

            cal.setTime(people.get(j));
            long y1=cal.getTimeInMillis();

            cal.setTime(d3);
            long y2 = cal.getTimeInMillis();

            if(y1<y){
                nOld = j;
            }

            if(y1>y2){
                nYoung = j;
            }
        }

        System.out.println(nYoung);
        System.out.println(nOld);

    }
}
