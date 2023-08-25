package j07_반복.랜덤;

public class Random1 {

    public static void main(String[] args) {
        int i = 0;

        while (i < 10) {
            double rNum = Math.random();
            String formattedNum = String.format("%.3f", rNum);
            System.out.println(formattedNum);
            i++;
        }
        i = 0;

        while (i < 10) {
            double rNum = Math.random();
            double roundedNum = (double) Math.round(rNum * 1000) / 1000;
            System.out.println(roundedNum);
            i++;
        }
        i = 0;
        
        while(i < 10) {
        	double rNum = Math.random();
        	System.out.println((int)(rNum * 1000));
        	i++;
        }
    }
}
