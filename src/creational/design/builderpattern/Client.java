package creational.design.builderpattern;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Stack;

public class Client {

    public static String reverseString(int[] arr){
        int n=arr.length;
        String[] str = new String[n];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            str[i]= Integer.toString(arr[i]);
        }
        for(int i=0;i<n;i++){
            if(str[i].contains("1") && str[i].contains("2")
                    && str[i].contains("3")){
                if(i==n-1){
                    sb.append(str[i]);
                }else{
                    sb.append(str[i]+",");
                }

            }
        }
        String res=sb.toString();
        if(res.charAt(res.length()-1) == ','){
            return res.substring(0, res.length()-1);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        // BuilderPattern builder = new BuilderPattern();
       // BuilderPattern builder = ;
        //builder.setAge(20);
       // builder.setGradYear(2019);
      //  builder.setAttendance(90);
       // builder.setBatch("Morning");
        //builder.setPsp(80);
//    Student.BuilderPattern builder = Student.getBuilder();
//                                    builder.setName("Arpt")
//                                    .setAge(20)
//                                    .setAttendance(80)
//                                    .setGradYear(2019)
//                                    .setBatch("Morning")
//                                     .setExperience(12)
//                                     .setPsp(90).build();
//
        int[] arr = {2,123,12};
                System.out.print(reverseString(arr));

    }
}
