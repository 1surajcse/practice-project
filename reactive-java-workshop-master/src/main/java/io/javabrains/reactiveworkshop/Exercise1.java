package io.javabrains.reactiveworkshop;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here

        StreamSources.intNumbersStream().forEach(e-> System.out.println(e));

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here

        StreamSources.intNumbersStream().filter(e->e<5).forEach(item-> System.out.println(item));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        StreamSources.intNumbersStream().filter(e->e<5).skip(1).limit(2).
                forEach(e-> System.out.println(e));


        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        Integer num=StreamSources.intNumbersStream().filter(e->e>5).findFirst().orElse(-1);
        System.out.println(num);


        // Print first names of all users in userStream
        // TODO: Write code here
        StreamSources.userStream().map(e->e.getFirstName()).forEach(e-> System.out.println(e));

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        System.out.println("Last--");
        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream().anyMatch(u->u==user.getId()))
                .forEach(user1-> System.out.println(user1.getFirstName()));



    }

}
