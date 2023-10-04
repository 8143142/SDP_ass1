public class Object{
    private static Object instance;
    Object() {}
    public static Object getInstance() {
        if (instance == null) {
            instance = new Object();
        }
        return instance;
    }
    public static void showFruit() {
        System.out.println("Object created");
    }
}