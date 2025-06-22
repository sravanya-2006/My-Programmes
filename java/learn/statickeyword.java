package learn;

public class statickeyword {
    public static void main(String[] args) {
        //static = modifier. A single copy of a variable/method is created and shared.
        //         The class "owns" the static member

    Friend friend1 = new Friend("spongebob");
    Friend friend2 = new Friend("karthik");
    Friend friend3 = new Friend("bonda");
    System.out.println(Friend.nooffriends);

    Friend.displayFriends();
}

}

class Friend {
    String name;
    static int nooffriends;

    Friend(String name){
        this.name = name;
        nooffriends++;
    }
    static void displayFriends() {
        System.out.println("you have"+nooffriends+"friends");
    }
}
