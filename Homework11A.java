import java.util.ArrayList;

public class Homework11A extends Homework11{

public Homework11A(ArrayList<Integer> list){
  super(list);
}


/* Problem 4:
* Write the method problem4 in the Homework11A
* class. This should calculate and return the sum
* of the values in the stored ArrayList. The method
* header is:
* public int problem4() {
*/
public int problem4(ArrayList<Integer> bo){
  int sum = 0;
  for(int i = 0; i < bo.size(); i++){
    sum += bo.get(i);
  }
  return sum;
}
/* Problem 5:
* In the Homework11A class, override the problem2
* method. problem2 in Homework11A should instead
* only keep the elements that evenly divide n
*/
public void problem2(int n) {
 for(int i =0; i < arr.size(); i++){
   if((arr.get(i) / n) % 2 != 0){
     arr.remove(i);
     i--;
   }
 }
}
}
