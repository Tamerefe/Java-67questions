public class twentyeight {
    
    public static void main(String[] args) {
        
        int even = 0;
        
        for (int i = 1; i < 11; i++) {
            int randomNumber = 5 + (int) (Math.random() * 146);
            if (randomNumber % 2 == 0) {
                even += randomNumber;
            } 
        }
        System.out.println("Sum of even inside 10 random numbers between 5 and 150 is: " + even);
    }
}
