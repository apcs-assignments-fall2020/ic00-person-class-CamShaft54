public class PersonClient {
    public static void main(String[] args) {
        Person me = new Person("Cam", "Shaft");
        me.doSomething();
        System.out.println(me.getFirstName());
        System.out.println(me.getLastName());
        me.setFirstName("DirtFace");
        me.setLastName("Dirge");
        System.out.println(me.toString());
    }
}
