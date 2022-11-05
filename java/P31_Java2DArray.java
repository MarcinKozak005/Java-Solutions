public class P31_Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
    // My code
        int largest = Integer.MIN_VALUE;
        int currentHourglassSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.size()-2;i++){
            for(int j=0;j<arr.get(0).size()-2;j++){
                currentHourglassSum = getHourglassSum(arr, i, j);
                largest = ( currentHourglassSum> largest)? currentHourglassSum:largest;
            }
        }
        System.out.println(largest);
    }
    
    public static int getHourglassSum(List<List<Integer>> arr, int i,int j)
    {
        return
        arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) +
        arr.get(i+1).get(j+1) +
        arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
    }
    // End of my code
}
