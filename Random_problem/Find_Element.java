package Random_problem;

public class Find_Element {
    static void main(String[] args) {
        int[] arr={2,3,4,6};
        int target = 4;
        int index = 0;
        System.out.println("At index = "+find(arr,target,index));
    }
    static int find(int[] arr, int target,int index){
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        else {
            return find(arr,target,index+1);
        }
    }
}
