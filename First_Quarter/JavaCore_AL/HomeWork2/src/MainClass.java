public class MainClass {

    public static void main(String[] args) {
        MyExceptions MyEx = new MyExceptions();
        int i = 0;
        String [][] s = {{"1", "1", "1", "1"},{"2", "2", "2", "2"},{"3", "3", "3", "3"},{"4", "4", "4", "4"}};
        try {
            try {
                MyEx.MyArrayMethod(s);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}
