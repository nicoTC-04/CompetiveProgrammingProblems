public class EditDistance {
    public static int minDistance(String word1, String word2) {
        int[][] Changes = new int[word1.length()+1][word2.length()+1];

        for(int x=0; x<Changes.length; x++){
            Changes[x][0] = x;
        }

        for(int y=0; y<Changes[0].length; y++){
            Changes[0][y] = y;
        }
        
        for(int i=1; i<Changes.length; i++){
            for(int j=1; j<Changes[i].length; j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    Changes[i][j] = Changes[i-1][j-1];
                }else{
                    Changes[i][j] = Math.min(Changes[i-1][j-1]+1, Math.min(Changes[i-1][j]+1, Changes[i][j-1]+1));
                }
            }
        }

        /*for(int i=0; i<Changes.length; i++){
            System.out.println("");
            for(int j=0; j<Changes[i].length; j++){
                System.out.print(Changes[i][j]+" ");
            }
        }*/

        return Changes[word1.length()][word2.length()];
    }

    public static void main(String[] args) {
        System.out.println(minDistance("ephrem", "benyam"));
    }
}
