package com.trevorkitt.sudoku;

public class Game {
    private final int grid_size = 9;
    private Integer[][] grid;

    public Game(){
        generateGrid();
    }

    private void generateGrid(){
        grid = new Integer[grid_size][grid_size];
    }

    public void printGame(){
        for(int i = 0; i < grid_size; i++){
            String row = "";
            for(int j = 0; j < grid_size; j++){
                if(grid[i][j] != null)
                    row += grid[i][j];
                else
                    row += " ";
                row += ",";
            }
            System.out.println(row);
        }
    }
}
