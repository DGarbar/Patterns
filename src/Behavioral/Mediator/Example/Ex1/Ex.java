package Behavioral.Mediator.Example.Ex1;

import Behavioral.Mediator.Example.Ex1.Users.Admin;
import Behavioral.Mediator.Example.Ex1.Users.User;

//Users don't know about each other

public class Ex {

  public static void main(String[] args) {
    ChatRoom chatRoom = new ChatRoom();
    User user1 = new User("Vlad", chatRoom);
    User user2 = new User("Pupsik", chatRoom);
    User user3 = new User("Nagibator", chatRoom);
    User user4 = new User("Ivanovator", chatRoom);
    User user5 = new User("IdIoT", chatRoom);
    Admin admin = new Admin("Dima", chatRoom);
    Admin admin2 = new Admin("Root", chatRoom);

    chatRoom.addUser(user1);
    chatRoom.addUser(user2);
    chatRoom.addUser(user3);
    chatRoom.addUser(user4);
    chatRoom.addUser(user5);
    chatRoom.addUser(admin);
    chatRoom.addUser(admin2);

    user1.sendMessage("Lol");

    admin.sendMessage("I + java = Love");
  }
}
