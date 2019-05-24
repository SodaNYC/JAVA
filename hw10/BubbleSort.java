import java.util.Arrays;
class BubbleSort {
public static void main(String[] args) {
int[] input = {2,6,3,4,11,10,7};
int temp;
for(int i =0; i<input.length-1;i++){
  for(int j =0; j<input.length-i-1;j++){
      if(input[j]>input[j+1]){
        temp = input[j];
        input[j] = input[j+1];
        input[j+1] = temp;
      }
   }
}
System.out.println(Arrays.toString(input));
}
}
