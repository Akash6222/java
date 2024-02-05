public class ConditionalOperator{
    public static void main(String[] args){

        // >, <, >=, <=, ==, !=
        int age = 12;

        if ( age > 18){
            System.out.println("You can vote");
        }
        else{
            System.out.println("You can't vote");
        }

        boolean isEqual = 18 == 18;
        System.out.println(19 != 18);

        char grade = 'A';
        if(grade == 'A') {
            System.out.println("Ypur grade is very good");
        }
        else if (grade == 'B'){
            System.out.println("Very good keep learning");
        }
        else if (grade == 'C'){
            System.out.println("Keep improving");
        }
    

}
}
