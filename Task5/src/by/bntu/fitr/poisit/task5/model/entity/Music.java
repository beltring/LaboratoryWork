package by.bntu.fitr.poisit.task5.model.entity;

public class Music {
    static final int DEFAULT_TIME = 0; 
    static final String DEFAULT_NAME = "no name";
    
    private int time;
    private String singer;
    
    public Music(){
        time = DEFAULT_TIME;
        singer = DEFAULT_NAME;
    }
    
    public Music(int time, String name) {
        this.time = time;
        this.singer = name;
    }
    
    public Music(Music music){
        time = music.time;
        singer = music.singer;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
    
    @Override
    public String toString() {
        return "singer:" + singer + "  time:" + time + " second";
    }
    
    
}
