public class DisplayTime {
    public static void main(String[] args){
        int totalSecond=2560;
        int minutes=totalSecond/60;
        int remainingSeconds=totalSecond%60;
        System.out.println("Equivalent "+minutes+" Minutes and "+remainingSeconds+" seconds");
    }
}
