public class Prog2 {

    public static void main(String[] args) {
        
    float avgTempDay=0,avgTempWeak=0;
    float daySum=0,totalSum=0;
    int count=0;
       double[][] tempReadings = { // Jagged Array
            {38.5, 38.9, 39.1, 40.3, 39.7}, // Monday
            {38.3, 38.6, 37.7, 37.5},       // Tuesday
            {39.1, 39.5, 39.9, 40.8, 40.6}, // Wednesday
            {39.0, 39.2},                   // Thursday
            {36.6, 36.9, 37.1}              // Friday
        };

        for(int i=0;i<tempReadings.length;i++){
            daySum = 0;
            for(int j=0;j<tempReadings[i].length;j++){
                daySum += tempReadings[i][j];
                totalSum += tempReadings[i][j];
                System.out.print(tempReadings[i][j]+ " ");
            }
            count +=tempReadings[i].length;
            avgTempDay = daySum / tempReadings[i].length;
            System.out.println("Avg Temp Day,"+avgTempDay);
            System.out.print("\n");
        }
        System.out.printf("Total Average: %.2f%n",(totalSum/count));
    }
}
