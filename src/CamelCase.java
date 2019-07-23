public class CamelCase {
    public int camelCaseWords(String word){
        int count = 0;
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
           // String s = String.valueOf(arr[i]);
            if (Character.isUpperCase(arr[i])){
                count++;
            }
        }

        return count+1;
    }

    public static void main(String[] args) {
        CamelCase camelCase = new CamelCase();
        System.out.println(camelCase.camelCaseWords("saveChangesInTheEditor"));
    }
}
