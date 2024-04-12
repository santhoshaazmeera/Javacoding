public class numberStartIndex {
    public static void main(String[] args) {
        String[] input = {"we3", "ab674"};
        String[] output = incrementNumbers(input);
        
        for (String str : output) {
            System.out.println(str);
        }
    }

    public static String[] incrementNumbers(String[] input) {
        String[] output = new String[input.length];

        for (int i = 0; i < input.length; i++) {
            StringBuilder sb = new StringBuilder();
            boolean inNumber = false;
            int numberStartIndex = -1;

            for (int j = 0; j < input[i].length(); j++) {
                char c = input[i].charAt(j);
                if (Character.isDigit(c)) {
                    if (!inNumber) {
                        inNumber = true;
                        numberStartIndex = j;
                    }
                } else {
                    if (inNumber) {
                        System.out.println("else part inNumber"+inNumber);
                        String numberStr = input[i].substring(numberStartIndex, j);
                        int number = Integer.parseInt(numberStr) + 1;
                        sb.append(number);
                        System.out.println("sb is "+sb);
                        inNumber = false;
                    }
                    sb.append(c);
                }
            }
            if (inNumber) {
                System.out.println("else part inNumber last if "+inNumber);
                String numberStr = input[i].substring(numberStartIndex);
                int number = Integer.parseInt(numberStr) + 1;
                sb.append(number);
                System.out.println("sb is last if "+sb);
            }

            output[i] = sb.toString();
        }

        return output;
    }
}
