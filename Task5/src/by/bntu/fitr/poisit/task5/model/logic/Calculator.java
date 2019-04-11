package by.bntu.fitr.poisit.task5.model.logic;

import by.bntu.fitr.poisit.task5.model.entity.Music;
import by.bntu.fitr.poisit.task5.model.entity.SoundRecording;
import java.util.Arrays;

public class Calculator {
    public static Music[] minPlayTime(SoundRecording recording){
        if(recording == null || recording.size() < 1){
            return null;
        }
        
        Music[] album = new Music[1];
        album[0] = recording.get(0);
        
        for (int i = 0; i < recording.size(); i++) {
            if(album[0].getTime() > recording.get(i).getTime()){
                album = new Music[0];
                
                album = Arrays.copyOf(album, album.length + 1);
                album[album.length -1] = recording.get(i);
            }
            else if(album[0].getTime() == recording.get(i).getTime()){
                album = Arrays.copyOf(album, album.length + 1);
                album[album.length -1] = recording.get(i);
            }  
        }
        
        return album;
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
