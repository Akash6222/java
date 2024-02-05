public class exceptionHandling{
    public static void main( String[] args){

        int a[] = new int[3];

        try{
            System.out.println(a[4]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error aya tha");
            System.out.println(e.getLocalizedMessage());
        }    
        System.out.println("niche ki line");
    }
}
