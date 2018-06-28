package com.example.fizzbuzzspring;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;


public class FizzBuzz {

    @Min(0)
    private int start;


    @Min(1)
    private int end;

    private ArrayList<String> print;


    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public ArrayList<String> getPrint() {
        return print;
    }

    public void setPrint(ArrayList<String> print) {
        this.print = print;
    }

    public ArrayList<String> makePrint ()
    {
        print=new ArrayList();
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0 && i % 3 != 0)
                print.add("Buzz");
            else if (i % 3 == 0 && i % 5 != 0)
                print.add("Fizz");
            else if (i % 15 == 0)
                print.add("Fizz Buzz");
            else
                print.add(Integer.toString(i));
        }
        return print;
    }
}

