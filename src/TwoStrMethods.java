public class TwoStrMethods {
        public static void main(String[] args) {
            //String abcTest = "abc.";
            String abcTest = "abcapbc";
            System.out.println(abcTest(abcTest));

            String alternateWords = alternateStrings("nice", "there");
            System.out.println(alternateWords);
        }
        public static boolean abcTest(String str){
            if(str.length() > 2) {
                if (str.substring(0, 3).equals("abc")) return true;
                if (str.contains("abc")) {
                    int index = str.indexOf("abc");
                    int i = 0;
                    if (index == 0) i = 3;
                    for (; i < str.length() - 3; ) {
                        index = str.indexOf("abc", i);
                        if (index == -1) return false;
                        if (!(str.substring(index - 1, index).equals("."))) {
                            return true;
                        }
                        i = index + 3;
                    }
                }
            }
            return false;
        }

        public static String alternateStrings(String str1, String str2){
            String output = "";
            for(int i = 0; i < str1.length() + str2.length(); i++){
                if(i < str1.length()) output += str1.substring(i, i + 1);
                if(i < str2.length()) output += str2.substring(i, i + 1);
            }
            return output;
        }
    }
