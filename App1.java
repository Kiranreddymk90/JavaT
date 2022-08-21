import java.lang.reflect.Array;
import java.util.Arrays;

class StringOperations
{
    public String reverse(String name)
    {
        StringBuilder s=new StringBuilder();
        char[] s1=name.toCharArray();
        for(int i=name.length()-1;i>=0;i--)
        {
            s.append(s1[i]);
        }
        return s.toString();
    }
    public String reverseSen(String name) {
        StringBuilder s1=new StringBuilder();
        String[] s2=name.split(" ");
        for (String s : s2) {
            s1.append(reverse(s));
            s1.append(" ");
            
        }
        return s1.toString();
        
    }
    public void Anagram(String s1,String s2)
    {
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] s3=s1.toCharArray();
        char[] s4=s2.toCharArray();
        Arrays.sort(s3);
        Arrays.sort(s4);
        if(s1.length()!=s2.length())
        {
            System.out.println("Given strings are not Anagram");
        }
        else if(Arrays.equals(s3, s4))
        {
            System.out.println("Given strings are Anagram");
        }
        else
        {
            System.out.println("Given strings are not Anagram");
        }
    }
    public void pangram(String name) {
        name=name.toLowerCase();
        name=name.replaceAll(" ", "");
        StringBuilder sb3=new StringBuilder(); 

        if(name.length()<26){
            System.out.println("Given string is not pangram");
        }
        else
        {
            name=sb3.toString();
            name=mysort(name);
            int char_start_value=97; // "a" ASCII value
            boolean start=true;
            char ch=' ';
            System.out.println(name);
            for(int i=0;i<name.length();)
            {
                if(char_start_value>122  || ( char_start_value == 121 && name.charAt(i)=='z' )) // 122->"z" , covered all the alphabets
                {   // 2nd case is for last char when alphabets till y are covered and z is remaining at last location
                    System.out.println("Given string is pangram");
                }

                if(start==true)
                {
                    if(name.charAt(i)==char_start_value)
                    {
                        ch=name.charAt(i);
                        i++;
                        start=false;
                    }
                    else
                    {
                        System.out.println("Given string is not pangram");
                    }
                }
                else
                {
                    if(name.charAt(i)==ch)// same value as previous, like aabc
                    {
                        i++;
                    }
                    else // different value to previous, like abbc
                    {
                        char_start_value++;
                        if(name.charAt(i)==char_start_value) // when immediately found the next character
                        {
                            ch=name.charAt(i);
                            i++;
                        }
                        else // when immediate alpahbet in sequence is not found
                        {
                            System.out.println("Given string is not pangram");
                        }
                    }
                }
            }
        }
    }
    public  String mysort(String str)
    {
        char[] chars=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            char max=chars[0];
            int max_index=0;
            for(int j=0;j<str.length()-i;j++)
            {
                if(max<chars[j])
                {
                    max=chars[j];
                    max_index=j;
                }
            }
            // need to swap (last but x) and the max items
            chars[max_index]=chars[chars.length-1-i];
            chars[chars.length-1-i]=max;
        }
        return new String(chars);
    }
    public  String repeatedChars(String str)
    {
        StringBuilder sb4=new StringBuilder();
        str=mysort(str);
        char prev='a';
        for(int i=0;i<str.length();i++)
        {
            if(i==0)
            {
                prev=str.charAt(0);
            }
            else
            {
                if(str.charAt(i)==prev)
                {
                    sb4.append(str.charAt(i));
                }
                else
                {
                    prev=str.charAt(i);
                }
            }
        }

        return sb4.toString();
    }
    public  void VCCount(String str)
    {
        str=str.toLowerCase();
        int vowels=0;
        int consonants=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isAlphabetic(str.charAt(i)))
            {
                if( str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' )
                {
                    vowels++;
                }
                else
                {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels : "+vowels+" , Consonants : "+consonants);
    }
    public  int SpecialChars(String str)
    {
        str=str.replaceAll(" ", "");
        int counter=0;
        for(int i=0;i<str.length();i++)
        {
            if(!(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))))
            {
                counter++;
            }
        }
        return counter;
    }
 }
 





public class App1 {
    public static void main(String[] args) throws Exception {
        StringOperations s=new StringOperations();
       System.out.println(s.reverse("iNeuron"));
       System.out.println(s.reverseSen("think twice"));
       s.Anagram("madam","madamk");
       s.pangram("wdjhefkgfgdsfjg   ");
       System.out.println(s.mysort("krishna")); 
       System.out.println(s.repeatedChars("aerqoplane")); 
       s.VCCount("yellow"); 
       System.out.println(s.SpecialChars("krishna@6#%$^")); 
    }
}