package by.bntu.fitr.poisit.task5.model.entity;

import java.util.Arrays;

public class SoundRecording {    
    private String nameOfStudio;
    private Music[] album;

    public SoundRecording() {
        album = new Music[0];
    }

    public SoundRecording(String nameOfStudio) {
        this.nameOfStudio = nameOfStudio;
        album = new Music[0];
    }
    
    public SoundRecording(String nameOfStudio, Music[] album) {
        this.nameOfStudio = nameOfStudio;
        this.album = album;
    }

    public String getNameOfStudio() {
        return nameOfStudio;
    }

    public void setNameOfStudio(String nameOfStudio) {
        this.nameOfStudio = nameOfStudio;
    }
    
    public Music get(int index){
        return album[index];
    }
    
    public int size(){
        return album.length;
    }
    
    public void add(Music music){ 
        album = Arrays.copyOf(album, album.length + 1);
        
        album[album.length - 1] = music;
    }

    @Override
    public String toString() {
        StringBuilder builder;
        builder = new StringBuilder(nameOfStudio + "\n");
       
        for (Music music : album) {
            builder.append(music.toString()).append("\n");
        }
       
       return builder.toString();
    }
    
    
}
