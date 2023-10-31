package Fastcam.part3.ClassDTO;

public class Person {
    public int age;
    public String name;
    public String phone;
// 생성자 메서드라고 부른다 class이름 == Person 이랑 같기에
    public Person(){
        this.phone = "010-4444-4444";
        this.age = 11;
        this.name = "jeri";
    }

    public void play(){
        System.out.println("운동을 한다");
    }
    public void eat(){
        System.out.println("음식을 먹다");
    }
    public void walk(){
        System.out.println("걷다");
    }
}

