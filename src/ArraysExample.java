

class ArraysExample{
    public static void main(String[] args){
        int[] numbers = {3, 7, 6, 13, 33, 9, -100, 25};
        int i = 0;
        while (numbers[i] >= -100){
            System.out.println(numbers[i]);
            i++;
        }
    }
}