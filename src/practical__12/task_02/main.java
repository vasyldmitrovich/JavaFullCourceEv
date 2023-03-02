package practical__12.task_02;

public class main {
    public static void main(String[] args) throws ColorExeption, TypeException {

        run();

    }


    public static void run() throws ColorExeption, TypeException {


        Plant[] arr = new Plant[]{

                new Plant(15, "yellow", "steppe"),
                new Plant(17, "green", "marshy"),
                new Plant(25, "green", "forest"),
                new Plant(13, "red", "forest"),
                new Plant(19, "brown", "steppe")
        };

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);
        }


    }


}
