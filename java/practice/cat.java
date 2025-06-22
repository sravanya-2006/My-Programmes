class dog {
        /*
        Instance variables: states of Cat
         */
        String name;
        int age;
        String color;
        String breed;
    
        /*
        Instance methods: behaviors of Cat
         */
        void sleep(){
            System.out.println("Sleeping");
        }
        void play(){
            System.out.println("Playing");
        }
        void feed(){
            System.out.println("Eating");
        }
    
    }
    
    public class cat {
    
        public static void main(String[] args) {
           /*
           Creating objects
            */
           dog thor = new dog();
           dog rambo = new dog();
    
        }
}
