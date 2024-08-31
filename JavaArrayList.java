import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaArrayList {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<List<Integer>> listofList=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<d;j++){
                list.add(sc.nextInt());
            }
            listofList.add(list);
        }
        int q=sc.nextInt();
        for(int l=0;l<q;l++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            try{
                System.out.println(listofList.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }}
