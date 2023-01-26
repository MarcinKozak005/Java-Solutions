public class P43_JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Deque<Integer> deque = new ArrayDeque<>(m);
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxNumberOfUnique = 0;
        int tmp;
        for (int i = 0; i < n; i++) {
            tmp = in.nextInt();
            deque.add(tmp);
            incrementMap(map, tmp);
            if (deque.size() == m) {
                maxNumberOfUnique = (maxNumberOfUnique > map.size()) ? maxNumberOfUnique : map.size();
                if (maxNumberOfUnique == m) break;
                tmp = deque.pollFirst();
                decrementMap(map, tmp);
            }
        }
        System.out.println(maxNumberOfUnique);

    }

    static void incrementMap(HashMap<Integer, Integer> map, Integer key) {
        if (map.containsKey(key)) map.put(key, map.get(key) + 1);
        else map.put(key, 1);
    }

    static void decrementMap(HashMap<Integer, Integer> map, Integer key) {
        map.put(key, map.get(key) - 1);
        if (map.get(key) == 0) map.remove(key);
    }
}
