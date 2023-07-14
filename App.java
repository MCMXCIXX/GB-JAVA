import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       randomNumbers(7, 10);
       planetCounter(7);
    }

    static void planetCounter(int n){
        List<String> listPlanets = List.of("Mercury", "Venus", "Earth", "Mars", "Saturn","Pluto","Neptun");
        List<String> randPlanets = new ArrayList<String>(n); 
        int[] counts = new int[listPlanets.size() ];
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            randPlanets.add(listPlanets.get(rand.nextInt(listPlanets.size())));
        }
        List<String> randPlanetsD = randPlanets.stream().distinct().collect(Collectors.toList());

        for (int i = 0; i < randPlanetsD.size(); i++) {
            System.out.print(randPlanetsD.get(i) + " ");
            counts[listPlanets.indexOf(randPlanetsD.get(i))]++;
        }
        
        System.out.println();

        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%s -  %s\n", listPlanets.get(i), counts[i]);
        }
    }




    static void randomNumbers(int size, int maxValue){
        ArrayList<Integer> nums = new ArrayList<>(size);
        Random rand = new Random();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for (int i = 0; i < size; i++) {
            nums.add(rand.nextInt(maxValue));
            if (nums.get(i) % 2 == 0){
                odd.add(nums.get(i));
            }
        }
        int min = nums.get(0);
        int max = nums.get(0);
        int sum = 0;
        int medium = 0;
        for (int i = 0; i < size; i++) {
            if(nums.get(i) < min){
                min = nums.get(i);
            }
        }
        for (int i = 0; i < size; i++) {
            if(nums.get(i) > max){
                max = nums.get(i);
            }
        }
        for (int i = 0; i < size; i++) {
            
            sum = sum + nums.get(i);
        }
        medium = sum / size;
        System.out.println(nums);
        System.out.println(odd);
        System.out.println(min);
        System.out.println(max);
        System.out.println(medium);
    }
}
