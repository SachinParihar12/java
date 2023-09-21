public class condition {
    public static void main (string args[]){
        scanner sc = new scanner(system.in);
        int button =sc.nextint();

        if(button==1){
            system.out.println("hello");
        }
        else if(button==2){
            system.out.println("namste");
        }
        else{
            system.out.println("invalide button");
        }
    }
}