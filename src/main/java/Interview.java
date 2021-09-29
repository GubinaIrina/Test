import java.util.ArrayList;
import java.util.List;

public class Interview {
    public static void main(String[] args) {


    }
// Дан массив целых чисел, реализовать функцию которая возвращает значения кратным 3, рез вывести в консоль, реализовать проверки
    public int[] numBrieflyThree(int[] number) {
        if(number == null){
            return null;
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for (int num: number) {
            if (num != 0 && num % 3 == 0) {
                temp.add(num);
            }

        }

        return returnMass(temp);

    }

    private int[] returnMass(List<Integer> list){
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

}
