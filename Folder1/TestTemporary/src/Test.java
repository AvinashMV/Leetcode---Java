public class Test {
    private String str;

    public Test(String str) {
        this.str = str;
    }

    public String reverse(String word){
        StringBuilder strbdler = new StringBuilder();
        strbdler.append(word);
        return strbdler.reverse().toString();
    }

    // Given a sentence of string, reverse each word.
    public void reverseSentence(){
        String [] words = str.split(" ");
        String rev = "";
        for(int i=0;i<words.length;i++) {
           // System.out.println(words[i]);
            rev += reverse(" "+words[i]);
        }
        System.out.println(str);
        System.out.println(rev);
    }
}
