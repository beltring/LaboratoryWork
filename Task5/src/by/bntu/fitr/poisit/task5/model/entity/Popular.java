package by.bntu.fitr.poisit.task5.model.entity;

public class Popular extends Music{
    static final int DEFAULT_AUDITIONS = 100000;
    static final int DEFAULT_POSITION = 1;
    
    private int numberOfAuditions;
    private int position;

    public Popular() {
        numberOfAuditions = DEFAULT_AUDITIONS;
        position = DEFAULT_POSITION;
    }

    public Popular(int numberOfAuditions,int position, int time, String name) {
        super(time, name);
        this.numberOfAuditions = numberOfAuditions;
        this.position = position;
    }

    public Popular(int numberOfAuditions, int position, Music music) {
        super(music);
        this.numberOfAuditions = numberOfAuditions;
        this.position = position;
    }

    public int getNumberOfAuditions() {
        return numberOfAuditions;
    }

    public void setNumberOfAuditions(int numberOfAuditions) {
        this.numberOfAuditions = numberOfAuditions;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", position:" + position 
                + ", number of auditions=" + numberOfAuditions;
    }
    
    
}
