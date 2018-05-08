public class MyExceptions {


    public void MyArrayMethod(String[][] s) throws MyArrayDataException, MyArraySizeException {
        int i = 0;
        int sum = 0;
        int[][] intarray = new int[4][4];
        if (s.length != 4 || s[i].length != 4) throw new MyArraySizeException("Резмер массива не задан размером 4x4");

        for (i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                try {
                    intarray[i][j] = Integer.parseInt(s[i][j]);
                    sum += intarray[i][j];
                } catch (NumberFormatException e) {throw new MyArrayDataException("В ячейке массива " + i + " " + j + " лежит неверное значение");}
            }

        }
                System.out.println(sum);
    }
}