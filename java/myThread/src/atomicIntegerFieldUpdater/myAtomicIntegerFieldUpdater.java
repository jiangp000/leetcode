package atomicIntegerFieldUpdater;


import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class myAtomicIntegerFieldUpdater {
    public static void main(String[] args) {
        AtomicIntegerFieldUpdater<User> a;
        a =  AtomicIntegerFieldUpdater.newUpdater(User.class,"age");

        User user = new User("Java",22);
        System.out.println(a.getAndIncrement(user));
        System.out.println(a.get(user));
    }
}


class User{
    private String name;
    public volatile int age;

    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return  name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
