public class Example {
    public static void main(String args[]){
        PersonJ persona = new PersonJ();

        persona.firstName = "Emiliano";
        persona.surName   = "del la crúz";
        persona.age       = 14;

        System.out.println("********************************");
        System.out.println("    WELCOME TO CINEMA CENTER    ");
        System.out.println("********************************");
        System.out.println("");
        System.out.println("WE WILL CHECK THIS ID.");
        System.out.println("IF IT IS UNDER 18 THE PERSON CAN'T ENTER THE CINEMA...");
        System.out.println("CHECKING...");
        if(persona.age >= 18){

            System.out.println("THIS PERSON CAN ENTER THE CINEMA!");

        } else{
            System.out.println("THIS PERSON *CANNOT* ENTER THE CINEMA!");

        }




    }





}