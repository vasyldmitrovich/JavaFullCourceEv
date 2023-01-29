package com.softserve.edu04.homework.task1.task1_3;

public enum ErrorDescription {

    BAD_REQUEST("Error 400: Bad Request"),
    UNAUTHORIZED("Error 401: Unauthorized"),
    PAYMENT_REQUIRED("Error 402: Payment Required"),
    FORBIDDEN("Error 403: Forbidden"),
    NOT_FOUND("Error 404: Not found"),
    METHOD_NOT_ALLOWED("Error 405: Method not allowed"),
    NOT_ACCEPTABLE("Error 406: Not Acceptable"),
    PROXY_AUTHENTICATION_REQUIRED("Error 407: Proxy authentication required"),
    REQUEST_TIMEOUT("Error 408: Request timeout"),
    CONFLICT("Error 409: Conflict"),
    GONE("Error 401: Gone"),
    LENGTH_REQUIRED("Error 411: Length required"),
    PRECONDITION_FAILED("Error 412: Precondition failed"),
    PAYLOAD_TOO_LARGE("Error 413: Payload too large"),
    URI_TOO_LONG("Error 414: Uri too long"),
    UNSUPPORTED_MEDIA_TYPE("Error 415: Unsupported media type"),
    RANGE_NOT_SATISFIABLE("Error 416: Range not satisfiable"),
    EXPECTATION_FAILED("Error 417: Expectation failed"),
    I_AM_A_TEAPOT("Error 418: I'm a teapot"),
    MISDIRECTED_REQUEST("Error 421: Misdirected request"),
    UNPROCESSABLE_ENTITY("Error 422: Unprocessable entity"),
    LOCKED("Error 423: Locked"),
    FAILED_DEPENDENCY("Error 424: Failed dependency"),
    TOO_EARLY("Error 425: Too early"),
    UPGRADE_REQUIRED("Error 426: Upgrade required"),
    PRECONDITION_REQUIRED("Error 428: Precondition required"),
    TOO_MANY_REQUESTS("Error 429: Too many requests"),
    REQUESTS_HEADER_FIELDS_TOO_LARGE("Error 431: Requests header fields too large"),
    UNAVAILABLE_FOR_LEGAL_REASONS("Error 451: Unavailable for legal reasons");

    private final String name;

      ErrorDescription(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
