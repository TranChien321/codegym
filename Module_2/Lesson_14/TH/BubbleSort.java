package Lesson_14.TH;

public class BubbleSort {
    static int[] list = {2,5,4,1,9,8,6};
    public  static void bubbleSort(int[] list) {
        boolean  needNextPass = true;
        for (int i = 1; i < list.length; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if(list[j] > list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;

                    needNextPass = true;
                }
            }
        }
    }
    public static void main(String[] args) {
      bubbleSort(list);
      for(int i = 0; i < list.length; i++){
          System.out.print(list[i] + " ");
      }
    }
}
