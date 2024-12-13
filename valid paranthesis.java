class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char t:s.toCharArray()){
            if(t=='('){
              st.push(')');
            }
            else if(t=='{'){
                st.push('}');
            }
            else if(t=='['){
                st.push(']');
            }
            else if(st.empty()||st.pop()!=t){
                return false;
            }
           
            
        }
        if(st.empty()){
            return true;
        }
        return false;
    }
}