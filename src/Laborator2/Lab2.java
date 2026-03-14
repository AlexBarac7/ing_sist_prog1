package Laborator2;

import java.util.*;

public class Lab2 {
    public static void main (String[] args){
            List<Integer> x = new ArrayList();
            List<Integer> y = new ArrayList();
            List<Integer> xPlusY = new ArrayList(); //a
            Set<Integer> zSet = new TreeSet(); //b
            List<Integer> xMinusY = new ArrayList();//c
            List<Integer> Comune = new ArrayList();
            int p = 4;
            List<Integer> xPlusYLimitedByP = new ArrayList();
            Random rand = new Random();
            for (int i = 0; i < 5; i++) {
                x.add(rand.nextInt(10));
            }
            for (int j=0; j<7; j++){
                y.add(rand.nextInt(10));
            }
            System.out.println(x);
            System.out.println(y);
            Collections.sort(x);
            System.out.println(x);
            Collections.sort(y);
            System.out.println(y);
            xPlusY.addAll(x);
            xPlusY.addAll(y);
            Collections.sort(xPlusY);
            System.out.println(xPlusY);
            Comune.addAll(x);
            Comune.retainAll(y);
            zSet.addAll(Comune);
            System.out.println(zSet);
            xMinusY.addAll(x);
            xMinusY.removeAll(y);
            System.out.println(xMinusY);
            for (int i=0; i<xPlusY.size(); i++)
                if (xPlusY.get(i)< p)
                    xPlusYLimitedByP.add(xPlusY.get(i));
            System.out.println(xPlusYLimitedByP);
            System.out.println("teste");
        }
    }