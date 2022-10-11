package by.itstep.tia.model.data;

public class Student {
    public static final int MIN_AGE = 16;
    public static final int MAX_AGE = 100;
    public static final int MIN_MARK = 0;
    public static final int MAX_MARK = 10;

    private  String name;
    private int age;
    private double mark;
    private boolean alive;
    
    // getter method
    public String getName (){
        return name;
    }

    // setter method
    public void setName (String name){
        this.name = name;
    }

    public int getAge (){
        return age;
    }

    public void setAge(int age){
        if (age >MIN_AGE & age <=MAX_AGE){
            this.age = age;
        } // в идеале должен еще возвращать эксепшион в ветке элсе, если возраст не попал в диапазон
    }

    public double getMark () {
        return mark;
    }

    public void setMark (double mark) {
        if (mark >=MIN_MARK & mark <= MAX_MARK)
            this.mark = mark;
    }

    // особенность геттера на булеан начинать с Is
    public boolean isAlive (){
        return alive;
            }

            public void setAlive (boolean alive){
        this.alive = alive;
            }
}
