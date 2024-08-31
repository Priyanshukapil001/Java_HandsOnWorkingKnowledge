import java.util.*;
class Solution{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        Map<Character, Character> map = new HashMap();
        map.put('}', '{');
        map.put(']','[' );
        map.put(')', '(');

        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < input.length(); i++) {
                if(stack.isEmpty()){
                    stack.push(input.charAt(i));
                    continue;
                }
                if(map.get(input.charAt(i)) == null){
                    stack.push(input.charAt(i));
                }
                else if(stack.peek() == map.get(input.charAt(i))){
                    stack.pop();
                }
                else{
                    break;
                }
            }
            System.out.println(stack.isEmpty() ? "true": "false");
        }

    }
}



