import java.util.*;
import java.io.*;

public class DangerousDive {
    public static void main(String[] args){
        Scanner info = new Scanner(System.in);
        String l1 = info.nextLine();
        String l2 = info.nextLine();

        int N=0;
        int R=0;

        for(int i=0; i<l1.length(); i++){
            if(l1.substring(i, i+1).equals(" ")){
                N = Integer.parseInt(l1.substring(i-1, i));
                R = Integer.parseInt(l1.substring(i+1, l1.length()));
                
                break;
            }
        }

        if(N==R){
            System.out.println("*");
        }else{
            int counter = 0;
            int[] survive = new int[R];

            for(int j=0; j<=l2.length(); j++){
                
                if(j==l2.length()){
                    survive[counter] = Integer.parseInt(l2.substring(j-1, j));

                    counter++;
                } else{
                    if(l2.substring(j, j+1).equals(" ")){
                        survive[counter] = Integer.parseInt(l2.substring(j-1, j));
        
                        counter++;
                    }
                }
            }

            HashSet<Integer> todos = new HashSet<Integer>();

            for(int k=0; k<R; k++){
                todos.add(survive[k]);
            }

            for(int l=1; l<=N; l++){
                if(todos.contains(l)){
                    //
                } else{
                    System.out.print(l + " ");
                }
            }
        } 
    }
}