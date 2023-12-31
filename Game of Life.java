class Solution {
    public void gameOfLife(int[][] board) {
        int i,j;
        i=board.length;
        j=board[0].length;
        int[][] myMatrix=new int[i][j];
        for(int e=0;e<i;e++){
            for(int f=0;f<j;f++){
                int sum=0;
                if(e-1>-1 && f-1>-1) sum+=board[e-1][f-1];
                if(e-1>-1) sum+=board[e-1][f];
                if(e-1>-1 && f+1<j) sum+=board[e-1][f+1];
                if(f-1>-1) sum+=board[e][f-1];
                if(f+1<j) sum+=board[e][f+1];
                if(e+1<i && f-1>-1) sum+=board[e+1][f-1];
                if(e+1<i) sum+=board[e+1][f];
                if(e+1<i && f+1<j) sum+=board[e+1][f+1];
                if(board[e][f]==0){
                    if(sum==3) myMatrix[e][f]=1;
                    else myMatrix[e][f]=0;
                }else{
                    if(sum==2 || sum==3) myMatrix[e][f]=1;
                    else myMatrix[e][f]=0;
                }
            }
        }
        for(int e=0;e<i;e++){
            for(int f=0;f<j;f++){
                board[e][f]=myMatrix[e][f];
            }
        }
    }
}