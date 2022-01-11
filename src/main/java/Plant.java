public class Plant extends Food{
   // private String type;
  //  private int number;
    private int height;

    public Plant (String type, int number, int height){
        super(number, type);
       // setNumber(number);
        setHeight(height);
       // setType(type);

    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
/*
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
    }*/
}
