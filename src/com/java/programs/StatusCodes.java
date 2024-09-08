package com.java.programs;

import java.util.HashMap;

public class StatusCodes {
    public static void main(String[] args) {

/*
        100 = continue
        200= ok status
        201= created
        202= accepted
        204=no content
        301= moved permanently
        302= found
        400= bad request
        401= unauthorised request
        403= forbidden request
        404= not found
        405= method not allowed
        500 = internal server error
        502= bad gateway
        503= service unreachable
        504= gateway timeout
*/

        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"yugal");
        myMap.put(1,"mayur");
        System.out.println(myMap.size());
        System.out.println(myMap);

    }
}
