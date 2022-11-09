public class P42_JavaComparator {
    class Checker implements Comparator<Player>{
        public int compare(Player p1, Player p2){
            int scoreComparison = Integer.compare(p2.score, p1.score);
            if (scoreComparison == 0) return p1.name.compareTo(p2.name);
            return scoreComparison;
        }
        
    }
    
}
