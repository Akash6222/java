public class SwitchCase {
    public static void main(String[] args){

        char grade = 'A';

        switch(grade){
        case 'A':
            System.out.println("Ypur grade is very good");
            break;
        case 'B':
            System.out.println("Very good keep learning");
            break;
        case 'C':
            System.out.println("Keep improving");
            break;
        default:
            System.out.println("Wrong argument");
        }
    } 
}
