package method;

public class MethodEx2Ref {
    public static void main(String[] args) {
        printMessage("은식아",1);
        printMessage("맥주 마실래",1);
        printMessage("소주마실래",1);
    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
    }
}
}









//
//
//    }
//        String message = "Hello, world!";
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(message);
//        }
//
//        for (int i = 0; i<5; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i<7; i++) {
//            System.out.println(message);
//    }
//}
