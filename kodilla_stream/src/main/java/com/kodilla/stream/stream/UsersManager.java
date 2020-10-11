package com.kodilla.stream.stream;

import java.util.stream.Collectors;

public class UsersManager {
        public static void main(String[] args) {
            UsersRepository.getUsersList()
                    .stream()
                    .filter(u -> u.getGroup().equals("Chemicals"))
                    .map(UsersManager::getUserName)
                    .collect(Collectors.toList());
            System.out.println();

        }

        public static String getUserName(User user) {
            return user.getUsername();
        }

    }
