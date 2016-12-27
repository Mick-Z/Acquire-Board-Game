package view;

import control.GameHub;
import model.Board;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Name: Mick Zeller
 */
public class Main
{


    public static void main(String[] args)
    {

        try (FileWriter printWriter = new FileWriter("board.txt"))
        {
            Board myBoard = new Board();
            GameHub.recordingFile(myBoard, printWriter);

        } catch (IOException exception)
        {
            System.out.println("Cannot process file: " + exception);
        }
    }
}
