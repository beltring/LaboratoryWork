package by.bntu.fitr.poisit.task5.model.logic;

import by.bntu.fitr.poisit.task5.model.entity.Music;
import by.bntu.fitr.poisit.task5.model.entity.SoundRecording;
import java.util.Arrays;

public class Calculator {
    public static Music[] minPlayTime(SoundRecording recording){
        if(recording == null || recording.size() < 1){
            return null;
        }
        
        Music[] musics = new Music[1];
        musics[0] = recording.get(0);
        
        for (int i = 0; i < recording.size(); i++) {
            if(musics[0].getTime() > recording.get(i).getTime()){
                musics[0] = recording.get(i);
            }  
        }
        
        return musics;
    }
    
    public static int totalTime(SoundRecording recording){
        int total = 0;
        
        if(recording == null){
            return total;
        }
        
        for (int i = 0; i < recording.size(); i++) {
            total += recording.get(i).getTime();
        }
        
        return total;
    }
}
