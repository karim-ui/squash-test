package ocp;


import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Fox {
    public List<String> getStrings() {
        return strings;
    }

    public List<String> strings = new ArrayList<>();
    // TODO: 19/06/2024  Exercise3: maxLoss

/*
public static int maxLoss(int[] prices) {
    int maxLoss = 0;
    int highestPrice = prices[0];
    for (int i = 1; i < prices.length; i++) {
        if (prices[i] > highestPrice) {
            highestPrice = prices[i];
        } else {
            int loss = highestPrice - prices[i];
            if (loss > maxLoss) {
                maxLoss = loss;
            }
        }
    }
    return maxLoss;
}
*/

    // TODO: 19/06/2024  Exercise4: irrigated
/*

    static class Pos {
        public int x;
        public int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof Pos pos)) {
                return false;
            } else {
                return this.x == pos.x && this.y == pos.y;
            }

        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public int irrigated(boolean[][] garden) {
        HashSet<Pos> set = new HashSet<>();
        for (int i = 0; i < garden.length; i++) {
            for (int j = 0; j < garden[i].length; j++) {
                if (garden[i][j]) {
                    for (int k = Math.max(i - 1, 0); k <= Math.min(garden.length - 1, i + 1); k++) {
                        for (int l = Math.max(j - 1, 0); l <= Math.min(garden[i].length - 1, j + 1); l++) {
                            if (!garden[k][l]) {
                                set.add(new Pos(k, l));
                            }
                        }
                    }
                }
            }
        }
        return set.size();
    }
*/

    // TODO: 19/06/2024  Exercise1: scores
/*
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int resA = 0;
        int resB = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) resA++;
            else if (a.get(i) < b.get(i)) resB++;
        }
        return Arrays.asList(resA, resB);


    }
*/

    // TODO: 19/06/2024 Exercise2: sum big ints
/*
    public static long aVeryBigSum(List<Long> ar) {

        return ar.stream().mapToLong(x -> x).sum();
    }
*/
    // TODO: 19/06/2024 Exercise5: sum left and right diagonal

    /*
        public static int diagonalDifference(List<List<Integer>> arr) {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < arr.size(); i++) {
                for (int j = 0; j < arr.size(); j++) {
                    if (i == j && j == arr.size() - 1 - i) {
                        leftSum += arr.get(i).get(j);
                        rightSum += arr.get(i).get(j);
                    } else if (j == arr.size() - 1 - i) rightSum += arr.get(i).get(j);
                    else if (i == j) leftSum += arr.get(i).get(j);
                }
            }
            return Math.abs(leftSum - rightSum);


        }
    */
    // TODO: 19/06/2024 Exercise6: ratio
/*
    public static void plusMinus(List<Integer> arr) {

        // mine that has 4/12 failled:
        Map<String, Float> ints = new HashMap<>();
        int p = 0;
        int n = 0;
        int z = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) ints.put("-",(float) ++n / arr.size());
            if (arr.get(i) > 0) ints.put("+", (float) ++p / arr.size());
            if (arr.get(i) == 0) ints.put("0",(float) ++z / arr.size());
        }

        System.out.printf("%1.6f \n", ints.get("+"));
        System.out.printf("%1.6f \n", ints.get("-"));
        System.out.printf("%1.6f \n", ints.get("0"));


        // theirs :
        int sumP=0;
        int sumN=0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) sumN++;
            else if (arr.get(i) > 0) sumP++;
        }

        System.out.printf("%1.6f \n", (float)(sumP/arr.size()));
        System.out.printf("%1.6f \n", (float)(sumN/arr.size()));
        System.out.printf("%1.6f \n", (float)((arr.size()-sumN-sumP)/arr.size()));
}

*/
    // TODO: 21/06/2024 exercise7: upstairs
    /*
        public static void staircase(int n) {
    for(int i=0;i<n;i++)
    {

            for(int j=0;j<n;j++)
    {

        if(n-i-1<=j && j<=n-1) System.out.print("#");
        else System.out.print(" ");
    }
        System.out.print("\n");
    }

}
     */
    /*public static void miniMaxSum(List<Integer> arr) {

        long min=0;
        long max=0;
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++)
        {
            if(i<4) min +=arr.get(i);
            if(i>=arr.size()-4) max+=arr.get(i);
        }
        System.out.print(min+" "+max);

    }*/
    // TODO: 21/06/2024 exercise 8: birthday cake:

    /* public static int birthdayCakeCandles(List<Integer> candles) {
          // Write your code here

          int max =candles.get(0);
          int k=1;
          if(candles.size()==1) return 1;
          for(int i=1;i<candles.size();i++)
          {
              if(candles.get(i)>max)
              {
                  max=candles.get(i);    k=1;
              }
              else if(max==candles.get(i)) k++;
          }
          return k;
      }*/
    // TODO: 21/06/2024  exercise 9: time conversion
  /*  public static String timeConversion(String s) {

        String time = s;
        String AMPM = s.substring(8, 10);
        String heure = s.substring(0, 2);
        if (AMPM.equals("AM")) {
            time = (heure.equals("12")) ? s.replace("12", "00") : s;
        } else if (AMPM.equals("PM") && !heure.equals("12"))
            time = s.replace(heure, String.valueOf(Integer.valueOf(heure) + 12));
        return time.substring(0, 8);


    }
*/
    // TODO: 21/06/2024 exercise 10 graade rounding
    /*
        public static List<Integer> gradingStudents(List<Integer> grades) {

  return  grades.stream().map(g->
    {
            int diff=5-(g.intValue()%5);

         if(g>=38 && diff < 3) return g+diff;
         return g;
           }).collect(Collectors.toList());

    }

}
     */
    // TODO: 22/06/2024 exercise 11: apples and oranges
    /*
     public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        int numberOfApples=0;
        int numberOfOranges=0;

        for(int i=0;i<apples.size();i++)
        {
            if(t>=apples.get(i)+a && apples.get(i)+a>=s ) numberOfApples++;
        }
        for(int i=0;i<oranges.size();i++)
        {
            if(t>=oranges.get(i)+b && oranges.get(i)+b>=s ) numberOfOranges++;
        }

        System.out.println(numberOfApples);
        System.out.println(numberOfOranges);

    }
     */
    // TODO: 22/06/2024 exercise 12: kangoro
    /*
    public static String kangaroo(int x1, int v1, int x2, int v2) {


            if(v1<=v2 || (x2-x1)%(v1-v2)!=0) return "NO";

            return "YES";

    }
     */
    // TODO: 22/06/2024 exercise 13: scores
    /*
    public static List<Integer> breakingRecords(List<Integer> scores) {


            int maxBroken=0;
            int minBroken=0;
            int minPoint=scores.get(0);
            int maxPoint=scores.get(0);
            for(int i=1;i<scores.size();i++)
            {
                if(scores.get(i)>maxPoint)
                {
                    maxPoint=scores.get(i);maxBroken++;
                }
                else if(minPoint>scores.get(i))
                {
                    minPoint=scores.get(i);
                    minBroken++;
                }
            }

            return Arrays.asList(maxBroken,minBroken);

    }
     */
    // TODO: 22/06/2024  exercise 14: chocolat bar (didn't fully undertand)
    /*
     public static int birthday(List<Integer> s, int d, int m) {
      int ans = 0;
        for (int i = 0; i < s.size(); i++) {
            int n = 0;
            int count = 0;
            while (n < m) {
                count += s.get(i + n);
                n++;
            }
            if (count == d) {
                ans++;
            }
            if (i + n == s.size()) {
                break;
            }
        }
        return ans;
            }
    }
     */
    // TODO: 28/08/2024 execise 15: sum is divisible by k
    /*
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int res=0;
    Collections.sort(ar);
    Integer[] tab=ar.toArray(new Integer[0]);
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if((tab[i]+tab[j])%k==0) res++;
        }
    }
return res;
    }

     */
    // TODO: 29/08/2024 migratory bird
    /*
    public static int migratoryBirds(List<Integer> arr) {

            Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int birdType : arr) {
            frequencyMap.put(birdType, frequencyMap.getOrDefault(birdType, 0) + 1);
        }

        int maxFrequency = 0;
        int minId = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int birdType = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency || (frequency == maxFrequency && birdType < minId)) {
                maxFrequency = frequency;
                minId = birdType;
            }
        }

        return minId;
    }
     */
    // TODO: 29/08/2024 russian date
    /*
    public static String dayOfProgrammer(int year) {

     if(year<1918){
         //it's a leap julien year
        if(year%4==0)  {return "12.09."+year; }
        else {return "13.09."+year;}
     }
     else  {
         if(year==1918) {

            return "26.09."+year;
         } else {

          if(year%400==0 || (year%4==0 && year%100!=0))
          {
              return "12.09."+year;

          }
       else {return "13.09."+year;}
     }}


    }
     */
    // TODO: 29/08/2024 bill division
    /*
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int sum=0;
        for (int i=0;i<bill.size();i++)
        {
            if(bill.get(i)!=bill.get(k)) sum+=bill.get(i);
        }
        System.out.println(b == sum/2 ? "Bon Appetit" : b-(sum/2) );

    }
     */
    // TODO: 30/08/2024 sock merchant
    /*
    public static int sockMerchant(int n, List<Integer> ar) {

        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

        ar.forEach(m->
        {
            map.put(m,(map.getOrDefault(m,0))+1);

        });

        return map.values().stream().mapToInt(v->v/2).sum();

    }
     */
    // TODO: 05/09/2024  Custom iterator
    /*
    interface NestedInteger {

    public boolean isInteger();

    public Integer getInteger();

    public List<NestedInteger> getList();
}

class NestedIterator implements Iterator<Integer> {
    private List<Integer> flatNumbers;
    int index = 0;

    public NestedIterator(List<NestedInteger> nestedList) {
        this.flatNumbers = flatToList(nestedList);

    }

    List<Integer> flatToList(List<NestedInteger> nestedIntegers) {
        List<Integer> integers=new ArrayList<>();

        for (NestedInteger nestedInteger : nestedIntegers) {
            if (nestedInteger.isInteger()) integers.add(nestedInteger.getInteger());
            else integers.addAll(flatToList(nestedInteger.getList()));
        }
        return integers;
    }

    @Override
    public Integer next() {
        return flatNumbers.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < flatNumbers.size();
    }
}
     */
    // TODO: 06/09/2024 integer break
    /*
     public int integerBreak(int n) {

         if(n==2 || n==3) return n-1;
        if(n<=1) return 0;

        int[] dp=new int[n+1];
        dp[1]=1;
        for(int i=4;i<dp.length;i++)
        {
            for(int j=1;j<i;j++)
            {

                dp[i]=Math.max(dp[i],Math.max((i-j)*j,dp[i-j]*j));
            }
    }
    return dp[n];


    }
     */


    public static String s;

    public void testme() throws IOException {
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    {

    }


    public static void main(String[] args) {

        Integer i = Integer.valueOf(5);
        Integer p = null;
        System.out.println(i + p);

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class X {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {


        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = i; j < drives.length; j++) {
                map.put(keyboards[i], drives[i]);
            }
        }

        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().filter(entry -> entry.getValue() + entry.getKey() <= b).collect(Collectors.toList());
        return 1;
    }

    int sum = 0;
    StringBuilder res = new StringBuilder("");

    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> edges = new HashMap<>();
        for (List<Integer> row : wall) {
            int sum = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                edges.put(sum, edges.getOrDefault(sum, 0) + 1);
            }
        }
        int maxEdges = 0;
        for (int edge : edges.values()) {
            maxEdges = Math.max(maxEdges, edge);
        }
        return wall.size() - maxEdges;
    }

    public int[] missingRolls(int[] rolls, int mean, int n) {

        int leftTotal = 0;
        for (int i = 0; i < rolls.length; i++) leftTotal += rolls[i];

        int rightTotal = (rolls.length + n) * mean - leftTotal;
        if (6 * n < rightTotal || rightTotal < n) return new int[]{};


        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            if (rightTotal % n == 0)
                ints[i] = rightTotal / n;
            else {
                if (i == n - 1) ints[i] = 1 + rightTotal / n;
                else ints[i] = rightTotal / n;
            }
        }
        return ints;
    }

    public int getRootToLeaff(TreeNode node, String total) {
        concatenateRoots(node, "");
        return sum;
    }

    public void concatenateRoots(TreeNode root, String str) {

        if (root == null) return;
        str += root.val;

        if (root.right == null && root.left == null) {
            sum += Integer.parseInt(str);
            return;
        }

        getRootToLeaff(root.left, str);
        getRootToLeaff(root.right, str);

    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) return new TreeNode(val, root, null);
        travel(root, val, depth - 1);
        return root;
    }

    private void travel(TreeNode root, int val, int depth) {
        if (root == null) return;
        if (depth == 1) {
            root.right = new TreeNode(val, null, root.right);
            root.left = new TreeNode(val, root.left, null);
            return;
        }
        travel(root.left, val, depth - 1);
        travel(root.right, val, depth - 1);

    }

    public String smallestFromLeaff(TreeNode root) {

        return searchSmallest(root, new StringBuilder());

    }

    public int rootToLeaf(TreeNode root) {
        travell(root, new StringBuilder());
        return sum;
    }

    private void travell(TreeNode root, StringBuilder s) {
        if (root == null) return;
        s.append(root.val);

        if (root.right == null && root.left == null) {
            sum += Integer.parseInt(s.toString());
        }
        ;
        travell(root.left, new StringBuilder(s));
        travell(root.right, new StringBuilder(s));


    }

    private String result = "";

    private String searchSmallest(TreeNode root, StringBuilder res) {

        if (root == null) {
            return null;
        }
        res.insert(0, transform(root.val));
        if (root.right == null && root.left == null) return res.toString();
        String left = searchSmallest(root.left, new StringBuilder(res));
        String right = searchSmallest(root.right, new StringBuilder(res));
        if (left == null) return right;
        if (right == null) return left;
        return left.compareTo(right) <= 0 ? left : right;

    }

    public String smallestFromLeaf(TreeNode root) {
        helper(root, new StringBuilder());
        return result;
    }

    private void helper(TreeNode root, StringBuilder s) {
        if (root == null) return;
        char c = (char) ('a' + root.val);
        s.insert(0, c);
        if (root.left == null && root.right == null) {
            String pathString = s.toString();
            if (result == "" || pathString.compareTo(result) < 0) {
                result = pathString;
            }

            // return;
        } else {
            if (root.left != null) helper(root.left, s);
            if (root.right != null) helper(root.right, s);
        }

        s.delete(0, 1);
    }

    private String travelll(TreeNode root, StringBuilder stringBuilder) {

        if (root == null) return null;

        stringBuilder.insert(0, transform(root.val));
        if (root.left == null && root.right == null) {
            return stringBuilder.toString();
        }

        String left = travelll(root.left, new StringBuilder(stringBuilder));
        String right = travelll(root.right, new StringBuilder(stringBuilder));

        return left.compareTo(right) <= 0 ? left : right;

    }

    public char transform(int n) {
        return (char) ('a' + n);
    }

    public int rec(int a) {
        if (a == 1) return 1;
        if (a == 2) return 2;
        return rec(a - 1);
    }


    public static void main(String[] args) {
        List<D> list = new ArrayList<>();
        var res = list.stream().map(p -> p.getName()).collect(Collectors.toList());


    }

    StringBuilder res1 = new StringBuilder();
    StringBuilder res2 = new StringBuilder();

    static String catAndMouse(int x, int y, int z) {
        return Math.abs(z - x) != Math.abs(z - y) ? (Math.abs(z - x) < Math.abs(z - y) ? "Cat A" : "Cat B") : "Mouse C";

    }

    interface D {
        public String getName();
    }

    class TestD implements D {
        public String getName() {
            return name;
        }

        public String name;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        travelLink(l1, res1);
        travelLink(l2, res2);
        BigInteger b1 = new BigInteger(res1.toString());
        BigInteger b2 = new BigInteger(res2.toString());

        BigInteger res = b1.add(b2);
        char[] chars = String.valueOf(res).toCharArray();
        ListNode listNode = null;
        for (char c : chars) {
            ListNode tmp = new ListNode(Character.getNumericValue(c));
            tmp.next = listNode;
            listNode = tmp;
        }
        return listNode;

    }

    private void travelLink(ListNode node, StringBuilder res) {
        if (node == null) return;
        res.insert(0, node.val);
        travelLink(node.next, res);
    }

    public ListNode swapPairs(ListNode head) {

        ListNode res = travellll(head);
        return res;

    }

    private ListNode travellll(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode tmp = head.next;
        head.next = travellll(tmp.next);
        tmp.next = head;

        return tmp;

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

interface I {
}

class A implements I {
    public boolean isPal(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        return s.equals(sb.toString());
    }

    public String shortestPalindrome(String s) {
        if (isPal(s)) return s;
        for (int i = 0; i < s.length(); i++) {
            if (isPal(s.substring(0, s.length() - i))) {
                return new StringBuilder(s.substring(s.length() - i, s.length())).reverse().toString().concat(s);
            }
        }

        return null;
    }

    public int longestIdealString(String s, int k) {

        int longest = 0;
        if (s == null || s.isEmpty()) return longest;
        char[] chars = s.toCharArray();
        char ref = chars[0];
        int max = 0;
        for (int m = 0; m < chars.length; m++) {
            ref = chars[m];
            longest = 0;
            for (int i = 1; i < chars.length; i++) {
                if (Math.abs(chars[i] - ref) <= k) {
                    longest++;
                    ref = chars[i];
                }
            }
            if (longest > max) max = longest;
        }
        return max;
    }

    public static int[] ComputeFinalPosition(int width, int height, int[] position, int[] portalA, int[] portalB, String moves) {
        boolean mooved = false;
        for (char move : moves.toCharArray()) {
            System.out.println(move);
            switch (move) {
                case 'U':
                    if (position[1] - 1 >= 0) {
                        position[1]--;
                        mooved = true;
                    }
                    break;
                case 'D':
                    if (position[1] + 1 < height) {
                        position[1]++;
                        mooved = true;
                    }
                    break;
                case 'R':
                    if (position[0] + 1 < width) {
                        position[0]++;
                        mooved = true;
                    }
                    break;
                case 'L':
                    if (position[0] - 1 >= 0) {
                        position[0]--;
                        mooved = true;
                    }
                    break;
            }
            if(mooved==true){
                if (position[0] == portalA[0] && position[1] == portalA[1]) {
                    position[0] = portalB[0];
                    position[1] = portalB[1];
                }
                else if (position[0] == portalB[0] && position[1] == portalB[1]) {
                    position[0] = portalA[0];
                    position[1] = portalA[1];
                }
                mooved=false;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        var moves = "RL";
        int width = 5;
        int height = 4;
        int[] position = {1, 1};
        int[] portalA = {2, 1};
        int[] portalB = {0, 3};
        var result = ComputeFinalPosition(width, height, position, portalA, portalB, moves);
        System.out.println((result[0] + " " + result[1]));

    }
}

class B extends A {
}


