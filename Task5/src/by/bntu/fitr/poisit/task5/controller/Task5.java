package by.bntu.fitr.poisit.task5.controller;

import by.bntu.fitr.poisit.task5.model.entity.Music;
import by.bntu.fitr.poisit.task5.model.entity.Popular;
import by.bntu.fitr.poisit.task5.model.entity.Rock;
import by.bntu.fitr.poisit.task5.model.entity.SoundRecording;
import by.bntu.fitr.poisit.task5.model.logic.Calculator;
import by.bntu.fitr.poisit.task5.view.Printer;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        Music m1 = new Rock("alternative rock",115,92,"Rammstein");
        Music m2 = new Popular(10_000_000, 1, 126,"KAZKA");
        
        Music[] mm = {m1,m2};
        
        SoundRecording recording = new SoundRecording("MAISD",mm);
        
        Music[] musics = Calculator.minPlayTime(recording);
        
        Printer.print(Arrays.toString(musics));
        Printer.print("\n" + Calculator.totalTime(recording));
    }
}
