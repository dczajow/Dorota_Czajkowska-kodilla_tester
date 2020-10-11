package com.kodilla.stream.stream.homework;

import com.kodilla.stream.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgPostsOver40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() >= 40)
                .map(user -> user.getNumberOfPosts())
                .mapToInt(n->n)
                .average()
                .orElse(0.0);

        System.out.println("Average post count for people at age 40 and above is : " + avgPostsOver40);

        double avgPostsBelow40 = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() < 40)
                .map(user -> user.getNumberOfPosts())
                .mapToInt(n->n)
                .average()
                .orElse(0.0);
        System.out.println("Average posts count for users below 40 years old is : " + avgPostsBelow40);
    }
}
// poprawic opis commitu