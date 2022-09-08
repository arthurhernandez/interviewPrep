public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}


        /**
        List<String> magazineLetterList = new ArrayList<>();
                
        for(int i = 0; i < magazine.length(); i++){
            magazineLetterList.add(magazine.substring(i,i+1));
        }
        
        for(int i = 0; i < ransomNote.length(); i++){
            
            if(!magazineLetterList.contains(ransomNote.substring(i,i+1)) || magazineLetterList.isEmpty()){
                return false;
            }else{
                magazineLetterList.remove(ransomNote.substring(i,i+1));
            }
            
        }
        return true;
        **/


class Solution {
    //add ransomNote
    
    public boolean canConstruct(String ransomNote, String magazine) {
        //if the note lengths are equal false and if both are 0 true
        if(ransomNote.length() > magazine.length()){
            return false;
        }
        if(ransomNote.length() == 0 && magazine.length() == 0){
            return true;
        }
        
        char[] ransomNoteChars = ransomNote.toCharArray();
        for(char ransomeCharecter:ransomNoteChars){  
            if(magazine.contains(Character.toString(ransomeCharecter))){
                magazine = magazine.replaceFirst(Character.toString(ransomeCharecter), "");
            }else{
                return false;
            }
        }
        return true;
    }
}
