public class StringProg4 {
    public static void main(String[] args) {
        String sentence="Raju is a good boy.*$%^";
        int consonants=0, vowel=0, SpecialCharacter=0;
        sentence=sentence.toLowerCase();
        for(int i=0; i<sentence.length(); ++i)
        {
            char word=sentence.charAt(i);

            if(word=='a' || word=='e' || word=='i' || word=='o' || word=='u')
            {
                ++vowel;
            }
            else if((word>='a' && word<='z'))
            {
                ++consonants;
            }
            else if(word>='*' && word<='^')
            {
                ++SpecialCharacter;
            }
    } 
    System.out.println(vowel);
    System.out.println(consonants);
    System.out.println(SpecialCharacter);
}
}

