package com.softserve.edu04.homework.task1.task1_3;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want to exit the app - enter \"exit\" " +
                "\nIf you want to receive description of error, " +
                "please enter the HTTP Client Error response code: ");
        String code = "";
        while (!code.equalsIgnoreCase("exit")) {
            switch (code = scanner.nextLine()) {
                case "400" -> System.out.println(ErrorDescription.BAD_REQUEST);
                case "401" -> System.out.println(ErrorDescription.UNAUTHORIZED);
                case "402" -> System.out.println(ErrorDescription.PAYMENT_REQUIRED);
                case "403" -> System.out.println(ErrorDescription.FORBIDDEN);
                case "404" -> System.out.println(ErrorDescription.NOT_FOUND);
                case "405" -> System.out.println(ErrorDescription.METHOD_NOT_ALLOWED);
                case "406" -> System.out.println(ErrorDescription.NOT_ACCEPTABLE);
                case "407" -> System.out.println(ErrorDescription.PROXY_AUTHENTICATION_REQUIRED);
                case "408" -> System.out.println(ErrorDescription.REQUEST_TIMEOUT);
                case "409" -> System.out.println(ErrorDescription.CONFLICT);
                case "410" -> System.out.println(ErrorDescription.GONE);
                case "411" -> System.out.println(ErrorDescription.LENGTH_REQUIRED);
                case "412" -> System.out.println(ErrorDescription.PRECONDITION_FAILED);
                case "413" -> System.out.println(ErrorDescription.PAYLOAD_TOO_LARGE);
                case "414" -> System.out.println(ErrorDescription.URI_TOO_LONG);
                case "415" -> System.out.println(ErrorDescription.UNSUPPORTED_MEDIA_TYPE);
                case "416" -> System.out.println(ErrorDescription.RANGE_NOT_SATISFIABLE);
                case "417" -> System.out.println(ErrorDescription.EXPECTATION_FAILED);
                case "418" -> System.out.println(ErrorDescription.I_AM_A_TEAPOT);
                case "421" -> System.out.println(ErrorDescription.MISDIRECTED_REQUEST);
                case "422" -> System.out.println(ErrorDescription.UNPROCESSABLE_ENTITY);
                case "423" -> System.out.println(ErrorDescription.LOCKED);
                case "424" -> System.out.println(ErrorDescription.FAILED_DEPENDENCY);
                case "425" -> System.out.println(ErrorDescription.TOO_EARLY);
                case "426" -> System.out.println(ErrorDescription.UPGRADE_REQUIRED);
                case "428" -> System.out.println(ErrorDescription.PRECONDITION_REQUIRED);
                case "429" -> System.out.println(ErrorDescription.TOO_MANY_REQUESTS);
                case "431" -> System.out.println(ErrorDescription.REQUESTS_HEADER_FIELDS_TOO_LARGE);
                case "451" -> System.out.println(ErrorDescription.UNAVAILABLE_FOR_LEGAL_REASONS);
                case "exit" -> System.out.println("App is over");
                case "Exit" -> System.out.println("App is over");
                case "EXIT" -> System.out.println("App is over");
                default ->
                        System.out.println("This error code is not exist or not belong to HTTP Client Error Response");
            }
        }
    }
}

