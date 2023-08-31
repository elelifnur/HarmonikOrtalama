package Diziler;

public class HarmonikOrtalama {
    public static void main(String[] args){
        int[] list = {1,2,3,4,5};
        double sum = 0;
        for (double i=0; i <= list.length;i++){
           if(list.length > i){
               sum += 1/(i+1);
           }
        }

        double avarage= list.length / sum;
        System.out.println(avarage);
    }

}
