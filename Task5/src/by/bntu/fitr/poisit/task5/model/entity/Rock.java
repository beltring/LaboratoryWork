package by.bntu.fitr.poisit.task5.model.entity;

public class Rock extends Music {
    static final String DEFAULT_SUBGENRE = "no name";
    static final int DEFAULT_VOLUME = 110;
    
    private String subgenre;
    private int volume;

    public Rock() {
        subgenre = DEFAULT_SUBGENRE;
        volume = DEFAULT_VOLUME;
    }

    public Rock(String subgenre, int volume, int time, String name) {
        super(time, name);
        this.subgenre = subgenre;
        this.volume = volume;
    }

    public Rock(String subgenre, int volume, Music music) {
        super(music);
        this.subgenre = subgenre;
        this.volume = volume;
    }

    public String getSubgenre() {
        return subgenre;
    }

    public void setSubgenre(String subgenre) {
        this.subgenre = subgenre;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    @Override
    public String toString() {
        return super.toString() + ",  subgenre:" + subgenre 
                + ", volume:" + volume + "dB";
    }
    
    
}
