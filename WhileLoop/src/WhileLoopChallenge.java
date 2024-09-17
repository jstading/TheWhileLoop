public class WhileLoopChallenge {
    public static void main(String[] args){

        int start = 5;
        int end = 20;
        while (start <=end){
            if (isEvenNumber(start) == true){
                System.out.println(start);
            }
            start++;
        }


    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}
