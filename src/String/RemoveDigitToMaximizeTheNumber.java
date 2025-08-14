//package String;
//
//
//import java.util.AbstractList;
//import java.util.ArrayList;
//import java.util.List;
//
//// leetcode context
//public class RemoveDigitToMaximizeTheNumber {
//
//    public static void main(String[] args)
//    {
//        String str="551";
//        char d=
//        List<String> s=new ArrayList<>();
//        for(int i=0;i<str.length();i++)
//        {
//            if(str.charAt(i)=='1')
//            {
//                s.add(new String(str));
//            }
//        }
//        int maxs=Integer.MIN_VALUE;
//        for(int i=0;i<s.size();i++)
//        {
//            StringBuilder a= new StringBuilder(s.get(i));
//            for(int j=i;j<str.length();j++)
//            {
//                if(a.charAt(j)=='1')
//                {
//                    StringBuilder b=a.deleteCharAt(j);
//                    maxs=Math.max(maxs,Integer.parseInt(b.toString()));
//                    break;
//                }
//            }
//        }
//        System.out.println(maxs);
//    }
//
//}
