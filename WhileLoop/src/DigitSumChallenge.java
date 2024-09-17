public class DigitSumChallenge {
    public static void main(String[] args){

    int number = 1234567890;
    System.out.println(sumDigits(number));

    }

    public static int sumDigits(int number){

        int digitSum = 0;
        //int numLen = String.valueOf(number).length();

        if (number < 0){
            return -1;
        }else if (number < 10){
            return number;
        } else {
            while (number > 0){
                digitSum = digitSum + (number %10);
                number = number / 10;
            }
        }

        return digitSum;
    }

}
