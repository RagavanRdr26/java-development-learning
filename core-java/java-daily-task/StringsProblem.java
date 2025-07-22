import java.util.Arrays;

class Methods {

    static void revWords(String str){
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String revWord ="";
            for (int j = 0; j < arr[i].length(); j++) {
                String word = arr[i];
                revWord+=word.charAt(arr[i].length()-1-j);
            }
            arr[i]=revWord;
        }
        System.out.println(String.join(" ",arr));
    }

    static void removeVov(String str){
       String removeLow= str.replace("a","").replace("e","").replace("i","").replace("o","").replace("u","");
       String removeUp= removeLow.replace("A","").replace("E","").replace("I","").replace("O","").replace("U","");
        System.out.println(removeUp);
    }

    static int[] arrMap(String str){
        String upStr = str.toUpperCase();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int index = upStr.charAt(i);
            if(index>=65&&index<=90){
                arr[index - 65]++;
            }
        }
        return arr;
    }

    static void anagram(int[] arr1, int[] arr2){
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not Anagram");
        }
    }

    static void maxFrequency(String str){
        int[] arr = arrMap(str);
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for (int i = 0; i < 26; i++) {
            if(arr[i]==max){
                System.out.println((char) (i+65) + " is a frequent Character");
            }
        }


    }

    public static void main(String[] args) {

        revWords("java is a program");
        removeVov("hey hi all here");
        anagram(arrMap("silent"),arrMap("listen"));
        maxFrequency("iii aaa gg sss b jj kk");
    }
}