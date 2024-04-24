
public class InsertIntoArray {

    public int[] insertElement(int[] arr, int element, int pos) throws IllegalArgumentException {

        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Invalid position to insert.");
        }

        int[] newArr = new int[arr.length + 1];


            for (int i = 0, j = 0; i < newArr.length; i++) {
                if (i == pos) {
                    newArr[i] = element;
                } else {
                    newArr[i] = arr[j++];
                }
            }

        return newArr;
    }
}
