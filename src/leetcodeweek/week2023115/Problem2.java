package leetcodeweek.week2023115;

import javax.lang.model.element.VariableElement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Robert17
 * @create2023-11-05-11:05
 */
public class Problem2
{
    public int findChampion(int n, int[][] edges) {
        if (n == 1){
            return 0;
        }
        if (n > 1 && edges.length < n-1){
            return -1;
        }
        Set<Integer> list1 = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();
        for (int i = 0; i < edges[0].length; i++)
        {
            for (int j = 0; j < edges.length; j++)
            {
                if (i == 0){
                    list1.add(edges[j][i]);
                }else {
                    list2.add(edges[j][i]);
                }
            }
        }
        list1.addAll(list2);
        if (list1.size() != n){
            return -1;
        }
        list1.removeAll(list2);
        if (list1.size() == 1){
            return list1.iterator().next();
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Problem2 problem2 = new Problem2();
        int[][] nums = {{0,1},{2,0},{2,1}};
        int champion = problem2.findChampion(3, nums);
        System.out.println(champion);
    }
}
