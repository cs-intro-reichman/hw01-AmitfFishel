public class Gen3 {
        public static void main(String[] args) {
            
            // b is bigger than a.       

            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int randomNum1 = (int)(Math.random() * (b-a)) + a;
            int randomNum2 = (int)(Math.random() * (b-a)) + a;
            int randomNum3 = (int)(Math.random() * (b-a)) + a;


            System.out.println(randomNum1);
            System.out.println(randomNum2);
            System.out.println(randomNum3);
            System.out.println("The minimal generated number was " + Math.min(randomNum1, Math.min(randomNum2, randomNum3))); 

	
        }
    }