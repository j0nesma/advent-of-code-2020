package matthew.jones.advent.of.code.days;

public abstract class AbstractDay {

    private String data;

    public AbstractDay(String data){
        this.data = data;
    }

    public abstract void run();

    public String getData(){
        return data;
    }
}
