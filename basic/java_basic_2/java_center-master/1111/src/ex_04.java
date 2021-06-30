
public class ex_04 {

   public static void main(String[] args) {
      
      int[] array = { 44, 98, 2, 5, 17 };
      // 오름차순 정렬->가장 큰 값이 오른쪽 4번 인덱스

      int maxIndex = 0;

      for (int j = 4; j > 0; j--) {
         for (int i = 0; i <= j; i++) {
            if (array[i] > array[maxIndex]) {
               maxIndex = i;
            }
         }
         int temp = array[j];
         array[j] = array[maxIndex];// {44,98,2,5,98}
         array[maxIndex] = temp;// {44,17,2,5,98}
      }
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");   
      }
      
      
      

   }

}