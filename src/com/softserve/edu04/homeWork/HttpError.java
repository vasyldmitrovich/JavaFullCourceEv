package com.softserve.edu04.homeWork;

import com.softserve.edu04.practicalTask.EnPol;
import com.softserve.edu04.practicalTask.NumberOfTheWeek;

import java.util.Scanner;

public class HttpError {
    public static void main(String[] arg) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the HTTP Error : ");
        int number = console.nextInt();
        String result = switch (number) {
            case 400 -> "Bad Request";
            case 401 -> "Unauthorized";
            case 402 -> "Payment Required";
            case 403 -> "Forbidden";
            case 404 -> "Not Found";
            case 405 -> "Method Not Allowed";
            case 406 -> "Not Acceptable";
            case 407 -> "Proxy Authentication Required";
            case 408 -> "Request Timeout";
            case 409-> "Conflict";
            case 410 -> "Gone";
            case 411 -> "Length Required";
            case 412 -> "Precondition Failed";
            case 413 -> "Content Too Large";
            case 414 -> "URI Too Long";
            case 415 -> "Unsupported Media Type";
            case 416 -> "Range Not Satisfiable";
            case 417 -> "Expectation Failed";
            case 421 -> "Misdirected Request";
            case 422 -> "Unprocessable Entity";
            case 423 -> "Locked";
            case 424 -> "Failed Dependency";
            case 425 -> "Too Early";
            case 426-> "Upgrade Required";
            case 428 -> "Precondition Required";
            case 429 -> "Too Many Requests";
            case 431 -> "Request Header Fields Too Large";
            case 451 -> "Unavailable For Legal Reasons";
            default -> "There is no such error!";
        };
        System.out.println(result);
    }
}
