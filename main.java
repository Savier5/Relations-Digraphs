import java.util.*;

public class main {
    public static void main(String[] args) {
        // Define the matrices
        boolean[][] matrixOne = {
            {true, false, false, true},
            {false, true, false, true},
            {false, false, true, false},
            {true, true, true, false}
        };

        boolean[][] matrixTwo = {
            {false, true, true, true},
            {true, true, false, true},
            {false, true, false, true},
            {true, false, true, false}
        };

        boolean[][] newMatrix = new boolean[4][4];
        boolean[] tempMatrix = new boolean[4];
        int totalConnections = 0;
        int r, c, rTwo;

        // Calculate the new matrix
        for (rTwo = 0; rTwo < 4; rTwo++) {
            for (r = 0; r < 4; r++) {
                for (c = 0; c < 4; c++) {
                    if (matrixOne[rTwo][c] && matrixTwo[c][r]) {
                        tempMatrix[c] = true;
                    } else {
                        tempMatrix[c] = false;
                    }
                }
                if (tempMatrix[0] || tempMatrix[1] || tempMatrix[2] || tempMatrix[3]) {
                    newMatrix[rTwo][r] = true;
                    totalConnections++; // Count connections
                } else {
                    newMatrix[rTwo][r] = false;
                }
            }
        }

        // Outputs matrices
        System.out.println("   Matrix One          Matrix Two          New Matrix");
        System.out.println("-----------------   -----------------   -----------------");

        for (int i = 0; i < 4; i++) {
            // Outputs matrixOne row
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {
                if (matrixOne[i][j]) {
                    System.out.print("1 | ");
                } else {
                    System.out.print("0 | ");
                }
            }

            if (i == 1) {
                System.out.print("X ");
            } else {
                System.out.print("  ");
            }

            // Outputs matrixTwo row
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {
                if (matrixTwo[i][j]) {
                    System.out.print("1 | ");
                } else {
                    System.out.print("0 | ");
                }
            }

            if (i == 1) {
                System.out.print("= ");
            } else {
                System.out.print("  ");
            }

            // Outputs new Matrix row
            System.out.print("| ");
            for (int j = 0; j < 4; j++) {
                if (newMatrix[i][j]) {
                    System.out.print("1 | ");
                } else {
                    System.out.print("0 | ");
                }
            }
            System.out.println("\n-----------------   -----------------   -----------------");
        }

        // Print total number of connections
        System.out.println("\nTotal number of connections in new matrix: " + totalConnections + "\n");
    }
}