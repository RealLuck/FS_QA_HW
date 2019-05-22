package collection_tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class cTask2 {
    static class HumanAgeComparator implements Comparator<Human>{
        @Override
        public int compare(Human one, Human two){
            return two.age - one.age ;
        }
    }

    static class Human {

        int age;

        String name;

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


        List<Human> humanList = new ArrayList<>();

        humanList.add( human1 );
        humanList.add( human2 );
        humanList.add( human3 );
        humanList.add( human4 );
        humanList.add( human5 );

        System.out.println( humanList );

        Collections.sort( humanList,  new HumanAgeComparator() );

        System.out.println(humanList);

        Comparator reversedComparator = Collections.reverseOrder( new HumanAgeComparator() );


        Collections.sort( humanList, reversedComparator );

        System.out.println(humanList);


    }
}
