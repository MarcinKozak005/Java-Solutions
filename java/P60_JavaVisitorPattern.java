public class P60_JavaVisitorPattern {
    class SumInLeavesVisitor extends TreeVis {
        int result = 0;
        public int getResult() {
            return result;
        }
    
        public void visitNode(TreeNode node) {}
    
        public void visitLeaf(TreeLeaf leaf) {
              result += leaf.getValue();
        }
    }
    
    class ProductOfRedNodesVisitor extends TreeVis {
        long result = 1;
        public int getResult() {
            return (int)result;
        }
    
        public void visitNode(TreeNode node) {
              if(node.getColor() == Color.RED){
                  result *= node.getValue();
                  result %= (1000000007);
              }
        }
    
        public void visitLeaf(TreeLeaf leaf) {
              if(leaf.getColor() == Color.RED){
                result *= leaf.getValue();
                result %= (1000000007);
            }
        }
    }
    
    class FancyVisitor extends TreeVis {
        int nonLeafEvenDepthSum = 0;
        int greenLeafsSum = 0;
        public int getResult() {
            return Math.abs(greenLeafsSum-nonLeafEvenDepthSum);
        }
    
        public void visitNode(TreeNode node) {
            if(node.getDepth() % 2 == 0)
                nonLeafEvenDepthSum += node.getValue();
        }
    
        public void visitLeaf(TreeLeaf leaf) {
            if(leaf.getColor() == Color.GREEN)
                greenLeafsSum += leaf.getValue();
        }
    }
    
    public class Solution {
        static int[] values;
        static int[] parents; 
        static int[] depths;
        static Color[] colors;
        static HashMap<Integer, LinkedList<Integer>> connections = new HashMap<>();
        static HashMap<Integer, LinkedList<Integer>> children = new HashMap<>();
        static HashSet<Integer> appearedNodes = new HashSet<>();
        static HashSet<Integer> notLeaves = new HashSet<>();
        static void calculateDepth(int i, int currentDepth){
            depths[i] = currentDepth;
            for(Integer e: connections.get(i)){
                if (e != 1 && depths[e] == 0) {
                    calculateDepth(e, currentDepth + 1);
                    if (!children.containsKey(i)) children.put(i,new LinkedList<Integer>());
                    children.get(i).add(e);
                }
            }
        }
        
        public static Tree solve() {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            values =  new int[n+1];    // index 0 is not used
            parents = new int[n+1];    // index 0 is not used
            colors =  new Color[n+1];  // index 0 is not used
            // Fill tabs with values
            // nextInt() -> next() ?
            for(int i=1;i<=n;i++) values[i] = s.nextInt();
            for(int i=1;i<=n;i++) colors[i] = s.nextInt()==0?Color.RED:Color.GREEN;
            // Connections
            int u, v, smaller, greater;
            for(int tmp=0;tmp<n-1;tmp++){
                u = s.nextInt();
                v = s.nextInt();
                smaller = (int) Math.min(u,v);
                greater = (int) Math.max(u,v);
                // save connections
                if (!connections.containsKey(smaller))
                    connections.put(smaller, new LinkedList<Integer>());
                if (!connections.containsKey(greater))
                    connections.put(greater, new LinkedList<Integer>());
                connections.get(smaller).add(greater);
                connections.get(greater).add(smaller);
                // Save nodes to compute which one are leaves
                if (appearedNodes.contains(smaller)) notLeaves.add(smaller);
                if (appearedNodes.contains(greater)) notLeaves.add(greater);
                appearedNodes.add(smaller);
                appearedNodes.add(greater);
            }
            s.close();
            // calculate depths
            depths = new int[n+1];
            calculateDepth(1,0);
            
            // Create Trees
            Tree[] trees = new Tree[n+1]; // index 0 is not used
            for(int i=1;i<=n;i++){
                if(notLeaves.contains(i))
                    trees[i] = new TreeNode(values[i], colors[i], depths[i]);
                else
                    trees[i] = new TreeLeaf(values[i], colors[i], depths[i]);
            }
            // Create tree edges
            for(int i=1;i<=n;i++){
                if(notLeaves.contains(i)){
                    for(Integer e: children.get(i))
                    {
                        if(i!=e) ((TreeNode)trees[i]).addChild(trees[e]);
                    }
                }
            }
            return trees[1];
        }
}
