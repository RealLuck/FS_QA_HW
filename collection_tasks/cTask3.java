package collection_tasks;

import java.util.Set;
import java.util.TreeSet;

public class cTask3 {
    static class Human implements Comparable<Human> {

        int age;

        String name;

        @Override
        public int compareTo(Human human) {
            return human.age - this.age;
        }

        public Human(int age, String name) {


            this.age = age;

            this.name = name;
        }

        @Override
        public String toString() {

            return " name = " + name + ", age = " + age;
        }
    }

    public static void main(String[] args) {




        Human human1 = new Human( 25, "Max" );

        Human human2 = new Human( 30, "Bob" );

        Human human3 = new Human( 15, "Liza" );

        Human human4 = new Human( 32, "Jo-jo" );

        Human human5 = new Human( 89, "Harry" );

        Set<Human> humanSet = new TreeSet<>(  );

        humanSet.add( human1 );
        humanSet.add( human2 );
        humanSet.add( human3 );
        humanSet.add( human4 );
        humanSet.add( human5 );

        System.out.println(humanSet);


}
}
