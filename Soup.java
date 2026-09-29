//Wren Hanscom
//This program will create alphabet soup and then form words in said soup which are related to a company
public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="";
        company = "none";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //Precondition: there is a given word as an input
    //Postcondition: there is the given word added onto the anything currently stored in the letters string
    public void add(String word){
        letters = letters+word;
    }


    //precondition: there is a character in the letters string
    //postcondition: a random letter is returned from the string letters
    public char randomLetter(){
        char a = letters.charAt((int)(Math.random()*letters.length()));
        return a ;
    }


    //precondition: there is a company in the company string
    //postcondition:the letters string is returned with a companies name in the middle of it
    public String companyCentered(){
        String first = letters.substring(0, ((int)(letters.length()/2)));
        String last = letters.substring(((int)(letters.length()/2)));
        return first +company+last;
    }


    //precondition: the letters variable has characters in its string along with one vowel being present among them
    // postcondition: the first vowel in the letters string is no longer there
    public void removeFirstVowel(){
        letters = letters.replaceFirst("[aeiouAEIOU]","");
    }

    //Precondition: there is a given number which is no higher then the length of the string letters
    //postcondition: there is the given number fewer letters stored in letters taken from a random place in the letters string
    public void removeSome(int num){
        int index = (int)(Math.random()*(letters.length()-num));
        String first2 = letters.substring(0,index);
        String last2 = letters.substring(index+num, letters.length());
        letters = first2+last2;
    }

    //Precondition: there is a given word which exists in the string letters
    //postcondition: the given word is no longer stored in the string letters.
    public void removeWord(String word){
        String first3 = letters.substring(0,letters.indexOf(word));
        String last3 = letters.substring((letters.indexOf(word)+word.length()));
        letters = first3+last3;
    }
}
