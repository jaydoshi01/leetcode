class Solution {
  public int romanToInt(String s) {
    HashMap<String, Integer> table = new HashMap<>();
    table.put("I",1);
    table.put("V",5);
    table.put("X",10);
    table.put("L",50);
    table.put("C",100);
    table.put("D",500);
    table.put("M",1000);
    int num = 0;
     
    for(int i = s.length() - 1; i >= 0; i--)
      if (i == s.length() - 1 || table.get(Character.toString(s.charAt(i))) >= table.get(Character.toString(s.charAt(i+1))))
           num += table.get(Character.toString(s.charAt(i)));
      else num -= table.get(Character.toString(s.charAt(i)));
    
    return num;
  }
}