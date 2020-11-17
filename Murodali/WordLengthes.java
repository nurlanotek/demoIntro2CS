package week5;
import java.util.ArrayList;
import java.util.Scanner;

public class WordLengthes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentance = input.nextLine();
        //sentance = sentance.replaceAll("\\p{Punct}","*");
        sentance = sentance.replace(".","");
        sentance = sentance.replaceAll("[0-9]","*");
        sentance= sentance.replace(")","");
        sentance = sentance.replace("]","");
        sentance =sentance.replace("[","");
        sentance =sentance.replace("(","");


        ArrayList<String> words = new ArrayList<>();
        Scanner lineScan = new Scanner(sentance);

        String str="";
        while(lineScan.hasNext()){
            words.add(lineScan.next());
        }

        for(int i = 0; i< words.size();i++){
            if(words.get(i).contains("*")){

                System.out.println(i+1 +": " + words.get(i).length()+"\t" + charCount(words.get(i)));
            }
            else{
                System.out.println(i+1 +": " + 0+"\t" + charCount(words.get(i)));
            }
        }
    }
    public static String charCount(String word){
        String str="";
        for(int i =0; i<word.length();i++){
            if (Character.toString(word.charAt(i)).equals("*")){
                return str;}
            else {
                str+="*";
            }

        }
        return str;
    }
}
