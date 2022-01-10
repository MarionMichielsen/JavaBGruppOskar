public class Växt {
    private String type;
    private int number;
    private int height;

    public Växt (String type, int number, int height){
        super();
        setNumber(number);
        setHeight(height);
        setType(type);

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
