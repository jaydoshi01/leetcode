class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int j=0;
        String type;
        String color;
        String name;

        for(int i=0;i<items.size();i++)
        {
                if(ruleKey.equals("type"))
                {
                    if(items.get(i).get(j).equals(ruleValue))
                    {
                        count++;
                    }
                }
                if(ruleKey.equals("color"))
                {
                    if(items.get(i).get(j+1).equals(ruleValue))
                    {
                        count++;
                    }
                }
                if(ruleKey.equals("name"))
                {
                    if(items.get(i).get(j+2).equals(ruleValue))
                    {
                        count++;
                    }
                }
            
        }
return count;
            
    }
}