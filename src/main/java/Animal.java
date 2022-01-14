public abstract class Animal {
    protected int weight;
    protected boolean hungry;
    protected int age;

    public Animal(int weight, int age, boolean hungry){
        setWeight(weight);
        setAge(age);
        setHungry(hungry);
    }


    public Animal() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract boolean eat(Food food);
}
