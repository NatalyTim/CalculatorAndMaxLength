package ru.timofeeva;

public class ArrayMaxLength {
    /**
     * @author Timofeeva Natalia
     * @see #ArrayMaxLength(int)
     * @see #addElementsInArray(int, String)
     * @see #getMaxElementOfArray(int)
     */

    private String[] stringArray;

    public ArrayMaxLength(int quantity) {
        stringArray = new String[quantity];
    }
    /*
     * добавляем элементы в массив
     */

    public void addElementsInArray(int index, String element) throws Exception {
        if (index > stringArray.length - 1 || index < 0) {
            throw new Exception("Wrong index of array!");
        }
        if (element == null) {
            throw new Exception("Element should not be null!");
        }
        stringArray[index] = element;
    }
    /*
     *вычесляем максимальную длину элементов массива
     */

    public int maxLength() {
        int maxLength = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() > maxLength) {
                maxLength = stringArray[i].length();
            }
        }
        return maxLength;
    }

    /*
     *находим все элементы  с максимальной длиной
     */
    public void getMaxElementOfArray(int maxLength) {
        System.out.println("The largest element(s) of array is(are): ");
        for (int i = 0; i < stringArray.length; i++) {
            if (maxLength == stringArray[i].length()) {
                System.out.println(stringArray[i]);
            }
        }
    }

}

