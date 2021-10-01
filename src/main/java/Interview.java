

public class Interview {
    public static void main(String[] args) {


    }

//    Реализуйте функцию, которая для заданного числа (int) печатает «foo», если это число делится на 3 без остатка,
//    печатает «bar», если это число делится на 5 без остатка, печатает «foobar», если это число делится на 15 без остатка,
//    печатает само число в остальных случаях. Покрыть тестами.

    public String foobar(int num) {
        String message;
        if (num == 0) {
            message = String.valueOf(0);
            System.out.println(message);
        } else if (num % 15 == 0) {
            message = "foobar";
            System.out.println(message);
        } else if (num % 5 == 0) {
            message = "bar";
            System.out.println(message);
        } else if (num % 3 == 0) {
            message = "foo";
            System.out.println(message);
        } else {
            message = String.valueOf(num);
            System.out.println(message);
        }
        return message;
    }


}
