import lombok.Getter;

@Getter
public class Friends {
    @Override
    public String toString() {
        return
                "{count:" + count +
                '}';
    }

    public int count;

    public  Friends(){}

}
