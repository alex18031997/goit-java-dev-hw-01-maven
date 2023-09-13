package myname;

import com.google.gson.Gson;

public class MyName {

    public static void main(String[] arg) {
        sayMyName();
    }

    private static String makeJson(Person person) {
        Gson gson = new Gson();
        return gson.toJson(person);
    }
    public static void sayMyName() {

        Person person = new Person("Oleksii", "Bulakh");
        String personJson = makeJson(person);

        System.out.println(personJson);
    }
}
