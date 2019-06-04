import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter@Setter
public class CatAnimal {


    private String animal_type;

    private String name;

    private int age;

    private boolean  has_tail;


    private String[] colors;

    private Friends friends;




    @Override
    public String toString() {
        return "Test{" +
                "animal_type='" + animal_type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", has_tail=" + has_tail +
                ", colors='" + Arrays.toString(colors) + '\'' +
                ", friends=" + friends +

                '}';

    }

    public CatAnimal(){}

}


