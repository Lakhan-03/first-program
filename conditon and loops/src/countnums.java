public class countnums {
    public static void main(String[] args) {
        int a = 455515;
        int counter =0;
        while (a >0){
            int rem = a% 10;
            if (rem == 5){
                counter++;
            }
            a = a/10;
        }
        System.out.println(counter);
    }
}
