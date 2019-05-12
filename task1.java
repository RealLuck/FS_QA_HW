package taks1;

public class Main {

    public static void main(String[] args) {

        String first = "of beer on the wall," ;
        String second = "of beer!" ;
        String third = "Take one down, pass it around,";
        String fourth = "of beer on the wall!";

        for (int bottleNum = 99; bottleNum >= 0; bottleNum--) {
            if (bottleNum >1){
            System.out.println(String.format(" %d bottles %s \n %d bottles %s \n %s \n %d bottles %s" , bottleNum, first, bottleNum,second,third, bottleNum-1 , fourth));}

            else
                if (bottleNum == 1) {
                System.out.println(String.format(" %d bottle %s \n %d bottle %s  \n %s \n No more bottles %s",bottleNum,first,bottleNum,second,third,fourth));
            }
                else {
                System.out.println(String.format(" No more bottles %s \n No more bottles %s \n %s \n 99 bottles %s",first,second,third,fourth));
            }
        }
    }
}
