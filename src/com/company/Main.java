package com.company;

import com.company.enums.UserStatus;

public class Main {

    public static void main(String[] args) {
        UserStatus userStatus = UserStatus.ACTIVE;
        String str = userStatus.toString();
        String str2 = userStatus.name();
        System.out.println(str);
        System.out.println(str2);

        UserStatus status = UserStatus.ACTIVE;
        if(UserStatus.ACTIVE.equals(status)){
            System.out.println("Лови денежку! ");
        }

        UserStatus[] values = UserStatus.values();
        for (UserStatus value: values) {
            System.out.println(value);
        }

        String str3 = null;
        UserStatus aInv = UserStatus.valueOf("INVISIBLE");

        if(str3 != null){
            UserStatus bad = UserStatus.valueOf(str3);
        }

        switch (userStatus){
            case ACTIVE -> System.out.println(UserStatus.ACTIVE.getLabel());
            case NOT_ACTIVE -> System.out.println(UserStatus.NOT_ACTIVE.getLabel());
            case INVISIBLE -> System.out.println(UserStatus.INVISIBLE.getLabel());
            default -> System.out.println("Другое");
        }

    }
}
