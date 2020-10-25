public class Lesson2DZ {
    public static void main(String[] args){
        
        //задание 1
        int[] anArray = {1,0,1,1,0,1,0,0,0,1,0};
        PrintArray(anArray);
        for (int i = 0; i< anArray.length; i++ ){
            switch (anArray[i]){
                case 0:{
                    anArray[i] = 1;
                    break;
                }
                case 1:{
                    anArray[i] = 0;
                    break;
                }
            }
        }
        PrintArray(anArray);

        //задание 2
        int[] anArray2;
        anArray2 = new int[8];
        int iterationVariable =0;
        for (int i = 0; i< anArray2.length;i++){
            anArray2[i] = iterationVariable;
            iterationVariable +=3;
        }
        PrintArray(anArray2);

        //задание 3
        int[] anArray3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        PrintArray(anArray3);
        for (int i = 0; i < anArray.length; i++) {
            if(anArray3[i] < 6){
                anArray3[i] *= 2;
            }
        }
        PrintArray(anArray3);

        //задание 4
        int [][] anArray4 = new int[5][5];
        PrintTwoDimensionalArray(anArray4);
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i == j ){
                    anArray4[i][j] = 1;
                }
            }
        }
        PrintTwoDimensionalArray(anArray4);

        //задание 5
        int[] anArray5 = {1,5,2,6,2,8,4};
        PrintArray(anArray5);
        SearchMinMaxArray(anArray5);

        //задание 6
        int[] anArray6 = {2,2,3,1,4,4};
        PrintArray(anArray6);
        System.out.println("Проверка массива на равнозначные части:");
        System.out.println(CheckBalance(anArray6));

        //задание 7
        int[] array = {1,2,3,4,5,6,7};
        DeposeToNArray( array,3);
    }
    public static void PrintArray(int[] array){
        for (int i = 0; i< array.length; i++ )  {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    public static void PrintTwoDimensionalArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static void SearchMinMaxArray(int[] array){
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > array[max]){
                max = i;
            } else if(array[i] < array[min]){
                min = i;
            }
        }
        System.out.println("Максимальное число - " + array[max] + ", минимальное число - "+ array[min]);
    }
    public static boolean CheckBalance(int[] array){
        int leftSum = 0;
        int rightSum = 0;
        int leftCounter = 0;
        int rightCounter = array.length-1;
        int sumCounter = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0){
                leftSum += array[leftCounter];
                rightSum += array[rightCounter];
                leftCounter += 1;
                rightCounter -= 1;
                sumCounter +=2;
            } else {
                if (leftSum < rightSum){
                    leftSum += array[leftCounter];
                    leftCounter += 1;
                    sumCounter +=1;
                } else if(leftSum > rightSum){
                    rightSum += array[rightCounter];
                    rightCounter -= 1;
                    sumCounter +=1;
                } else if(leftSum == rightSum){
                    if(sumCounter == array.length - 1){
                        return true;
                    } else {
                        leftSum += array[leftCounter];
                        leftCounter += 1;
                        rightSum += array[rightCounter];
                        rightCounter -= 1;
                        sumCounter +=1;
                    }
                }
            }
        }
        return false;
    }
    public static void DeposeToNArray(int[] array, int n){
        n = Math.abs(n);
        int newLengthArray = array.length + n;
        int[] newArray = new int[newLengthArray];
        PrintArray(array);
        for (int i = 0; i < newArray.length; i++) {
            if(i<n){
                newArray[i] = 0;
            }else{
                newArray[i] = array[i-n];
            }
        }
        PrintArray(newArray);
    }

}
