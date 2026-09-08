class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sk = new Stack<>();
        
        for (String c : tokens) {
            switch (c) {
                case "+" -> {
                    int a = sk.pop();
                    int b = sk.pop();
                    sk.push(b + a);
                }

                case "*" -> {
                    int a = sk.pop();
                    int b = sk.pop();
                    sk.push(b * a);
                }

                case "/" -> {
                    int a = sk.pop();
                    int b = sk.pop();
                    sk.push(b / a);
                }

                case "-" -> {
                    int a = sk.pop();
                    int b = sk.pop();
                    sk.push(b - a);
                }

                default -> {
                    sk.push(Integer.parseInt(c));
                }
            }
        }
        return sk.pop();
    }
}