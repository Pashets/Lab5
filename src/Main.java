import java.lang.reflect.Array;

public class Main {


    public static Text foundMaxPalindrome(Text text, int startIndex, int finishIndex) {


        if (text.getCharQuantity() == 1) {
            return text;
        }

        for (int i = startIndex, k = 0; i < finishIndex; i++, k++) {

            char a = text.getChar(i);
            char b = text.getChar(finishIndex - k - 1);

            if (a != b) {

                Text p1 = foundMaxPalindrome(new Text(text.getMinusFirst()), startIndex + 1, finishIndex);
                Text p2 = foundMaxPalindrome(new Text(text.getMinusLast()), startIndex, finishIndex - 1);

                if (p1.getCharQuantity() > p2.getCharQuantity()) {
                    return p1;
                } else {
                    return p2;
                }
            }
        }
//        for (
//                int i = 0, s = -1 + text.getValue().length;
//
//                i < text.getValue().length;
//
//                i++, s--
//
//        ) {
//
//            for (
//                    int j = 0, t = -1 + text.getValue()[s].getValue().length;
//
//                    j < text.getValue()[i].getValue().length;
//
//                    j++, t--
//            ) {
//
//
//                for (
//                        int k = 0, u = -1 + text.getValue()[s].getValue()[t].getValue().length;
//                        k < text.getValue()[i].getValue()[j].getValue().length;
//                        k++, u--
//                ) {
//
//
//
//                    char a = text.getValue()[i]
//                            .getValue()[j]
//                            .getValue()[k]
//                            .getValue();
//
//
//                    char b = text.getValue()[s]
//                            .getValue()[t]
//                            .getValue()[u]
//                            .getValue();
//
//
////                    System.out.print(b);
//
//                    if (a != b) {
//
//
//                        Text p1 = foundMaxPalindrome(new Text(text.getMinusFirst()));
//                        Text p2 = foundMaxPalindrome(new Text(text.getMinusLast()));
//
//
//                        if (p1.getCharQuantity() > p2.getCharQuantity()) {
//                            return p1;
//                        } else {
//                            return p2;
//                        }
//
//
//                    }
//
//
//                }
//
//            }
//
//        }
        return text;
    }

    public static void main(String[] args) {

        Text text = new Text("aba");
//        System.out.println(text.getChar(0));

        System.out.println(foundMaxPalindrome(text, 0, text.getCharQuantity()));

//        Text t = new Text(text.getMinusLast());

//        System.out.println(t.getValue()[1].getlIndex());

//        Text t = new Text(new Text(text.getMinusFirst()).getMinusFirst());
//        int d = t.getValue().length;


//        Text t = new Text(text.getMinusLast());
//
//        for (int i = 0; i < 3; i++) {
//
//            System.out.println(t.getValue()[i].getlIndex());
//        }


//        for (int i = 0; i < text.getCharQuantity() ; i++) {
//            System.out.println(text.getChar(i));
//
//        }

//
//        System.out.println(text.getChar(12));
//

//        for (int i = 0; i < text.getValue().length; i++) {
//            for (int j = 0; j < text.getValue()[i].getValue().length; j++) {
//                for (int k = 0; k < text.getValue()[i].getValue()[j].getValue().length; k++) {
//                    System.out.print(text.getValue()[i].getValue()[j].getValue()[k].getValue());
//
//                }
//            }
//        }
//        for (int s = text.getValue().length / 2; s >= 0; s--) {
//
//            for (int t = text.getValue()[s].getValue().length / 2; t >= 0; t--) {
//
//                for (int u = -1 + text.getValue()[s].getValue()[t].getValue().length; u >= 0; u--) {
//
//                    char b = text.getValue()[s]
//                            .getValue()[t]
//                            .getValue()[u]
//                            .getValue();
//
//                    System.out.print(b);
//
//                }
//            }
//        }
//
//        System.out.println(text.getCharQuantity());
//        System.out.println(new Text(text.getMinusLast()).getCharQuantity());
//        System.out.println(new Text(new Text(text.getMinusLast()).getMinusLast()).getCharQuantity());
//        System.out.println(new Text(new Text(new Text(text.getMinusLast()).getMinusLast()).getMinusLast()).getCharQuantity());
//        System.out.println(new Text(new Text(new Text(new Text(text.getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getCharQuantity());
//        System.out.println(new Text(new Text(new Text(new Text(new Text(text.getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getCharQuantity());


//        System.out.println(new Text(text.getMinusLast()));
//        System.out.println(new Text(new Text(text.getMinusLast()).getMinusLast()));
//        System.out.println(new Text(new Text(new Text(text.getMinusLast()).getMinusLast()).getMinusLast()));
//        System.out.println(new Text(new Text(new Text(new Text(text.getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()));
//        System.out.println(new Text(new Text(new Text(new Text(new Text(text.getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()));
//        System.out.println(new Text(new Text(new Text(new Text(new Text(new Text(text.getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()));
//        System.out.println(new Text(new Text(new Text(new Text(new Text(new Text(new Text(text.getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()));
//        System.out.println(new Text(new Text(new Text(new Text(new Text(new Text(new Text(new Text(text.getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()));
//        System.out.println(new Text(new Text(new Text(new Text(new Text(new Text(new Text(new Text(new Text(text.getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()).getMinusLast()));
//
//
//        System.out.println(text);
//        System.out.println(new Text(text.getMinusFirst()));
//        System.out.println(new Text(new Text(text.getMinusFirst()).getMinusFirst()));
//        System.out.println(new Text(new Text(new Text(text.getMinusFirst()).getMinusFirst()).getMinusFirst()));
//        System.out.println(new Text(new Text(new Text(new Text(text.getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()));
//        System.out.println(new Text(new Text(new Text(new Text(new Text(text.getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()));
//        System.out.println(new Text(new Text(new Text(new Text(new Text(new Text(text.getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()));
//        System.out.println(new Text(new Text(new Text(new Text(new Text(new Text(new Text(text.getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()));
//        System.out.println(new Text(new Text(new Text(new Text(new Text(new Text(new Text(new Text(text.getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()));
//        System.out.println(new Text(new Text(new Text(new Text(new Text(new Text(new Text(new Text(new Text(text.getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()).getMinusFirst()));


    }
}
