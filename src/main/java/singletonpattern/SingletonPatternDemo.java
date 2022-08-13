package singletonpattern;

public class SingletonPatternDemo {

    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();

        System.out.println(object.equals(object2));

        //show the message
        object.showMessage();
    }
}
