package task_charcequence;
import java.lang.*;

public class main {




    public static void main(String[] args) {
        CharSequence chars = new MyCharSequence("YesYesYes");
        System.out.println("chars = " + chars);
        System.out.println("chars.charAt(7) = " + chars.charAt(7));
        System.out.println("chars.length() = " + chars.length());
        System.out.println("chars.subSequence(0,5) = " + chars.subSequence(0, 5));

    }

    static  class MyCharSequence implements CharSequence{

        private String data;

        public MyCharSequence(String data) {
            this.data = data;
        }



        @Override
        public char charAt(int index) {
            return data.charAt(index);
        }

        @Override
        public int length() {
            return data.length();
        }

        @Override
        public CharSequence subSequence(int begin, int end) {
            return data.subSequence(begin, end);
        }
    }




}
