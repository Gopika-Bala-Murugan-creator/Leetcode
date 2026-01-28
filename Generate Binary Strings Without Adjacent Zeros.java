class Solution {
    List<String> result;
    public List<String> validStrings(int n) {
        result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(sb, n);
        return result;
    }

    private void dfs(StringBuilder sb, int n){
        if(sb.length()==n){
            result.add(sb.toString());
            return;
        }
        sb.append("1");
        dfs(sb,n);
        sb.deleteCharAt(sb.length()-1);

        if(sb.length()==0||sb.charAt(sb.length()-1)=='1'){
            sb.append("0");
            dfs(sb,n);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}