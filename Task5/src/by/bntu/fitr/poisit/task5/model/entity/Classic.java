package by.bntu.fitr.poisit.task5.model.entity;

public class Classic extends Music {
    static final int DEFAULT_INSTRUMENTS = 1;
    
    private int countInstruments;

    public Classic() {
        countInstruments = DEFAULT_INSTRUMENTS;
    }

    public Classic(int countInstruments, int time, String name) {
        super(time, name);
        this.countInstruments = countInstruments;
    }

    public Classic(int countInstruments, Music music) {
        super(music);
        this.countInstruments = countInstruments;
    }

    public int getCountInstruments() {
        return countInstruments;
    }

    public void setCountInstruments(int countInstruments) {
        this.countInstruments = countInstruments;
    }

    @Override
    public String toString() {
        return super.toString()+ ", count instruments:" + countInstruments;
    }
    
    
    
}
