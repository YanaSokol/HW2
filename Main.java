package lesson2;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        try {
            createArray();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
    public static void createArray() throws MyArraySizeException, MyArrayDataException {
        String[][] arr = {
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"},
                {"1","2","3","4"}
        };

        int sum = 0;
        if (arr.length != 4) throw new MyArraySizeException();
        if (arr[0].length != 4) throw new MyArraySizeException();

        for(int i=0; i < arr.length; i++){
            for(int j=0; i < arr[i].length; j++) {
                try {
                    sum = sum + parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Неправильное значение");
                }
            }
        }
        System.out.println(sum);
    }
}


