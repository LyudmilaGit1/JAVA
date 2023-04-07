package total;


public class chess {

    
        public static void main(String[] args) {
            int[] queen = new int[8];
            findPosition(0, queen);
    
            for (int row = 0; row < 8; row++) {
                for (int col = 0; col < 8; col++) {
                    if (queen[row] == col) {
                        System.out.print(" F ");
                    } else {
                        System.out.print(" - ");
                    }
                }
                System.out.println();
            }
        }
    
        
        private static boolean findPosition(int row, int[] queen) {
            if (row == 8) { 
                return true;
            }
            for (int col = 0; col < 8; col++) {
                boolean isSafe = true;
                for (int i = 0; i < row; i++) {
                   
                    if (queen[i] == col || queen[i] == col - row + i || queen[i] == col + row - i) {
                        isSafe = false;
                        break;
                    }
                }
                if (isSafe) {
                    queen[row] = col;
                    if (findPosition(row + 1, queen)) { 
                        return true;
                    }
                }
            }
            return false;
        }
    }
