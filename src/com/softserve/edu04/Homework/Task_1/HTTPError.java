package com.softserve.edu04.Homework.Task_1;

public enum HTTPError {
    BAD_REQUEST, UNAUTHORIZED, PAYMENT_REQUIRED, FORBIDDEN, NOT_FOUND, MISTAKE;

    public void outputError(HTTPError httpError) {
        switch (httpError) {
            case BAD_REQUEST ->
                    System.out.println("The server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing).");
            case UNAUTHORIZED ->
                    System.out.println("Although the HTTP standard specifies \"unauthorized\", semantically this response means \"unauthenticated\". That is, the client must authenticate itself to get the requested response.");
            case PAYMENT_REQUIRED ->
                    System.out.println("This response code is reserved for future use. The initial aim for creating this code was using it for digital payment systems, however this status code is used very rarely and no standard convention exists.");
            case FORBIDDEN ->
                    System.out.println("The client does not have access rights to the content; that is, it is unauthorized, so the server is refusing to give the requested resource. Unlike 401 Unauthorized, the client's identity is known to the server.");
            case NOT_FOUND ->
                    System.out.println("The server cannot find the requested resource. In the browser, this means the URL is not recognized. In an API, this can also mean that the endpoint is valid but the resource itself does not exist.");
            case MISTAKE -> System.out.println("Your error is not in our database...");
        }
    }
}
