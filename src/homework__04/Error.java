package homework__04;

public enum Error {
    HTTP400("Bad Request"),
    HTTP500("Internal Server Error"),
    HTTP401("Unauthorized"),
    HTTP402("Payment Required"),
    HTTP403("Forbidden ");

    private String number;

    Error(String number) {
        this.number = number;
    }

    Error() {

    }

    @Override
    public String toString() {
        return "HTTP error name: " + number;
    }
}
