package AverageSalaryExcludingtheMinimumandMaximumSalary1491;

public class AverageSalaryExcludingtheMinimumandMaximumSalary1491 {
}


class Solution {
    public double average(int[] salary) {
        double sum = 0, min = 0, max = 0;
        if(salary[0] > salary[1]){
            max = salary[0];
            min = salary[1];
        }
        else{
            max = salary[1];
            min = salary[0];
        }
        for(int i = 0; i < salary.length; i++){
            sum += salary[i];
            if(salary[i] > max){
                max = salary[i];
            }
            if(salary[i] < min){
                min = salary[i];
            }
        }
        sum -= min;
        sum -= max;
        return sum / (salary.length - 2);

    }
}