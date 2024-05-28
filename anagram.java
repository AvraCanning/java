import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String a="SATQ";
        String b="STAW";
        HashMap<Character,Integer> s=new HashMap<>();
for(int i=0;i<a.length();i++)
{
    s.put(a.charAt(i),1);
}int flag=0;
for(int i=0;i<a.length();i++)
{
    if(!s.containsKey(b.charAt(i))){
        flag=1;
break;
    }
}
if(flag==0)
System.out.println("ANAGRAM");
else
System.out.println("NOT ANAGRAM");
    }
}
