import java.util.hashmap;
import setinterface.student;
{
public class hashmap demo
public static voidmain(string[]args)
{
student s1=new student("zara",21);
student s2=new student("rohit,21");
student s3=new student("ritu",23);
hashmap<string,student>hm=new hashmap<string,student>();
hm.put("s1",s1);
hm.put("s2",s2);
hm.put("s3",s3);
system.out.prinln(hm);
}
}