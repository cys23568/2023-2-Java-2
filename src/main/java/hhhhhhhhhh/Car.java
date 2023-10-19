package hhhhhhhhhh;

public class Car { //클래스는 속성과 메서드
    //속성은 값 저장
    public String name;
    public int door;
    public String color;

    public Car(String name,int door, String color) {
        this.name = name;
        this.door = door;
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }
    public void setDoor(int door) {this.door = door;}
    public void setColor(String color) {this.color = color;}

    @Override
    public String toString() {
        return String.format("%s %d %s",name,door,color);
    }
    public String getName(){
        return name;//변수마다 타입 맞춰줘야함
    }
    public String getColor(){
        return color;
    }
    public int getDoor(){
        return door;
    }
}

class CarTest{
    public static void main(String[] args) {
        Car c = new Car ("소나타",4,"White");
        //System.out.println(c.color);
        System.out.println("=================");
        c.setName("제네시스"); //set : 속성의 값을 변경하겠따.
        System.out.println(c);
        System.out.println(c.toString());  // public String toString() {
                                           //return String.format("%s %d %s",name,door,color);
        String name = c.getName();
        System.out.println(name);
        
    }
}
