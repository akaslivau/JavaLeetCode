package ru.main.arrays;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/
public class Task1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            int rowMin = 1_000_000;
            int colMinIndex = -1;
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colMinIndex = j;
                }
            }

            //Check if max in column
            int rowMaxIndex = -1;
            int colMax = 0;
            for(int k=0;k<rows;k++){
                if(matrix[k][colMinIndex] > colMax){
                    colMax = matrix[k][colMinIndex];
                    rowMaxIndex = k;
                }
            }

            //Add result if ok
            if(rowMaxIndex == i) result.add(matrix[i][colMinIndex]);
        }

        return result;
    }
}

